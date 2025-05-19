package com.vti.helloworld.repository;

import com.vti.helloworld.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface IDepartmentRepository extends JpaRepository<Department,Integer> {
    Department findByDepartmentName(String departmentName);

    List<Department> findByDepartmentIdGreaterThan(int number);
    List<Department> findByDepartmentNameContainingOrderByDepartmentNameDesc(String str);

    @Query("SELECT a FROM Department a WHERE a.departmentName = :departmentName")
    Department findByDepartmentName2(@Param("departmentName") String departmentName);



    // find | read | get | query | count | delete | exists + By + Property + Operation  + OrderBy
    //Operation: GreaterThan, LessThan,Between, Like, StartingWith, EndingWith, Containing, IsNull, IsNotNull
    // OrderBy: OrderBy + Property+ Asc/Desc
}
