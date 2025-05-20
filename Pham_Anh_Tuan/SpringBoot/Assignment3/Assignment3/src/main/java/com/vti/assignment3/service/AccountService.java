package com.vti.assignment3.service;

import com.vti.assignment3.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccounts();

    Optional<Account> getAccountById(Integer id);

    Account createAccount(Account account);

    Account updateAccount(Integer id, Account account);

    void deleteAccount(Integer id);
}
