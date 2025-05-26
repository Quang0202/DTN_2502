package com.vti.assignment45.repository;

import com.vti.assignment45.entity.Account;
import com.vti.assignment45.entity.Department;
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
}
