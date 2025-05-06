package com.vti.entity;

import java.time.LocalDate;

public class Account {
    private int accountID;
    private String email;
    private String userName;
    private String fullName;
    private Position position;
    private LocalDate createDate;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Account(){
    }

    public Account(int accountID, String email, String username, String firstName, String lastName) {
        this.accountID = accountID;
        this.email = email;
        this.userName = username;
        this.fullName = firstName + " " + lastName;
    }

    public Account(int accountID, String email, String username, String firstName, String lastName, Position position) {
        this.accountID = accountID;
        this.email = email;
        this.userName = username;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    public Account(int accountID, String email, String username, String firstName, String lastName, LocalDate createDate, Position position) {
        this.accountID = accountID;
        this.email = email;
        this.userName = username;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", Email='" + email + '\'' +
                ", Username='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
