package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BetRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private Account account;
    private int number;
    private double amount;
    private Date date;
    private boolean isWin;

    public BetRecord(int id, Account account, int number, double amount, Date date) {
        this.id = id;
        this.account = account;
        this.number = number;
        this.amount = amount;
        this.date = date;
        this.isWin = false;
    }

    public int getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("| %-5d | %-15s | %-8d | %-10.2f | %-12s | %-8s |",
                id, account.getUsername(), number, amount, dateFormat.format(date), isWin ? "Won" : "Lost");
    }
}
