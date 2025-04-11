package vti.accountmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vti.accountmanagement.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findByDepartmentId(int id);
    Department findByDepartmentName(String name);
    Department findByDepartmentNameAndDepartmentIdNot(String name, int id);
}
