package com.vti.QLNV.service;

import com.vti.QLNV.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(int id);
    Department createDepartment(Department department);
    Department updateDepartment(int id, Department department);
    void deleteDepartmentById(int id);
}
