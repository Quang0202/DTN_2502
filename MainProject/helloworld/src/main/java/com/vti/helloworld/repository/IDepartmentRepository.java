package com.vti.helloworld.repository;

import com.vti.helloworld.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDepartmentRepository extends JpaRepository<Department,Integer> {
    Department findByDepartmentName(String departmentName);

    List<Department> findByDepartmentIdGreaterThan(int number);
    List<Department> findByDepartmentNameContainingOrderByDepartmentNameDesc(String str);

    @Query("SELECT a FROM Department a WHERE a.departmentName = :departmentName")
    Department findByDepartmentName2(@Param("departmentName") String departmentName);

    // Thống kê mỗi phòng ban có bao nhiêu nhân viên.
    @Query("""
            SELECT d AS department, COUNT(a.accountId) AS SL  FROM Department d
            LEFT JOIN d.accounts a 
            GROUP BY d.departmentId
            ORDER BY SL DESC
            """)
    List<Object> getDepartmentCountAccount();

    @Modifying
    @Query("DELETE FROM Department d WHERE d.departmentId =?1")
    void deleteDepartmentById(int id);

    boolean existsByDepartmentName(String name);




    // find | read | get | query | count | delete | exists + By + Property + Operation  + OrderBy
    //Operation: GreaterThan, LessThan,Between, Like, StartingWith, EndingWith, Containing, IsNull, IsNotNull
    // OrderBy: OrderBy + Property+ Asc/Desc
}
