package vti.accountmanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.accountmanagement.exception.CustomException;
import vti.accountmanagement.model.Account;
import vti.accountmanagement.model.Department;
import vti.accountmanagement.model.Position;
import vti.accountmanagement.repository.AccountRepository;
import vti.accountmanagement.repository.DepartmentRepository;
import vti.accountmanagement.repository.PositionRepository;
import vti.accountmanagement.request.account.AccountCreateRequest;
import vti.accountmanagement.request.account.AccountUpdateRequest;
import vti.accountmanagement.response.dto.account.AccountInfoDto;
import vti.accountmanagement.response.dto.account.AccountListDto;
import vti.accountmanagement.service.AccountService;
import vti.accountmanagement.utils.ObjectMapperUtils;

import java.util.Locale;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final DepartmentRepository departmentRepository;
    private final PositionRepository positionRepository;
    private final ObjectMapperUtils objectMapperUtils = new ObjectMapperUtils();
    private final MessageSource messageSource;

    @Override
    public Page<AccountListDto> getAll(Pageable pageable) {
        objectMapperUtils.getModelMapper().typeMap(Account.class, AccountListDto.class)
                .addMappings(m -> {
                    m.map(acc -> acc.getDepartment().getDepartmentName(), AccountListDto::setDepartmentName);
                    m.map(acc -> acc.getPosition().getPositionName(), AccountListDto::setPositionName);
                });
        Page<Account> accounts = accountRepository.findAll(pageable);
        return objectMapperUtils.mapEntityPageIntoDtoPage(accounts, AccountListDto.class);
    }

    @Override
    public AccountInfoDto getAccountById(int id) {
        Account account = accountRepository.findById(id).orElse(null);
        if (account == null) {
            throw new CustomException(messageSource.getMessage("account.id.not.exists", null, Locale.ENGLISH));
        }
        objectMapperUtils.getModelMapper().typeMap(Account.class, AccountInfoDto.class)
                .addMappings(m -> {
                    m.map(acc -> acc.getDepartment().getDepartmentName(), AccountInfoDto::setDepartmentName);
                    m.map(acc -> acc.getPosition().getPositionName(), AccountInfoDto::setPositionName);
                });
        return objectMapperUtils.map(account, AccountInfoDto.class);
    }

    @Override
    public void save(AccountCreateRequest account) {
        if (accountRepository.existsAccountByEmail(account.getEmail())) {
            throw new CustomException(messageSource.getMessage("account.email.exists", null, Locale.ENGLISH));
        }
        if (accountRepository.existsAccountByUsername(account.getUsername())) {
            throw new CustomException(messageSource.getMessage("account.username.exists", null, Locale.ENGLISH));
        }
        if (!positionRepository.existsById(account.getPositionId())) {
            throw new CustomException(messageSource.getMessage("position.id.not.exists", null, Locale.ENGLISH));
        }
        if (!departmentRepository.existsById(account.getDepartmentId())) {
            throw new CustomException(messageSource.getMessage("department.id.not.exists", null, Locale.ENGLISH));
        }
        Account acc = new Account();
        acc = objectMapperUtils.map(account, Account.class);
        acc.setDepartment(new Department(account.getDepartmentId()));
        acc.setPosition(new Position(account.getPositionId()));

        accountRepository.save(acc);
    }

    @Override
    public void update(AccountUpdateRequest account) {
        Account acc = accountRepository.findById(account.getAccountId()).orElse(null);
        if (acc == null) {
            throw new CustomException(messageSource.getMessage("account.id.not.exists", null, Locale.ENGLISH));
        }
        if (accountRepository.existsAccountByEmailAndAccountIdNot(account.getEmail(), account.getAccountId())) {
            throw new CustomException(messageSource.getMessage("account.email.exists", null, Locale.ENGLISH));
        }
        if (!positionRepository.existsById(account.getPositionId())) {
            throw new CustomException(messageSource.getMessage("position.id.not.exists", null, Locale.ENGLISH));
        }
        if (!departmentRepository.existsById(account.getDepartmentId())) {
            throw new CustomException(messageSource.getMessage("department.id.not.exists", null, Locale.ENGLISH));
        }
        objectMapperUtils.getModelMapper().map(account,acc);
        acc.setPosition(new Position(account.getPositionId()));
        acc.setDepartment(new Department(account.getDepartmentId()));
        accountRepository.save(acc);
    }

    @Override
    public void delete(Integer id) {
        Account acc = accountRepository.findById(id).orElse(null);
        if (acc == null) {
            throw new CustomException(messageSource.getMessage("account.id.not.exists", null, Locale.ENGLISH));
        }
        accountRepository.delete(acc);
    }
}
