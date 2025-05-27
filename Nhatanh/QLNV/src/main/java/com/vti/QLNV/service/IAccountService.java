package com.vti.QLNV.service;

import com.vti.QLNV.dto.request.CreateAccountRequest;
import com.vti.QLNV.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IAccountService {
    Page<Account> getAllAccount(Pageable pageable);
    Account findAccountById(Integer id);
    String createAccount(CreateAccountRequest newAccount);
    String updateAccount(Account newAccount);
    String deleteAccountById(Integer id);
    boolean isEmailExist(String email);

    boolean isUsernameExist(String username);
}
