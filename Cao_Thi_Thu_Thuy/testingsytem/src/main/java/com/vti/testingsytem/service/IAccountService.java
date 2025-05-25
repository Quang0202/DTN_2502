package com.vti.testingsytem.service;

import com.vti.testingsytem.dto.AccountDTO;
import com.vti.testingsytem.entity.Account;

import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.util.List;

public interface IAccountService {
    List<AccountDTO> getAllAccount();
    Account getAccountByID(int id);
    Account createAccount(Account account);
    Account updateAccount(int id, Account updateAccount);
    void deleteAccount(int id);
}
