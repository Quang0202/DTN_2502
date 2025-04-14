package vti.accountmanagement.response.dto.account;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountInfoDto {
    int accountId;
    String email;
    String username;
    String fullName;
    LocalDate createDate;
    String departmentName;
    String positionName;
}
