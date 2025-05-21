package com.vti.assignment3.service.impl;

import com.vti.assignment3.entity.Account;
import com.vti.assignment3.repository.AccountRepository;
import com.vti.assignment3.service.AccountService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired private AccountRepository accountRepository;


    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getAccountById(Integer id) {
        return accountRepository.findById(id);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Integer id, Account updateAccount) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Account not found"));
        account.setEmail(updateAccount.getEmail());
        account.setUsername(updateAccount.getUsername());
        account.setFullName(updateAccount.getFullName());
        account.setDepartment(updateAccount.getDepartment());
        account.setPosition(updateAccount.getPosition());
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountRepository.deleteById(id);
    }
}
