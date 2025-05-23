package com.vti.hello.repository;

import com.vti.hello.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer>, JpaSpecificationExecutor<Account> {
}
