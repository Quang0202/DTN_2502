package com.vti.demo.repository;

import com.vti.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

@Query(value = "Select a From Department a where a.departmnetName = :DepartmentName ",nativeQuery = true)
    Department findDepartmentId(@Param("DepartmentName") String DepartmentName);

    Department findByDepartmentName(String departmentName);


    //Thống kê mỗi phòng ban có bao nhiêu nhân viên


    @Query("""
SELECT d AS department , COUNT(a.AccountId) AS SL from Department d
LEFT JOIN d.accounts a 
GROUP BY d.departmentID
ORDER BY d.departmentName DESC 

""")
    List<Objects> getDepartmentCountAccount();

}
