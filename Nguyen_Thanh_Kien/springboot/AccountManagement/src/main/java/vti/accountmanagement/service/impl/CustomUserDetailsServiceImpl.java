package vti.accountmanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.model.Account;
import vti.accountmanagement.model.CustomUserDetails;
import vti.accountmanagement.repository.AccountRepository;
import vti.accountmanagement.service.CustomUserDetailsService;

@Service
@AllArgsConstructor
public class CustomUserDetailsServiceImpl implements CustomUserDetailsService {

    private final AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Account acc = accountRepository.findByUsername(username)
                    .orElseThrow(() -> new UsernameNotFoundException("Account not found"));
            return CustomUserDetails.fromUser(acc);
        } catch (Exception ex) {
            Throwable rootCause = getRootCause(ex);
            if (rootCause instanceof IllegalArgumentException &&
                    rootCause.getMessage().contains("No enum constant")) {
                throw new NotFoundException("Invalid enum value: " + rootCause.getMessage());
            }
            throw new NotFoundException("Authentication failed: " + rootCause.getMessage());
        }
    }

    private Throwable getRootCause(Throwable throwable) {
        Throwable cause = throwable.getCause();
        if (cause != null) {
            return getRootCause(cause);
        }
        return throwable;
    }
}
