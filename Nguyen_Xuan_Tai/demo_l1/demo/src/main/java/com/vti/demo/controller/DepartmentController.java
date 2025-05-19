package com.vti.demo.controller;

import com.vti.demo.entity.Department;
import com.vti.demo.repository.IDepartmentRepository;
import com.vti.demo.service.DepartmentService;
import com.vti.demo.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {
    @Autowired
    private IDepartmentRepository departmentRepository;


    @GetMapping()
    public List<Department> getAllDepartment() {
       return departmentRepository.findAll();
    }

    @PostMapping("/create")
    public void createDepartment(@RequestBody Department department) {
         departmentRepository.save(department);
    }

    @PutMapping("/update")
    public void updateDepartment(@RequestBody Department department) {
         departmentRepository.save(department);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable int id ) {
        departmentRepository.deleteById(id);
    }

    @PutMapping("/{departmentName}")
    public  Department findByDepartmentName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }
}
