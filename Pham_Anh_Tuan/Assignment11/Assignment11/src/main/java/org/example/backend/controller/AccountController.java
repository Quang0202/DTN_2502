package org.example.backend.controller;


import org.example.backend.service.AccountService;
import org.example.entity.Account;

import java.util.List;

public class AccountController {

    private AccountService accountService;

    public AccountController() {
        accountService = new AccountService();
    }

    public List<Account> getListAccounts() throws Exception {
        return accountService.getListAccounts();
    }
}