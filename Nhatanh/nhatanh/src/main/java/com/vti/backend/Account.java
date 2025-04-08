package com.vti.backend;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
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

    public void credit(int amount){
        this.balance -= amount;
    }
    public void debit(int amount){
        this.balance += amount;
    }

    public void transferTo(Account account, int amount){
        account.debit(amount);
        credit(amount);
    }

}


