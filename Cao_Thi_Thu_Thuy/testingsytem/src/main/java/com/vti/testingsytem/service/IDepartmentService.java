package com.vti.testingsytem.service;

import com.vti.testingsytem.entity.Department;

import java.util.List;

public interface IDepartmentService {
    Department getDepartmentById(int id);
    List<Department> getAll();
    Department createDepartment(Department department);
    Department updateDepartment(int id, Department updatedDepartment);
    void deleteById(int id);
}
