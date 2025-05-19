package com.vti.demo.repository;

import com.vti.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

@Query(value = "Select a From Department a where a.departmnetName = :DepartmentName ",nativeQuery = true)
    Department findDepartmentId(@Param("DepartmentName") String DepartmentName);

    Department findByDepartmentName(String departmentName);
}
