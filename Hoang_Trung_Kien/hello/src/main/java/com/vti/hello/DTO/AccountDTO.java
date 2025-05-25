package com.vti.hello.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    private int accountId;
    private String email;
    private String username;
    private String fullName;
    private String departmentName;
    private String positionName;
}
