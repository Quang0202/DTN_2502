package com.example.TestingSystem.dto;

import lombok.Data;

@Data
public class CreateAccountDTO {
    private String email;
    private String username;
    private String fullName;
    private Short departmentID;
    private Short positionID;
}
