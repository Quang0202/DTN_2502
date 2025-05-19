package com.vti.testingsytem.service;

import com.vti.testingsytem.entity.Account;

import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.util.List;

public interface IAccountService {
    List<Account> getAllAccount();
    Account getAccountByID(int id);
    Account createAccount(Account account);
    Account updateAccount(int id, Account updateAccount);
    void deleteAccount(int id);
}
