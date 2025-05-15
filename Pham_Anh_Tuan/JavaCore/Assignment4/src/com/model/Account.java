package com.model;

import java.time.LocalDate;
import java.util.Date;


public class Account {
    public int accountId;
    public String username;
    public String email;
    private String firstName;
    private String lastName;
    public String fullName;
    public Gender gender;
    public Department department;
    public Position position;
    public LocalDate createDate;
    public Group[] groups;


    // a) Constructor không có tham số
    public Account() {
    }

    // b) Constructor với id, email, username, firstName, lastName (FullName = FirstName + " " + LastName)
    public Account(int accountId, String email, String username, String firstName, String lastName) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    // c) Constructor với id, email, username, firstName, lastName, Position (FullName = FirstName + " " + LastName)
    // và createDate mặc định là ngày hiện tại
    public Account(int accountId, String email, String username, String firstName, String lastName, Position position) {
        this(accountId, email, username, firstName, lastName);
        this.position = position;
        this.createDate = LocalDate.now();
    }

    // d) Constructor với id, email, username, firstName, lastName, Position và createDate
    public Account(int accountId, String email, String username, String firstName, String lastName, Position position, LocalDate createDate) {
        this(accountId, email, username, firstName, lastName);
        this.position = position;
        this.createDate = createDate;
    }

    public Account(String admin) {
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position=" + (position != null ? position.positionName : "N/A") +
                ", createDate=" + (createDate != null ? createDate : "N/A") +
                '}';
    }
}
