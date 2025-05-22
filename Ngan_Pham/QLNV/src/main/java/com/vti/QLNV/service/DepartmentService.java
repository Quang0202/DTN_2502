package com.vti.QLNV.service;

import com.vti.QLNV.entity.Department;
import com.vti.QLNV.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phòng ban với ID = " + id));
    }

    @Override
    public Department createDepartment(Department department) {
        if (department.getDepartmentName() == null || department.getDepartmentName().isBlank()) {
            throw new IllegalArgumentException("Tên phòng ban không được để trống.");
        }
        if (departmentRepository.existsByDepartmentName(department.getDepartmentName())) {
            throw new IllegalArgumentException("Phòng ban đã tồn tại!");
        }
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(int id, Department updatedDepartment) {
        Department existing = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phòng ban với ID = " + id));

        if (updatedDepartment.getDepartmentName() == null || updatedDepartment.getDepartmentName().isBlank()) {
            throw new IllegalArgumentException("Tên phòng ban không được để trống.");
        }

        existing.setDepartmentName(updatedDepartment.getDepartmentName());
        return departmentRepository.save(existing);
    }

    @Override
    public void deleteDepartmentById(int id) {
        Department existing = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phòng ban với ID = " + id));
        departmentRepository.delete(existing);
    }
}
