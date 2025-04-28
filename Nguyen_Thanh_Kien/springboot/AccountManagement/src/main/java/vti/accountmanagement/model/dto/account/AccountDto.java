package vti.authenticationservice.response.dto.account;

import lombok.*;
import lombok.experimental.FieldDefaults;
import vti.authenticationservice.enums.Role;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private int accountId;
    private String username;
    private String password;
    private String fullName;
    private Role role;
}

