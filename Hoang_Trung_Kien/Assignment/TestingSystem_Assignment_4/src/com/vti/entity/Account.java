package com.vti.entity;

import java.time.LocalDateTime;

public class Account {
    private int accountId;
    private String userName;
    private String email;
    private String fullName;
    private Gender gender;
    private Department department;
    private Position position;
    private LocalDateTime createDate;
    private Group[] groups;
    private LocalDateTime[] joinDate;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public LocalDateTime[] getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime[] joinDate) {
        this.joinDate = joinDate;
    }

    public Account() {
    }

    public Account(int accountId, String email, String userName, String firstName, String lastName) {
        this.accountId = accountId;
        this.userName = userName;
        this.email = email;
        this.fullName = firstName + " " + lastName;
    }

    public Account(int accountId, String email, String userName, String firstName, String lastName, Position position) {
        this.accountId = accountId;
        this.userName = userName;
        this.email = email;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDateTime.now();
    }

    public Account(int accountId, String email, String userName, String firstName, String lastName, Position position, LocalDateTime createDate) {
        this.accountId = accountId;
        this.userName = userName;
        this.email = email;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "com.vti.entity.Account{" +
                "accountId=" + accountId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }
}
