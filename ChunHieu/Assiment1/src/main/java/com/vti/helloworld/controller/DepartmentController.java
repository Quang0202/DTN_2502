package com.vti.helloworld.controller;

import com.vti.helloworld.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/")
    public ResponseEntity<?> getAllDepartments() {
        return ResponseEntity.ok(departmentRepository.findAll());
    }
}
