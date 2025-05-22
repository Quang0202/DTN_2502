package com.vti.hello.controller;

import com.vti.hello.entity.Account;
import com.vti.hello.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private IAccountRepository repository;

    @GetMapping()
    public List<Account> getAllAccount() {
        return repository.findAll();
    }
}
