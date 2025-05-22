package com.vti.QLNV.service;

import com.vti.QLNV.entity.Account;
import com.vti.QLNV.repository.IAccountRepository;
import com.vti.QLNV.repository.IDepartmentRepository;
import com.vti.QLNV.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository accountRepository;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(int id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Account với ID = " + id));
    }

    @Override
    public Account createAccount(Account account) {
        if (accountRepository.existsByEmail(account.getEmail())) {
            throw new IllegalArgumentException("Email đã tồn tại.");
        }
        if (accountRepository.existsByUserName(account.getUserName())) {
            throw new IllegalArgumentException("UserName đã tồn tại.");
        }

        if (!departmentRepository.existsById(account.getDepartment().getDepartmentId())) {
            throw new IllegalArgumentException("Phòng ban không tồn tại.");
        }

        if (!positionRepository.existsById(account.getPosition().getPositionId())) {
            throw new IllegalArgumentException("Vị trí không tồn tại.");
        }

        account.setCreateDate(LocalDateTime.now());
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(int id, Account account) {
        Account existing = getAccountById(id);
        existing.setEmail(account.getEmail());
        existing.setUserName(account.getUserName());
        existing.setFullName(account.getFullName());
        existing.setDepartment(account.getDepartment());
        existing.setPosition(account.getPosition());
        return accountRepository.save(existing);
    }

    @Override
    public void deleteAccount(int id) {
        Account account = getAccountById(id);
        accountRepository.delete(account);
    }

}
