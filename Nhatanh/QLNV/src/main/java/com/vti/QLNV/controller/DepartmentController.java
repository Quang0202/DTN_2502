package com.vti.QLNV.controller;

import com.vti.QLNV.entity.Department;
import com.vti.QLNV.service.DepartmentService;
import com.vti.QLNV.service.IDepartmentService;
import com.vti.QLNV.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/department/v1")
public class DepartmentController {

    @Autowired
    private IDepartmentService service;

    public DepartmentController(DepartmentService service){
        this.service = service;
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createDepartment(@RequestBody Department request) {
        return ResponseEntity.ok(service.createDepartment(request));
    }

    @DeleteMapping(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteDepartment(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.deleteDepartmentById(id));
    }

    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateDepartment(@RequestBody Department request) {
        return ResponseEntity.ok(service.createDepartment(request));
    }

    @GetMapping()
    public ResponseEntity<List<Department>> createDepartment() {
        return ResponseEntity.ok(service.getAllDepartments());
    }

}
