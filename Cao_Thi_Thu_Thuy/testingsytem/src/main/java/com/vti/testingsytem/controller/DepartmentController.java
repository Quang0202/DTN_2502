package com.vti.testingsytem.controller;

import com.vti.testingsytem.entity.Department;
import com.vti.testingsytem.repository.IDepartmentRepository;
import com.vti.testingsytem.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @GetMapping("/list")
    public ResponseEntity<?> getAllDepartments(){
        return ResponseEntity.ok(departmentService.getAll());
    }

    @GetMapping("")
    public ResponseEntity<?> getDepartmentById(@RequestParam("departmentId") int id){
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createDepartment(@RequestBody Department department){
        Department created = departmentService.createDepartment(department);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Department> updateDepartment(
            @PathVariable Integer id,
            @RequestBody Department updatedDepartment) {

        Department result = departmentService.updateDepartment(id, updatedDepartment);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Integer id) {
        departmentService.deleteById(id);
        return ResponseEntity.ok("Xoá phòng ban thành công.");
    }
}
