package com.vti.testingsytem.repository;

import com.vti.testingsytem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
    boolean existsByDepartmentName(String departmentName);

    @Query("""
            SELECT d.departmentName AS department, COUNT(a.accountId) AS count FROM Department d 
            LEFT JOIN d.accounts a 
            GROUP BY d.departmentId
            ORDER BY d.departmentName ASC 
            """)
    List<Object> getDepartmentCountAccount();
}
