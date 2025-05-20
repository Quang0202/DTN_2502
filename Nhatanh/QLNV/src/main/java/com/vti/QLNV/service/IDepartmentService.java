package com.vti.QLNV.service;

import com.vti.QLNV.entity.Department;
import java.util.List;

public interface IDepartmentService {
    List<Department> getAllDepartments();

    String createDepartment(Department department);

    String updateDepartment(Department department);

    String deleteDepartmentById(Integer departmentId);

}
