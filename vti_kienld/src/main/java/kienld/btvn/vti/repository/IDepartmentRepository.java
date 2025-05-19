package kienld.btvn.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kienld.btvn.vti.entity.Department;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
