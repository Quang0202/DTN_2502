package vti.accountmanagement.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import vti.accountmanagement.enums.Role;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.model.Account;
import vti.accountmanagement.repository.AccountRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomUserDetailsServiceImplTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private CustomUserDetailsServiceImpl customUserDetailsService;

    @Test
    void loadUserByUsername_success() {
        Account account = new Account();
        account.setAccountId(1);
        account.setUsername("testuser");
        account.setPassword("password");
        account.setRole(Role.USER);
        when(accountRepository.findByUsername("testuser")).thenReturn(Optional.of(account));

        var result = customUserDetailsService.loadUserByUsername("testuser");

        assertNotNull(result);
        assertEquals("testuser", result.getUsername());
        verify(accountRepository).findByUsername("testuser");
    }

    @Test
    void loadUserByUsername_usernameNotFound() {
        when(accountRepository.findByUsername("notfound")).thenReturn(Optional.empty());

        var exception = assertThrows(NotFoundException.class, () ->
                customUserDetailsService.loadUserByUsername("notfound"));

        assertTrue(exception.getMessage().contains("Authentication failed"));
        verify(accountRepository).findByUsername("notfound");
    }

    @Test
    void loadUserByUsername_invalidEnum_shouldThrowNotFound() {
        RuntimeException rootCause = new IllegalArgumentException("No enum constant vti.model.Role.INVALID_ROLE");
        RuntimeException wrapped = new RuntimeException("Wrapped exception", rootCause);

        when(accountRepository.findByUsername("enumError")).thenThrow(wrapped);

        var exception = assertThrows(NotFoundException.class, () ->
                customUserDetailsService.loadUserByUsername("enumError"));

        assertTrue(exception.getMessage().contains("Invalid enum value"));
    }

    @Test
    void loadUserByUsername_genericException_shouldThrowNotFound() {
        RuntimeException rootCause = new RuntimeException("Some DB error");
        RuntimeException wrapped = new RuntimeException("Wrapper", rootCause);

        when(accountRepository.findByUsername("dberror")).thenThrow(wrapped);

        var exception = assertThrows(NotFoundException.class, () ->
                customUserDetailsService.loadUserByUsername("dberror"));

        assertTrue(exception.getMessage().contains("Authentication failed"));
    }
}
