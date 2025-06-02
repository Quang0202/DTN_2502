package com.example.TestingSystem.repositories;

import com.example.TestingSystem.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IAccountRepository extends JpaRepository<Account, Short>, JpaSpecificationExecutor<Account> {
}
