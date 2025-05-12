package vti.accountmanagement.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import vti.accountmanagement.enums.Role;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class CustomUserDetails implements UserDetails {
    int accountId;
    String password;
    String username;
    String fullName;
    transient Collection<? extends GrantedAuthority> authorities;

    public static CustomUserDetails fromUser(Account account) {
        Role role = account.getRole();

        // Lấy authorities từ role (bao gồm cả "admin:read", "ROLE_ADMIN", ...)
        List<SimpleGrantedAuthority> authorities = role.getAuthorities();

        return new CustomUserDetails(
                account.getAccountId(),
                account.getPassword(),
                account.getUsername(),
                account.getFullName(),
                authorities
        );
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }
}
