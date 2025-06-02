package com.vti.assignment45.repository;

import com.vti.assignment45.entity.Account;
import com.vti.assignment45.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> , JpaSpecificationExecutor<Account> {

    @Query("SELECT a FROM Account a")
    Department finAll(Specification<Account> specification, @Param("search") String value);


    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

    boolean existsById(Integer id);

    @Query("SELECT a FROM Account a WHERE " +
            "(:search IS NULL OR a.username LIKE %:search% OR a.fullName LIKE %:search%) AND " +
            "(:departmentId IS NULL OR a.department.departmentID = :departmentId) AND " +
            "(:positionId IS NULL OR a.position.positionID = :positionId)")
    Page<Account> findAllWithSearchAndFilter(
            @Param("search") String search,
            @Param("departmentId") Integer departmentId,
            @Param("positionId") Integer positionId,
            Pageable pageable);


}
