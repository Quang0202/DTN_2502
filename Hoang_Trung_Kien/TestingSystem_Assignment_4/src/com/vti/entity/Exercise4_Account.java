package com.vti.entity;

public class Exercise4_Account {
    private String id;
    private String name;
    private int balance;

    public Exercise4_Account(String id, String name, int balance) {
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

    public int credit(int amount) {
        return amount;
    }

    public int debit(int amount) {
        return amount;
    }

    public void transferTo(Exercise4_Account account, int amount) {
        balance -= amount;
        account.balance += amount;
    }
}
