package com.example.TestingSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountDTO {
    private Short accountID;
    private String email;
    private String username;
    private String fullName;
    private String departmentName;
    private String positionName;
    private LocalDateTime createDate;
}
