package com.vti.assignment45.service;

import com.vti.assignment45.DTO.AccountDTO;
import com.vti.assignment45.DTO.AccountFormUpdate;
import com.vti.assignment45.entity.Account;
import com.vti.assignment45.entity.Department;
import com.vti.assignment45.entity.Position;
import com.vti.assignment45.repository.AccountRepository;
import com.vti.assignment45.repository.DepartmentRepository;
import com.vti.assignment45.repository.PositionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepo;

    @Autowired
    private DepartmentRepository departmentRepo;

    @Autowired
    private PositionRepository positionRepo;


    public Page<Account> getAllAccounts(String search, Integer departmentId, Integer positionId, Pageable pageable) {
        if (search != null && (search.length() > 50 || !search.matches("^[a-zA-Z0-9\\s]*$"))) {
            throw new IllegalArgumentException("Invalid search string");
        }

        return accountRepo.findAllWithSearchAndFilter(search, departmentId, positionId, pageable);
    }


    public Account createAccount(AccountDTO form) {
        if (accountRepo.existsByEmail(form.getEmail())) {
            throw new IllegalArgumentException("Email đã tồn tại.");
        }

        if (accountRepo.existsByUsername(form.getUsername())) {
            throw new IllegalArgumentException("Username đã tồn tại.");
        }

        Department department = departmentRepo.findByDepartmentName(form.getDepartmentName())
                .orElseGet(() -> {
                    if (departmentRepo.existsByDepartmentName(form.getDepartmentName())) {
                        throw new IllegalArgumentException("Tên phòng đã tồn tại.");
                    }
                    Department d = new Department();
                    d.setDepartmentName(form.getDepartmentName());
                    return departmentRepo.save(d);
                });

        Position position = positionRepo.findByPositionName(form.getPositionName())
                .orElseThrow(() -> new IllegalArgumentException("Position không tồn tại"));

        Account account = new Account();
        account.setEmail(form.getEmail());
        account.setUsername(form.getUsername());
        account.setFullName(form.getFullName());
        account.setDepartment(department);
        account.setPosition(position);
        account.setCreateDate(form.getCreateDate() != null ? form.getCreateDate() : LocalDateTime.now());

        return accountRepo.save(account);
    }

    @Transactional
    public void updateAccount(AccountFormUpdate form) {
        Account account = accountRepo.findById(form.getId())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Account với ID: " + form.getId()));

        if (form.getEmail() != null && !form.getEmail().equals(account.getEmail())) {
            if (accountRepo.existsByEmail(form.getEmail())) {
                throw new RuntimeException("Email đã tồn tại trong hệ thống");
            }
            account.setEmail(form.getEmail());
        }

        if (form.getUsername() != null && !form.getUsername().equals(account.getUsername())) {
            if (accountRepo.existsByUsername(form.getUsername())) {
                throw new RuntimeException("Username đã tồn tại trong hệ thống");
            }
            account.setUsername(form.getUsername());
        }

        if (form.getFullName() != null) {
            account.setFullName(form.getFullName());
        }

        Department department = departmentRepo.findById(form.getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phòng ban với ID: " + form.getDepartmentId()));
        account.setDepartment(department);
        Position position = positionRepo.findById(form.getPositionId())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy chức vụ với ID: " + form.getPositionId()));
        account.setPosition(position);

        if (form.getCreateDate() != null) {
            if (form.getCreateDate().isAfter(java.time.LocalDate.now())) {
                throw new RuntimeException("Ngày tạo không được lớn hơn ngày hiện tại");
            }
            account.setCreateDate(form.getCreateDate().atStartOfDay());
        }
        accountRepo.save(account);
    }

    @Transactional
    public void deleteAccount(Integer id) {
        Account account = accountRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Account với ID: " + id));
        accountRepo.delete(account);
    }

}
