package com.vti.entity;

public class Account2 {
    private String id;
    private String name;
    private int balance;

    // Constructor
    public Account2(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter cho ID
    public String getID() {
        return id;
    }

    // Getter cho Name
    public String getName() {
        return name;
    }

    // Getter cho Balance
    public int getBalance() {
        return balance;
    }

    // Nạp tiền vào tài khoản
    public void credit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Trừ tiền từ tài khoản
    public void debit(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Số dư không đủ!");
        }
    }

    // Chuyển tiền từ tài khoản này sang tài khoản khác
    public void transferTo(Account2 account, int amount) {
        if (amount > 0 && amount <= balance) {
            this.debit(amount);
            account.credit(amount);
        } else {
            System.out.println("Chuyển khoản thất bại! Số dư không đủ.");
        }
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
