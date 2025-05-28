package com.example.TestingSystem.repositories;

import com.example.TestingSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IDepartmentRepository extends JpaRepository<Department, Short> {
    boolean existsByDepartmentName(String name);

    Optional<Department> findByDepartmentName(String name);
}
