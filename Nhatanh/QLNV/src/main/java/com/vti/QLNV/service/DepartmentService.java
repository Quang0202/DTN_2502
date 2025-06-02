package com.vti.QLNV.service;

import com.vti.QLNV.entity.Account;
import com.vti.QLNV.entity.Department;
import com.vti.QLNV.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Page<Department> getAllDepartments(Pageable pageable) {
        Page<Department> pagedResult =  departmentRepository.findAll(pageable);
        if(pagedResult.hasContent()) {
            return pagedResult;
        } else {
            return null;
        }
    }

    @Override
    public String createDepartment(Department department) {
        departmentRepository.save(department);
        return "Department created";
    }

    @Override
    public String updateDepartment(Department department) {
        departmentRepository.save(department);
         return "Department updated";
    }

    @Override
    public String deleteDepartmentById(Integer departmentId) {
        departmentRepository.deleteById(departmentId);
         return "Department deleted";
    }
}
