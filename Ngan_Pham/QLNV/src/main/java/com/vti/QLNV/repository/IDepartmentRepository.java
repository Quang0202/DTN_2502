package com.vti.QLNV.repository;

import com.vti.QLNV.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
    boolean existsByDepartmentName(String departmentName);
}
