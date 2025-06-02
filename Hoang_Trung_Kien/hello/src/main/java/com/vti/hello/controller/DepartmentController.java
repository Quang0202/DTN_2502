package com.vti.hello.controller;

import com.vti.hello.entity.Department;
import com.vti.hello.repository.IDepartmentRepository;
import com.vti.hello.request.DepartmentRequestForm;
import com.vti.hello.specification.DepartmentSpecification;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IDepartmentRepository repository;

    @GetMapping("/")
    public Page<Department> getAllDepartments(Pageable pageable, @RequestParam(value = "search", required = false) String value ) {

        Specification<Department> where = Specification.where(DepartmentSpecification.searchByDepartmentName(value));

        Page<Department> departments = repository.findAll(where, pageable);
        return departments;
    }

    @PostMapping("/create")
    public void createOrUpdateDepartment(@RequestBody DepartmentRequestForm departmentRequestForm) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        Department department = modelMapper.map(departmentRequestForm, Department.class);
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
