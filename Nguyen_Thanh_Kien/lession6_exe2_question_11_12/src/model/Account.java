package model;

import utils.InvalidAgeInputingException;
import utils.ScannerUtils;

import java.time.LocalDate;

public class Account {
    private int accountId;
    private String fullName;
    private int age;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account() throws InvalidAgeInputingException {
        System.out.println("Enter Id:");
        this.accountId = ScannerUtils.inputInt("Please input number as integer");
        System.out.println("Enter Full Name:");
        this.fullName = ScannerUtils.inputString();
        System.out.println("Enter Age:");
        this.age = ScannerUtils.inputAge();
    }
}
