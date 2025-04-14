package vti.accountmanagement.response.dto.account;

import lombok.Getter;
import lombok.Setter;
import vti.accountmanagement.enums.Role;

import java.time.LocalDate;

@Getter
@Setter
public class AccountListDto {
    private int accountId;
    private String email;
    private String username;
    private String fullName;
    private LocalDate createDate;
    private String departmentName;
    private String positionName;

    private Role role;
}
