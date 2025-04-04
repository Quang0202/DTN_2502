package com.vti.entity;

import java.time.LocalDate;

public class Account {
    private int accountID;
    private String Email;
    private String Username;
    private String FirstName;
    private String LastName;
    private String fullName;
    private String position;
    LocalDate createDate;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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
        Email = email;
        Username = username;
        FirstName = firstName;
        LastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
    public Account(int accountID, String email, String username, String firstName, String lastName, String position) {
        this.accountID = accountID;
        Email = email;
        Username = username;
        FirstName = firstName;
        LastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDate.now();
    }
    public Account(int accountID, String email, String username, String firstName, String lastName, LocalDate createDate, String position) {
        this.accountID = accountID;
        Email = email;
        Username = username;
        FirstName = firstName;
        LastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", Email='" + Email + '\'' +
                ", Username='" + Username + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
