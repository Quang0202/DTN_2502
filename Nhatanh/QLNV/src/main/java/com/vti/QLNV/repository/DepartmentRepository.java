package com.vti.QLNV.repository;

import com.vti.QLNV.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {


    boolean existsByDepartmentName(String departmentName);

    Department findByDepartmentName(String departmentName);
}
