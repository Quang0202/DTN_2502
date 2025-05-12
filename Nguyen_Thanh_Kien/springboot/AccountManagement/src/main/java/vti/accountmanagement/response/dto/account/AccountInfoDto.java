package vti.accountmanagement.response.dto.account;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfoDto {
    int accountId;
    String email;
    String username;
    String fullName;
    LocalDate createDate;
    String departmentName;
    String positionName;
}
