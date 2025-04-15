package vti.accountmanagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vti.accountmanagement.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findByDepartmentId(int id);
    Department findByDepartmentName(String name);
    Department findByDepartmentNameAndDepartmentIdNot(String name, int id);
    @Query(value = "SELECT dep FROM Department dep " +
            "WHERE dep.departmentName LIKE %:search%")
    Page<Department> findAll(Pageable pageable, String search);
}
