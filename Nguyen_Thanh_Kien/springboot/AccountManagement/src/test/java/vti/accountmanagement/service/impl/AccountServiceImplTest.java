package vti.accountmanagement.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.util.ReflectionTestUtils;
import org.mockito.junit.jupiter.MockitoExtension;
import vti.accountmanagement.enums.PositionName;
import vti.accountmanagement.enums.Role;
import vti.accountmanagement.exception.DuplicateException;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.model.*;
import vti.accountmanagement.repository.*;
import vti.accountmanagement.request.account.*;
import vti.accountmanagement.response.dto.account.*;
import vti.accountmanagement.utils.MessageUtil;
import vti.accountmanagement.utils.ObjectMapperUtils;

import java.util.*;

@ExtendWith(MockitoExtension.class)
class AccountServiceImplTest {

    @Mock
    private AccountRepository accountRepository;

    @Mock
    private DepartmentRepository departmentRepository;

    @Mock
    private PositionRepository positionRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Mock
    MessageSource messageSource;

    @InjectMocks
    private AccountServiceImpl accountService;

    private final ObjectMapperUtils objectMapperUtils = new ObjectMapperUtils();

    @BeforeEach
    void setUp() {
        ReflectionTestUtils.setField(accountService, "objectMapperUtils", objectMapperUtils);
        MessageUtil.messageSource = messageSource;
        lenient().when(messageSource.getMessage(anyString(), any(), any()))
                .thenAnswer(invocation -> invocation.getArgument(0));
    }

    @Test
    void getAccountById_success() {
        Account account = new Account();
        account.setAccountId(1);
        account.setUsername("john");
        account.setEmail("test@gmail.com");
        account.setFullName("Test full name");
        account.setDepartment(new Department(1, "IT"));
        account.setPosition(new Position(1, PositionName.DEV));

        when(accountRepository.findById(1)).thenReturn(Optional.of(account));

        AccountInfoDto result = accountService.getAccountById(1);

        assertEquals("john", result.getUsername());
        assertEquals("IT", result.getDepartmentName());
        assertEquals("test@gmail.com", result.getEmail());
        assertEquals("Test full name", result.getFullName());
    }

    @Test
    void getAccountById_notFound() {
        when(accountRepository.findById(1)).thenReturn(Optional.empty());

        NotFoundException ex = assertThrows(NotFoundException.class, () -> accountService.getAccountById(1));
        assertEquals("account.id.not.exists", ex.getMessage());
    }

    @Test
    void save_success() {
        AccountCreateRequest request = new AccountCreateRequest();
        request.setUsername("user");
        request.setEmail("email@test.com");
        request.setPassword("pass");
        request.setRole("ADMIN");
        request.setDepartmentId(1);
        request.setPositionId(1);

        when(accountRepository.existsAccountByEmail("email@test.com")).thenReturn(false);
        when(accountRepository.existsAccountByUsername("user")).thenReturn(false);
        when(positionRepository.existsById(1)).thenReturn(true);
        when(departmentRepository.existsById(1)).thenReturn(true);
        when(passwordEncoder.encode("pass")).thenReturn("encoded");

        accountService.save(request);

        verify(accountRepository, times(1)).save(any(Account.class));
    }

    @Test
    void save_duplicateEmail() {
        AccountCreateRequest request = new AccountCreateRequest();
        request.setEmail("email@test.com");

        when(accountRepository.existsAccountByEmail("email@test.com")).thenReturn(true);

        DuplicateException ex = assertThrows(DuplicateException.class, () -> accountService.save(request));
        assertTrue(ex.getMessage().contains("account.email.exists"));
    }

    @Test
    void update_success() {
        AccountUpdateRequest request = new AccountUpdateRequest();
        request.setAccountId(1);
        request.setFullName("new name");
        request.setEmail("email@gmail.com");
        request.setPositionId(1);
        request.setDepartmentId(1);

        Account existing = new Account();
        existing.setAccountId(1);
        existing.setFullName("old name");
        existing.setEmail("email@gmail.com");
        existing.setPosition(new Position(1,PositionName.DEV));
        existing.setDepartment(new Department(1, "department"));

        when(accountRepository.findById(1)).thenReturn(Optional.of(existing));
        when(accountRepository.existsAccountByEmailAndAccountIdNot("email@gmail.com", 1)).thenReturn(false);
        when(positionRepository.existsById(1)).thenReturn(true);
        when(departmentRepository.existsById(1)).thenReturn(true);

        accountService.update(request);

        ArgumentCaptor<Account> captor = ArgumentCaptor.forClass(Account.class);
        verify(accountRepository).save(captor.capture());

        Account saveAcc = captor.getValue();
        assertEquals("new name", saveAcc.getFullName());
        assertEquals(1, saveAcc.getAccountId());
    }

    @Test
    void update_accountNotFound() {
        AccountUpdateRequest request = new AccountUpdateRequest();
        request.setAccountId(1);

        when(accountRepository.findById(1)).thenReturn(Optional.empty());

        NotFoundException ex = assertThrows(NotFoundException.class, () -> accountService.update(request));
        assertTrue(ex.getMessage().contains("account.id.not.exists"));
    }

    @Test
    void delete_success() {
        Account acc = new Account();
        acc.setAccountId(1);

        when(accountRepository.findById(1)).thenReturn(Optional.of(acc));

        accountService.delete(1);

        verify(accountRepository).delete(acc);
    }

    @Test
    void delete_notFound() {
        when(accountRepository.findById(1)).thenReturn(Optional.empty());

        assertThrows(NotFoundException.class, () -> accountService.delete(1));
    }

    @Test
    void getAll_success() {
        Pageable pageable = PageRequest.of(0, 10);
        Account account = new Account(
                1,
                "user",
                "pass",
                "user@test.com",
                "User Test",
                new Date(),
                new Position(1, PositionName.DEV),
                new Department(1, "IT"),
                Role.USER
        );

        Page<Account> page = new PageImpl<>(List.of(account));

        when(accountRepository.findAll(pageable, null)).thenReturn(page);

        var result = accountService.getAll(pageable, null);

        assertEquals(1, result.getContent().size());
    }
}
