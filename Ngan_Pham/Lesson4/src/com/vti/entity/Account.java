package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    private int accountId;
    private String userName;
    private String fullName;
    private String firstName;
    private String lastName;
    private Department department;
    private Position position;
    private LocalDate createDate;
    private String email;
    private Group[] groups;
    private LocalDate[] joinDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate[] getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate[] joinDate) {
        this.joinDate = joinDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account() {
    }

//    exe1Question2b
    public Account(int accountId, String userName, String email, String firstName, String lastName) {
        this.accountId = accountId;
        this.userName = userName;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    //    exe1Question2c
    public Account(int accountId, String userName, Position position, String email, String firstName, String lastName) {
        this.accountId = accountId;
        this.userName = userName;
        this.position = position;
        this.createDate = LocalDate.now();
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    //    exe1Question2d
    public Account(int accountId, String userName, String firstName, String lastName, Position position, LocalDate createDate, String email) {
        this.accountId = accountId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.createDate = createDate;
        this.email = email;
        this.fullName = firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", email='" + email + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", joinDate=" + Arrays.toString(joinDate) +
                '}';
    }
}
