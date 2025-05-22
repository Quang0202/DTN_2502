package com.vti.assignment3.service.impl;

import com.vti.assignment3.entity.Department;
import com.vti.assignment3.repository.DepartmentRepository;
import com.vti.assignment3.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Integer id, String newName) {
        Department dept = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department not found"));
        dept.setDepartmentName( newName);
        return departmentRepository.save(dept);
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }
}
