package com.vti.helloworld.repository;

import com.vti.helloworld.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;;

public interface IDepartmentRepository extends JpaRepository<Department,Integer> {
}
