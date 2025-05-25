package com.vti.testingsytem.service;

import com.vti.testingsytem.dto.AccountDTO;
import com.vti.testingsytem.entity.Account;
import com.vti.testingsytem.entity.Department;
import com.vti.testingsytem.entity.Position;
import com.vti.testingsytem.repository.IAccountRepository;
import com.vti.testingsytem.repository.IDepartmentRepository;
import com.vti.testingsytem.repository.IPositionRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService{

    @Autowired
    private IAccountRepository accountRepository;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Autowired
    private IPositionRepository positionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AccountDTO> getAllAccount() {
        List<Account> accounts = accountRepository.findAll();
        List<AccountDTO> accountDTOS = modelMapper.map(accounts, new TypeToken<List<AccountDTO>>() {}.getType());
        return accountDTOS;
    }

    @Override
    public Account getAccountByID(int id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public Account createAccount(Account account) {
        if (accountRepository.existsByUsername(account.getUsername()) || accountRepository.existsByEmail(account.getEmail())){
            throw new IllegalArgumentException("Account đã tồn tại!");
        }
        Department department = departmentRepository.findById(account.getDepartment().getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Department không tồn tại"));

        Position position = positionRepository.findById(account.getPosition().getPositionId())
                .orElseThrow(() -> new RuntimeException("Position không tồn tại"));

        account.setDepartment(department);
        account.setPosition(position);
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(int id, Account updateAccount) {
        Account existing = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account không tồn tại."));
        Department department = departmentRepository.findById(updateAccount.getDepartment().getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Department không tồn tại"));

        Position position = positionRepository.findById(updateAccount.getPosition().getPositionId())
                .orElseThrow(() -> new RuntimeException("Position không tồn tại"));
        existing.setEmail(updateAccount.getEmail());
        existing.setUsername(updateAccount.getUsername());
        existing.setFullName(updateAccount.getFullName());
        existing.setDepartment(department);
        existing.setPosition(position);
        return accountRepository.save(existing);
    }

    @Override
    public void deleteAccount(int id) {
        Account existing = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account không tồn tại."));
        accountRepository.delete(existing);
    }
}
