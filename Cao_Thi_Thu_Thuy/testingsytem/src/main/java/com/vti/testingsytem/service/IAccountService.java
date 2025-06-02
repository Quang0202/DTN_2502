package com.vti.testingsytem.service;

import com.vti.testingsytem.dto.AccountDTO;
import com.vti.testingsytem.entity.Account;
import com.vti.testingsytem.form.AccountForm;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.util.List;

public interface IAccountService extends UserDetailsService {
    List<AccountDTO> getAllAccount();
    Account getAccountByID(int id);
    Account createAccount(AccountForm accountForm);
    Account updateAccount(int id, Account updateAccount);
    void deleteAccount(int id);
    boolean existsByUsername(String username);
    Account getAccountByUsername(String username);
}
