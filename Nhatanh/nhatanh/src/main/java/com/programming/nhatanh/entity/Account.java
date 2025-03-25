package com.programming.nhatanh.entity;

import java.time.LocalDateTime;

public class Account {
    public int accountId;
    public String userName;
    public String email;
    public String fullName;
    public Gender gender;
    public Department department;
    public Position position;
    public LocalDateTime createDate;
    public Group[] groups;
    public LocalDateTime[] joinDate;

}
