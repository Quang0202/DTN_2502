package com.vti.QLNV.service;

import com.vti.QLNV.entity.Account;

import java.util.List;

public interface IAccountService {
    List<Account> getAllAccount();
    Account findAccountById(Integer id);
    String createAccount(Account newAccount);
    String updateAccount(Account newAccount);
    String deleteAccountById(Integer id);
}
