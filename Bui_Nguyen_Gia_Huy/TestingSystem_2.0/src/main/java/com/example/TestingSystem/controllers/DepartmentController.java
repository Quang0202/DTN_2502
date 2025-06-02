package com.example.TestingSystem.controllers;

import com.example.TestingSystem.dto.CreateDepartmentDTO;
import com.example.TestingSystem.dto.DepartmentDTO;
import com.example.TestingSystem.entity.Department;
import com.example.TestingSystem.services.DepartmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
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

//    @GetMapping
//    public List<DepartmentDTO> getAllDepartments() {
//        return departmentService.getAllDepartments();
//    }

    @GetMapping
    public ResponseEntity<Page<DepartmentDTO>> getAllDepartments(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "departmentID") String sortBy,
            @RequestParam(defaultValue = "asc") String sortOrder) {

        Sort sort = sortOrder.equalsIgnoreCase("asc") ?
                Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<DepartmentDTO> departments = departmentService.getAllDepartments(pageable);

        return new ResponseEntity<>(departments, HttpStatus.OK);
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
