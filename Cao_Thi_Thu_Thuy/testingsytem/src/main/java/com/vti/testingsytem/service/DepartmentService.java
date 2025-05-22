package com.vti.testingsytem.service;

import com.vti.testingsytem.entity.Department;
import com.vti.testingsytem.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DepartmentService implements IDepartmentService{

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department createDepartment(Department department) {
        if (departmentRepository.existsByDepartmentName(department.getDepartmentName())) {
            throw new IllegalArgumentException("Phòng ban đã tồn tại!");
        }
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(int id, Department updatedDepartment) {
        Department existing = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phòng ban với ID = " + id));
        if (departmentRepository.existsByDepartmentName(updatedDepartment.getDepartmentName())) {
            throw new IllegalArgumentException("Tên phòng ban đã tồn tại!");
        }
        existing.setDepartmentName(updatedDepartment.getDepartmentName());
        return departmentRepository.save(existing);
    }

    @Override
    public void deleteById(int id) {
        Department existing = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phòng ban với id = " + id));
        departmentRepository.deleteById(id);
    }

}
