package com.programming.nhatanh.lesson10.backend.service;

import com.programming.nhatanh.lesson10.backend.repository.AccountRepository;
import com.programming.nhatanh.lesson10.backend.entity.Account;

import java.util.List;

public class AccountService {

    private AccountRepository accountRepository;
    public AccountService() {
        accountRepository = new AccountRepository();
    }
    public List<Account> getAllAccount(){
        // logic
        return accountRepository.getListAccount();
    }
}
