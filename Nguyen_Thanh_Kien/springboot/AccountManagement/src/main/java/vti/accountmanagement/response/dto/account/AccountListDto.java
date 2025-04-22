package vti.accountmanagement.response.dto.account;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import vti.accountmanagement.enums.Role;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountListDto {
    int accountId;
    String email;
    String username;
    String fullName;
    LocalDate createDate;
    String departmentName;
    String positionName;
    Role role;
}
