package com.example.TestingSystem.repositories;

import com.example.TestingSystem.entity.Account;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface IAccountRepository extends JpaRepository<Account, Short>, JpaSpecificationExecutor<Account> {
    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

    Optional<Account> findByEmail(String email);

    Optional<Account> findByUsername(String username);
}
