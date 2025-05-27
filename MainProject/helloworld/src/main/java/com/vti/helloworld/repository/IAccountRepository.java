package com.vti.helloworld.repository;

import com.vti.helloworld.entity.Account;
import com.vti.helloworld.entity.Department;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAccountRepository extends JpaRepository<Account, Integer>, JpaSpecificationExecutor<Account> {
    @Query("SELECT a FROM Account a") // WHERE a.userName Like %:search% AND accountId >=5
    Department finAll(Specification<Account>specification, @Param("search") String value);

    boolean existsByEmail(String email);
    boolean existsByUserName(String userName);

    Account findByUserName(String userName);
}
