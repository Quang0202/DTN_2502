package vti.accountmanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
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
        Account acc = accountRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Account not found"));
        return CustomUserDetails.fromUser(acc);
    }
}
