package com.vti.assignment45.DTO;

import lombok.Data;

@Data
public class AccountDTO {
    private short id;
    private String username;
    private String fullName;
    private String email;
    private String departmentName;
    private String positionName;
}
