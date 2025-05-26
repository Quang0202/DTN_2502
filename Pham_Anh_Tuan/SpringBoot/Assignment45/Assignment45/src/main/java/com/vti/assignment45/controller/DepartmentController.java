package com.vti.assignment45.controller;

import com.vti.assignment45.DTO.DepartmentDTO;
import com.vti.assignment45.entity.Department;
import com.vti.assignment45.repository.DepartmentRepository;
import com.vti.assignment45.specification.DepartmentSpecification;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public Page<DepartmentDTO> getAllDepartments(
            @RequestParam(value = "name", required = false) String name,
            Pageable pageable) {

        Specification<Department> spec = DepartmentSpecification.searchByName(name);
        Page<Department> departments = departmentRepository.findAll(spec, pageable);

        return departments.map(department -> modelMapper.map(department, DepartmentDTO.class));
    }
}
