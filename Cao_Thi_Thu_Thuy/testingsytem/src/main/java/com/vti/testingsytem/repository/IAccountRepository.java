package com.vti.testingsytem.repository;

import com.vti.testingsytem.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Account findByUsername(String username);
}
