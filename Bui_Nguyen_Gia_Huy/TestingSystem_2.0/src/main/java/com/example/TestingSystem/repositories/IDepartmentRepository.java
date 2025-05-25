package com.example.TestingSystem.repositories;

import com.example.TestingSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department, Short> {
}
