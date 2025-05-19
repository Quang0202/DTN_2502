package com.vti.demo.service;

import com.vti.demo.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getAllDepartment();
    Department getDepartmentById(int id);
    Department updateDepartment(Department department);
    Department createDepartment(Department department);
    void deleteDepartment(int id);
}
