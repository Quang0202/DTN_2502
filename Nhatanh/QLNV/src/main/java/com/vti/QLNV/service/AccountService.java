package com.vti.QLNV.service;

import com.vti.QLNV.dto.request.CreateAccountRequest;
import com.vti.QLNV.entity.Account;
import com.vti.QLNV.entity.Department;
import com.vti.QLNV.entity.Position;
import com.vti.QLNV.entity.PositionName;
import com.vti.QLNV.repository.AccountRepository;
import com.vti.QLNV.repository.DepartmentRepository;
import com.vti.QLNV.repository.PositionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class AccountService implements IAccountService{

    @Autowired
    private AccountRepository repository;

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Page<Account> getAllAccount(Pageable pageable) {
        Page<Account> pagedResult = repository.findAll(pageable);
        if(pagedResult.hasContent()) {
            return pagedResult;
        } else {
            return null;
        }
    }

    @Override
    public Account findAccountById(Integer id) {
        return repository.findByAccountId(id).orElse(null);
    }

    @Override
    @Transactional
    public String createAccount(CreateAccountRequest accountRequest) {
        PositionName positionName = PositionName.getPositionName(accountRequest.getPositionName());
        Position position = positionRepository.findByPositionName(positionName);

        Department departmentRequest = departmentRepository.findByDepartmentName(accountRequest.getDepartmentName());

        if(departmentRequest == null){
            Department newDepartment = new Department();
            newDepartment.setDepartmentName(accountRequest.getDepartmentName());

            Account newAccount = Account.builder()
                                .fullname(accountRequest.getFullname())
                                .username(accountRequest.getUsername())
                                .email(accountRequest.getEmail())
                                .createDate(new Date())
                                .department(newDepartment)
                                .position(position)
                                .build();

            departmentRepository.save(newDepartment);
            repository.save(newAccount);

            return "Account created";

        } else {
            Account newAccount = Account.builder()
                                .fullname(accountRequest.getFullname())
                                .username(accountRequest.getUsername())
                                .email(accountRequest.getEmail())
                                .createDate(new Date())
                                .department(departmentRequest)
                                .position(position)
                                .build();

            repository.save(newAccount);

            return "Account created";
        }
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

    @Override
    public boolean isEmailExist(String email) {
        return repository.existsByEmail(email);
    }

    @Override
    public boolean isUsernameExist(String username) {
        return repository.existsByUsername(username);
    }
}
