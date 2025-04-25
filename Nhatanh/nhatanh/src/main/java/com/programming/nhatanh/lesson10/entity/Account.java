package com.programming.nhatanh.lesson10.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class Account {
    private int accountId;
    private String email;
    private String userName;
    private String fullName;
    private String departmentName;
    private Integer positionId;
    private LocalDate createDate;
    private Gender gender;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Date getCreateDate() {
        return (Date) Date.from(createDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Account(int accountId, String email, String userName, String fullName, String departmentName, Integer positionId, LocalDate createDate, Gender gender) {
        this.accountId = accountId;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.departmentName = departmentName;
        this.positionId = positionId;
        this.createDate = createDate;
        this.gender = gender;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", positionId=" + positionId +
                ", createDate=" + createDate +
                ", gender=" + gender +
                '}';
    }
}
