package com.vti.demo.controller;

import com.vti.demo.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private IAccountRepository accountRepository;

    @GetMapping("/")
    public ResponseEntity<?> geAllAccounts() {
        return ResponseEntity.ok(accountRepository.findAll());
    }

}
