package vti.accountmanagement.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import static vti.accountmanagement.enums.Permission.ADMIN_CREATE;
import static vti.accountmanagement.enums.Permission.ADMIN_DELETE;
import static vti.accountmanagement.enums.Permission.ADMIN_READ;
import static vti.accountmanagement.enums.Permission.ADMIN_UPDATE;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER(Collections.emptySet()),
    ADMIN(
            Set.of(
                    ADMIN_READ,
                    ADMIN_UPDATE,
                    ADMIN_DELETE,
                    ADMIN_CREATE
            )
    );

    @Override
    public String toString() {
        return "Role{" +
                "permissions=" + permissions +
                "} " + super.toString();
    }

    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = new java.util.ArrayList<>(getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermissionCode()))
                .toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}
