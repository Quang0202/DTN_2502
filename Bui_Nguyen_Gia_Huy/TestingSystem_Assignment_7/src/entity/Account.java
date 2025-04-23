package entity;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private AccountType type;
    private double balance;
    private Date createdDate;

    public enum AccountType {
        ADMIN, USER
    }

    public Account(int id, String username, String password, String fullName, String email, AccountType type) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.type = type;
        this.balance = 0;
        this.createdDate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return String.format("| %-5d | %-15s | %-20s | %-25s | %-10s | %-10.2f |",
                id, username, fullName, email, type, balance);
    }

    public String getDisplayInfo() {
        return String.format("| %-5d | %-15s | %-20s | %-25s | %-10s | %-10.2f |",
                id, username, "********", email, type, balance);
    }
}
