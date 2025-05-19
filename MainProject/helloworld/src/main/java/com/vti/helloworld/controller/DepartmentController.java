package com.vti.helloworld.controller;

import com.vti.helloworld.entity.Department;
import com.vti.helloworld.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
    @Autowired
    private IDepartmentRepository departmentRepository;

    @GetMapping("/")
    public ResponseEntity<?> getAllDepartment(){
        return ResponseEntity.ok(departmentRepository.findAll());
    }
}
