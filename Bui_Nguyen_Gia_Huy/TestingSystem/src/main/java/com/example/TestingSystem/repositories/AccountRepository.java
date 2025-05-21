package com.example.TestingSystem.repositories;

import com.example.TestingSystem.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Short> {
}
