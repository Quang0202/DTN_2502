package com.vti.entity;

import java.util.Date;


public class Account {
    private int accountId;
    private String username;
    private String email;
    private String fullName;
    private Gender gender;
    private Department department;
    private Position position;
    private Date createDate;
    private Group[] groups;

    public Account(int accountId, String username, String email, String fullName, Gender gender, Department department, Position position, Date createDate) {
        this.accountId = accountId;
        this.username = username;
        this.email = email;
        this.fullName = fullName;
        this.gender = gender;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }

    public Account() {
    }

    public Account(int accountId, String email, String fullName, Department department) {
        this.accountId = accountId;
        this.email = email;
        this.fullName = fullName;
        this.department = department;
    }

    public Account(int i, String s, String trần_văn_b, Object o, Object o1, Object o2, Object o3) {
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", department=" + (department != null ? department.getDepartmentName() : "Nhân viên này chưa có phòng ban") +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
