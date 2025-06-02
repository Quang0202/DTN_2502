package com.example.TestingSystem.controllers;

import com.example.TestingSystem.dto.AccountDTO;
import com.example.TestingSystem.dto.CreateAccountDTO;
import com.example.TestingSystem.services.AccountService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
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

//    @GetMapping
//    public List<AccountDTO> getAllAccounts() {
//        return accountService.getAllAccounts();
//    }

    @GetMapping
    public ResponseEntity<List<AccountDTO>> getAllAccounts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "accountID") String sortBy,
            @RequestParam(defaultValue = "asc") String sortOrder) {
        Sort sort = sortOrder.equalsIgnoreCase("asc") ?
                Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<AccountDTO> accountDTOPage = accountService.getAllAccounts(pageable);

        return new ResponseEntity<>(accountDTOPage.getContent(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDTO> getAccountById(@PathVariable Short id) {
        AccountDTO dto = accountService.getAccountById(id);
        return (dto != null) ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(@Valid @RequestBody CreateAccountDTO createAccountDTO) {
        AccountDTO createdAccount = accountService.createAccount(createAccountDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAccount);
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

    @GetMapping("/search")
    public ResponseEntity<Page<AccountDTO>> searchAccounts(
            @RequestParam(required = false) String search,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "accountID") String sortBy,
            @RequestParam(defaultValue = "asc") String sortOrder) {

        Pageable pageable = PageRequest.of(page, size,
                sortOrder.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending());

        Page<AccountDTO> result = accountService.searchAccounts(search, pageable);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
