package com.vti.helloworld.controller;

import com.vti.helloworld.DTO.DepartmentDTO;
import com.vti.helloworld.entity.Account;
import com.vti.helloworld.entity.Department;
import com.vti.helloworld.entity.Position;
import com.vti.helloworld.repository.IAccountRepository;
import com.vti.helloworld.repository.IDepartmentRepository;
import com.vti.helloworld.request.DepartmentRequestForm;
import jakarta.persistence.Access;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/v1/department")
public class DepartmentController {
    @Autowired
    private IDepartmentRepository departmentRepository;

    @Autowired
    private IAccountRepository accountRepository;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    public Page<DepartmentDTO> getAllDepartment(Pageable pageable){
        Page<Department> page = departmentRepository.findAll(pageable);
        List<DepartmentDTO> departmentDTOS = modelMapper.map(page.getContent(), new TypeToken<List<DepartmentDTO>>(){}.getType());
        return new PageImpl<>(departmentDTOS,pageable,page.getTotalElements());
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return departmentRepository.findById(id).orElse(null);
    }

    @GetMapping("/exists/{id}")
    public boolean existsDepartmentById(@PathVariable int id){
        return departmentRepository.existsById(id);
    }

    @PostMapping(value = "/update")
    @Transactional
    public void createOrUpdateDepartment(@RequestBody @Valid DepartmentRequestForm departmentForm){
            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
            Department departmentEntity = modelMapper.map(departmentForm, Department.class);
            Department department= departmentRepository.save(departmentEntity);
            departmentEntity.setDepartmentName("New departmentName");
            List<Account> accounts = departmentEntity.getAccounts();
            for(int i=0;i<accounts.size();i++){
                accounts.get(i).setDepartment(department);
                accounts.get(i).setPosition(new Position(departmentForm.getAccounts().get(i).getPositionId()));
            }
            accountRepository.saveAll(accounts);
    }

    @DeleteMapping("/delete")
    public void deleteDepartment(@RequestBody Department department){
        departmentRepository.delete(department);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteDepartmentById(@PathVariable int id){
        departmentRepository.deleteById(id);
    }

    @GetMapping("/name")
    public Department getDepartmentByName(@RequestParam String departmentName){
        return departmentRepository.findByDepartmentName(departmentName);
    }
    @GetMapping("/name/contain")
    public List<Department> getDepartmentByNameContain(@RequestParam String str){
        return departmentRepository.findByDepartmentNameContainingOrderByDepartmentNameDesc(str);
    }

    @GetMapping("/count/account")
    @Transactional
    public List<Object> getDepartmentCountAccount(){
        return departmentRepository.getDepartmentCountAccount();
    }


}
