package com.example.TestingSystem.controllers;

import com.example.TestingSystem.dto.AccountDTO;
import com.example.TestingSystem.dto.CreateAccountDTO;
import com.example.TestingSystem.entity.Account;
import com.example.TestingSystem.services.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<AccountDTO> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDTO> getAccountById(@PathVariable Short id) {
        AccountDTO dto = accountService.getAccountById(id);
        return (dto != null) ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(@RequestBody CreateAccountDTO createAccountDTO) {
        return ResponseEntity.ok(accountService.createAccount(createAccountDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountDTO> updateAccount(@PathVariable Short id,
                                                    @RequestBody CreateAccountDTO createAccountDTO) {
        AccountDTO updated = accountService.updateAccount(id, createAccountDTO);
        return (updated != null) ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Short id) {
        accountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }
}
