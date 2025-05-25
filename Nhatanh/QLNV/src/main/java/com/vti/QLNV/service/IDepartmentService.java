package com.vti.QLNV.service;

import com.vti.QLNV.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDepartmentService {
    Page<Department> getAllDepartments(Pageable pageable);

    String createDepartment(Department department);

    String updateDepartment(Department department);

    String deleteDepartmentById(Integer departmentId);

}
