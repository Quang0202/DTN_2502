package com.vti.QLNV.service;

import com.vti.QLNV.entity.Account;
import com.vti.QLNV.repository.AccountRepository;
import com.vti.QLNV.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService{

    @Autowired
    private AccountRepository repository;

    @Override
    public List<Account> getAllAccount() {
        return repository.findAll();
    }

    @Override
    public Account findAccountById(Integer id) {
        return repository.findAccountById(id);
    }

    @Override
    public String createAccount(Account newAccount) {
        repository.save(newAccount);
        return "Account created";
    }

    @Override
    public String updateAccount(Account newAccount) {
        repository.save(newAccount);
        return "Account updated";
    }

    @Override
    public String deleteAccountById(Integer id) {
        repository.deleteById(id);
        return "Account deleted";
    }
}
