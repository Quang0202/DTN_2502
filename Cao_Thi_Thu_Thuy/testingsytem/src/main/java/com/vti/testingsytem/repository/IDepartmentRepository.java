package com.vti.testingsytem.repository;

import com.vti.testingsytem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
    boolean existsByDepartmentName(String departmentName);
}
