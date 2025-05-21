package com.vti.assignment3.service;

import com.vti.assignment3.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department createDepartment(Department department);
    Department updateDepartment(Integer id, String newName);
    void deleteDepartment(Integer id);
}
