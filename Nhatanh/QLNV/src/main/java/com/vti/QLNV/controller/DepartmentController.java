package com.vti.QLNV.controller;

import com.vti.QLNV.entity.Department;
import com.vti.QLNV.service.DepartmentService;
import com.vti.QLNV.service.IDepartmentService;
import com.vti.QLNV.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public ResponseEntity<Page<Department>> getAllDepartment(@RequestParam(defaultValue = "0") Integer pageNo,
                                                             @RequestParam(defaultValue = "10") Integer pageSize,
                                                             @RequestParam(defaultValue = "departmentId") String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        return ResponseEntity.ok(service.getAllDepartments(paging));
    }

}
