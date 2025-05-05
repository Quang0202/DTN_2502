package com.programming.nhatanh.lesson10.backend.entity;

import com.vti.entity.Department;
import com.vti.entity.Position;

import java.time.LocalDateTime;

public class Account {
    private int accountId;
    private String email;
    private String userName;
    private String fullName;
    private String departmentName;
    private Department department;
    private Integer positionId;
    private Position position;
    private LocalDateTime createDate;
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

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Account(int accountId, String email, String userName, String fullName, String departmentName, Integer positionId, LocalDateTime createDate, Gender gender) {
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
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", gender=" + gender +
                '}';
    }
}
