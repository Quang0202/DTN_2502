package com.example.TestingSystem.controllers;

import com.example.TestingSystem.dto.CreateDepartmentDTO;
import com.example.TestingSystem.dto.DepartmentDTO;
import com.example.TestingSystem.entity.Department;
import com.example.TestingSystem.services.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<DepartmentDTO> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping
    public DepartmentDTO createDepartment(@RequestBody CreateDepartmentDTO createDepartmentDTO) {
        return departmentService.createDepartment(createDepartmentDTO);
    }

    @PutMapping("/{id}")
    public DepartmentDTO updateDepartment(@PathVariable Short id, @RequestBody CreateDepartmentDTO createDepartmentDTO) {
        return departmentService.updateDepartment(id, createDepartmentDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Short id) {
        departmentService.deleteDepartment(id);
    }
}
