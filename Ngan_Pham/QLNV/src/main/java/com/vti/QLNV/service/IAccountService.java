package com.vti.QLNV.service;

import com.vti.QLNV.entity.Account;

import java.util.List;

public interface IAccountService {
    List<Account> getAllAccounts();
    Account getAccountById(int id);
    Account createAccount(Account account);
    Account updateAccount(int id, Account account);
    void deleteAccount(int id);
}
