package com.vti.helloworld.controller;

import com.vti.helloworld.entity.Department;
import com.vti.helloworld.repository.IDepartmentRepository;
import com.vti.helloworld.service.HelloWorldService;
import com.vti.helloworld.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/department")
public class DepartmentController {
    @Autowired
    private IDepartmentRepository departmentRepository;

    @GetMapping("/")
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
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


}
