package com.example.TestingSystem.services;

import com.example.TestingSystem.dto.CreateDepartmentDTO;
import com.example.TestingSystem.dto.DepartmentDTO;
import com.example.TestingSystem.entity.Department;
import com.example.TestingSystem.repositories.IDepartmentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    private final IDepartmentRepository IDepartmentRepository;

    public DepartmentService(IDepartmentRepository IDepartmentRepository) {
        this.IDepartmentRepository = IDepartmentRepository;
    }

    private DepartmentDTO departmentDTO(Department department) {
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setDepartmentID(department.getDepartmentID());
        departmentDTO.setDepartmentName(department.getDepartmentName());
        return departmentDTO;
    }

//    public List<DepartmentDTO> getAllDepartments() {
//        return IDepartmentRepository.findAll(Sort.by("departmentID")).stream()
//                .map(this::departmentDTO)
//                .collect(Collectors.toList());
//    }

    public Page<DepartmentDTO> getAllDepartments(Pageable pageable) {
        Page<Department> departments = IDepartmentRepository.findAll(pageable);
        return departments.map(this::departmentDTO);
    }

    public DepartmentDTO createDepartment(CreateDepartmentDTO createDepartmentDTO) {
        Department department = new Department();
        department.setDepartmentName(createDepartmentDTO.getDepartmentName());
        return departmentDTO(IDepartmentRepository.save(department));
    }

    public DepartmentDTO updateDepartment(Short id, CreateDepartmentDTO createDepartmentDTO) {
        Optional<Department> optional = IDepartmentRepository.findById(id);
        if (optional.isEmpty()) return null;

        Department department = optional.get();
        department.setDepartmentName(createDepartmentDTO.getDepartmentName());

        return departmentDTO(IDepartmentRepository.save(department));
    }

    public void deleteDepartment(Short departmentId) {
        IDepartmentRepository.deleteById(departmentId);
    }

}
