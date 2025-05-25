package com.vti.testingsytem.service;

import com.vti.testingsytem.dto.DepartmentDTO;
import com.vti.testingsytem.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDepartmentService {
    Department getDepartmentById(int id);
    List<Department> getAll();
    Department createDepartment(Department department);
    Department updateDepartment(int id, Department updatedDepartment);
    void deleteById(int id);
    List<Object> getDepartmentCountAccount();
    Page<DepartmentDTO> getAll(Pageable pageable);
}
