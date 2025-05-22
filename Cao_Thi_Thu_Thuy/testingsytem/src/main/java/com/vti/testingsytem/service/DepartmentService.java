package com.vti.testingsytem.service;

import com.vti.testingsytem.dto.DepartmentDTO;
import com.vti.testingsytem.entity.Department;
import com.vti.testingsytem.repository.IDepartmentRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService{

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

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

    @Override
    public List<Object> getDepartmentCountAccount() {
        return departmentRepository.getDepartmentCountAccount();
    }

    @Override
    public Page<DepartmentDTO> getAll(Pageable pageable) {
        Page<Department> departments = departmentRepository.findAll(pageable);
        List<DepartmentDTO> departmentDTOS = modelMapper.map(departments.getContent(), new TypeToken<List<DepartmentDTO>>(){}.getType());
        Page<DepartmentDTO> page = new PageImpl<>(departmentDTOS, pageable, departments.getTotalElements());
        return page;
    }

}
