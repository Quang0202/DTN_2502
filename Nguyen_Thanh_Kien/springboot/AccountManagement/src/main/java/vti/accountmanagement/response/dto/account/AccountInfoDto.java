package vti.accountmanagement.response.dto.account;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AccountInfoDto {
    private int accountId;
    private String email;
    private String username;
    private String fullName;
    private LocalDate createDate;
    private String departmentName;
    private String positionName;
}
