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

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", username='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", department=" + (department != null ? department.departmentName : "Nhân viên này chưa có phòng ban") +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }

    public String AccountInfo(){
        return "Email: " + email + "\n" +
                "Username: '" + userName + "\n" +
                "FullName: '" + fullName + "\n" +
                "CreateDate: '" + createDate + "\n";
    }

    public Account() {
    }

    public Account(int accountId, String email, String firstName, String lastName) {
        this.accountId = accountId;
        this.email = email;
        this.fullName = firstName + " "  + lastName;
    }

    public Account(int accountId, String email, String firstName, String lastName, Position position) {
        this.accountId = accountId;
        this.email = email;
        this.fullName = firstName + " "  + lastName;
        this.position = position;
        this.createDate = LocalDateTime.now();
    }

    public Account(int accountId, String email, String firstName, String lastName, Position position, LocalDateTime createDate) {
        this.accountId = accountId;
        this.email = email;
        this.fullName = firstName + " "  + lastName;
        this.position = position;
        this.createDate = createDate;
    }


}
