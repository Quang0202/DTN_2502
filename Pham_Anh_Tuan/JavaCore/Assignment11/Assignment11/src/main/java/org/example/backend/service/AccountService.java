package org.example.backend.service;


import org.example.backend.repository.AccountRepository;
import org.example.entity.Account;

import java.util.List;

public class AccountService {

    private AccountRepository accountRepository;

    public AccountService() {
        accountRepository = new AccountRepository();
    }

    public List<Account> getListAccounts() throws Exception {
        return accountRepository.getListAccounts();
    }
}