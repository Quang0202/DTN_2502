package com.example.TestingSystem.services;

import com.example.TestingSystem.dto.AccountDTO;
import com.example.TestingSystem.dto.CreateAccountDTO;
import com.example.TestingSystem.dto.SearchAccountDTO;
import com.example.TestingSystem.entity.Account;
import com.example.TestingSystem.entity.Department;
import com.example.TestingSystem.entity.Position;
import com.example.TestingSystem.repositories.IAccountRepository;
import com.example.TestingSystem.repositories.IDepartmentRepository;
import com.example.TestingSystem.repositories.IPositionRepository;
import com.example.TestingSystem.specifications.AccountSpecification;
import jakarta.validation.ValidationException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import static com.example.TestingSystem.specifications.AccountSpecification.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountService {
    private final IAccountRepository IAccountRepository;
    private final IDepartmentRepository IDepartmentRepository;
    private final IPositionRepository IPositionRepository;
    private final ModelMapper modelMapper;

    public AccountService(IAccountRepository IAccountRepository,
                          IDepartmentRepository IDepartmentRepository,
                          IPositionRepository IPositionRepository,
                          ModelMapper modelMapper) {
        this.IAccountRepository = IAccountRepository;
        this.IDepartmentRepository = IDepartmentRepository;
        this.IPositionRepository = IPositionRepository;
        this.modelMapper = modelMapper;
    }

//    private AccountDTO accountDTO(Account account) {
//        AccountDTO accountDTO = new AccountDTO();
//        accountDTO.setAccountID(account.getAccountID());
//        accountDTO.setEmail(account.getEmail());
//        accountDTO.setUsername(account.getUsername());
//        accountDTO.setFullName(account.getFullName());
//        accountDTO.setDepartmentName(account.getDepartment().getDepartmentName());
//        accountDTO.setPositionName(account.getPosition().getPositionName().name());
//        accountDTO.setCreateDate(account.getCreateDate());
//        return accountDTO;
//    }

    //Updated to using modelmapper for converting entity to dto
    private AccountDTO accountDTO(Account account) {
        return modelMapper.map(account, AccountDTO.class);
    }

//    public List<AccountDTO> getAllAccounts() {
//        return IAccountRepository.findAll().stream()
//                .map(this::accountDTO)
//                .collect(Collectors.toList());
//    }

    public Page<AccountDTO> getAllAccounts(Pageable pageable) {
        return IAccountRepository.findAll(pageable)
                .map(this::accountDTO);
    }

    public AccountDTO getAccountById(Short id) {
        return IAccountRepository.findById(id)
                .map(this::accountDTO)
                .orElse(null);
    }

    public AccountDTO createAccount(CreateAccountDTO createAccountDTO) {
        if (IAccountRepository.existsByEmail(createAccountDTO.getEmail())) {
            throw new ValidationException("Email đã tồn tại");
        }
        if (IAccountRepository.existsByUsername(createAccountDTO.getUsername())) {
            throw new ValidationException("Username đã tồn tại");
        }

        Department department = IDepartmentRepository.findByDepartmentName(createAccountDTO.getDepartmentName())
                .orElseThrow(() -> new ValidationException("Phòng ban không tồn tại"));

        Position.PositionName positionName;
        try {
            positionName = Position.fromString(createAccountDTO.getPositionName());
        }
        catch (IllegalArgumentException e) {
            throw new ValidationException(e.getMessage());
        }

        Position position = IPositionRepository.findByPositionName(positionName)
                .orElseThrow(() -> new ValidationException("Vị trí không tồn tại"));

        // Create account
        Account account = new Account();
        account.setEmail(createAccountDTO.getEmail());
        account.setUsername(createAccountDTO.getUsername());
        account.setFullName(createAccountDTO.getFullName());
        account.setDepartment(department);
        account.setPosition(position);
        account.setCreateDate(createAccountDTO.getCreateDate());

        Account savedAccount = IAccountRepository.save(account);
        return modelMapper.map(savedAccount, AccountDTO.class);
    }

    public AccountDTO updateAccount(Short id, CreateAccountDTO createAccountDTO) {
        Optional<Account> optionalAccount = IAccountRepository.findById(id);
        if (optionalAccount.isEmpty()) {
            return null;
        }

        Account account = optionalAccount.get();
        Department department = IDepartmentRepository.findById(createAccountDTO.getDepartmentID())
                .orElseThrow(() -> new RuntimeException("Department not found"));
        Position position = IPositionRepository.findById(createAccountDTO.getPositionID())
                .orElseThrow(() -> new RuntimeException("Position not found"));
        account.setEmail(createAccountDTO.getEmail());
        account.setUsername(createAccountDTO.getUsername());
        account.setFullName(createAccountDTO.getFullName());
        account.setDepartment(department);
        account.setPosition(position);

        return accountDTO(IAccountRepository.save(account));
    }

    public void deleteAccount(Short id) {
        if (!IAccountRepository.existsById(id)) {
            throw new ValidationException("Account ID không tồn tại");
        }
        IAccountRepository.deleteById(id);
    }

    public Page<AccountDTO> searchAccounts(String keyword, Pageable pageable) {
        Specification<Account> spec = AccountSpecification.searchKeyword(keyword);
        return IAccountRepository.findAll(spec, pageable).map(this::accountDTO);
    }
}

