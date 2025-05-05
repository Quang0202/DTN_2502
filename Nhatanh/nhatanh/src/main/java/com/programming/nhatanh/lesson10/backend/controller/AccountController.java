package com.programming.nhatanh.lesson10.backend.controller;

import com.programming.nhatanh.lesson10.backend.service.AccountService;
import com.programming.nhatanh.lesson10.backend.entity.Account;

import java.util.List;

public class AccountController {
    private AccountService accountService;

    public AccountController(){
        accountService = new AccountService();
    }

    public List<Account> getAllAccount(){
        return accountService.getAllAccount()
    }
}
