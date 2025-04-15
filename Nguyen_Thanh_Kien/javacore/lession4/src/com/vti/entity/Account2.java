package com.vti.entity;

public class Account2 {
    private String id;
    private String name;
    private int balance;

    public Account2(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount){
        this.balance += amount;
    }

    public void debit(int amount){
        this.balance -= amount;
    }
    public void transferTo(Account2 account, int amount){
        this.setBalance(this.getBalance() - amount);
        account.setBalance(account.getBalance() + amount);
    }
}
