package com.vti.helloworld.service;

import com.vti.helloworld.entity.Department;
import com.vti.helloworld.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
    private IDepartmentRepository repository;

    @Override
    public boolean isDepartmentExistsByName(String name) {
        return repository.existsByDepartmentName(name);
    }
}
