package com.vti.QLNV.service;

import com.vti.QLNV.entity.Department;
import com.vti.QLNV.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.getAllDepartments();
    }

    @Override
    public String createDepartment(Department department) {
        departmentRepository.createDepartment(department);
        return "Department created";
    }

    @Override
    public String updateDepartment(Department department) {
        departmentRepository.updateDepartment(department);
         return "Department updated";
    }

    @Override
    public String deleteDepartmentById(Integer departmentId) {
        departmentRepository.deleteDepartmentById(departmentId);
         return "Department deleted";
    }
}
