package com.vti.helloworld.controller;

import com.vti.helloworld.DTO.DepartmentDTO;
import com.vti.helloworld.entity.Department;
import com.vti.helloworld.repository.IDepartmentRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/department")
public class DepartmentController {
    @Autowired
    private IDepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    public Page<DepartmentDTO> getDepartments(Pageable pageable) {
        Page<Department> page = departmentRepository.findAll(pageable);
        List<DepartmentDTO> departmentDTOS = modelMapper.map(page.getContent(), new TypeToken<List<DepartmentDTO>>(){}.getType());
return new PageImpl<>(departmentDTOS, pageable,page.getTotalElements());

    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return departmentRepository.findById(id).orElse(null);
    }

    @GetMapping("/exists/{id}")
    public boolean existsDepartmentById(@PathVariable int id){
        return departmentRepository.existsById(id);
    }

    @PostMapping("/update")
    public void createOrUpdateDepartment(@RequestBody Department department){
        departmentRepository.save(department);
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
