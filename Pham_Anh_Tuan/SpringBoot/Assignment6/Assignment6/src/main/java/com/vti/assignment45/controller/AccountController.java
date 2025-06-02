package com.vti.assignment45.controller;

import com.vti.assignment45.DTO.AccountDTO;
import com.vti.assignment45.DTO.AccountFormUpdate;
import com.vti.assignment45.entity.Account;
import com.vti.assignment45.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
@Validated
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("")
    public Page<Account> getAllAccounts(
            @RequestParam(required = false) String search,
            @RequestParam(required = false) Integer departmentId,
            @RequestParam(required = false) Integer positionId,
            Pageable pageable
    ) {
        validatePageable(pageable);

        return accountService.getAllAccounts(search, departmentId, positionId, pageable);
    }

    private void validatePageable(Pageable pageable) {
        if (pageable.getPageNumber() < 0) {
            throw new IllegalArgumentException("Page number must be >= 1");
        }
        if (pageable.getPageSize() < 5 || pageable.getPageSize() > 20) {
            throw new IllegalArgumentException("Page size must be between 5 and 20");
        }
    }

    @PostMapping
    public ResponseEntity<?> createAccount(@RequestBody @Valid AccountDTO form) {
        Account created = accountService.createAccount(form);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateAccount(@Valid @RequestBody AccountFormUpdate form) {
        accountService.updateAccount(form);
        return ResponseEntity.ok("Cập nhật tài khoản thành công");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAccount(@PathVariable("id") Integer id) {
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Xóa tài khoản thành công");
    }

}
