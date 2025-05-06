package com.vti.entity;

public class Account_4 {
    private String id;
    private String name;
    private int balance;

    public Account_4(String id, String name, int balance) {
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
        }else {
            System.out.println("So tien ko du");
        }
    }
    public void transferTo(Account_4 account, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            account.credit(amount);
        } else {
            System.out.println("So tien ko du");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account_4{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
