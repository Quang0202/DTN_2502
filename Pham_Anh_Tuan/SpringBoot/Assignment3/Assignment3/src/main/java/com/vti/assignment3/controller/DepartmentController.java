package com.vti.assignment3.controller;

import com.vti.assignment3.entity.Department;
import com.vti.assignment3.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }

    // Create new department
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return service.createDepartment(department);
    }

    // Update department name
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable int id, @RequestParam String newName) {
        return service.updateDepartment(id, newName);
    }

    // Delete department
    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable int id) {
        service.deleteDepartment(id);
    }
}
