package com.vti.hello.controller;

import com.vti.hello.entity.Department;
import com.vti.hello.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

    @Autowired
    private IDepartmentRepository repository;

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    @PostMapping("/create")
    public void createDepartment(@RequestBody Department department) {
        repository.save(department);
    }

    @PutMapping("/update/{id}")
    public void updateDepartment(@PathVariable int id, @RequestParam String newDepartmentName) {
        Department department = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department Not Found!"));
        department.setDepartmentName(newDepartmentName);
        repository.save(department);
    }

    @DeleteMapping("/delete")
    public void deleteDepartment(@RequestBody Department department) {
        repository.delete(department);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable int id) {
        repository.deleteById(id);
    }
}
