package com.company.backend.TestingSystem4;

public class Account_TS4 {
    private String id;
    private String name;
    private int balance;

    public Account_TS4(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Số dư không đủ");
        }
    }

    public void transferTo(Account_TS4 account, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            account.credit(amount);
        } else {
            System.out.println("Số dư không đủ để chuyển khoản");
        }
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}

