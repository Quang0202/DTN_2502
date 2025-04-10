package com.company.entity;

import com.company.entity.TestingSystem6.ScannerUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private int groupId;
    private String groupName;
    private Account createAccount;
    private LocalDate createDate;
    private List<Account> accounts = new ArrayList<>();
    private ScannerUtils scannerUtils = new ScannerUtils();

    public Group() {
        System.out.print("Nhập tên group: ");
        groupName = scannerUtils.inputString();
        createDate = LocalDate.now();
        System.out.println("Nhập tài khoản tạo group");
        createAccount = new Account();
        System.out.print("Số người muốn thêm vào nhóm: ");
        int n = scannerUtils.inputInt("Please input integer");
        for (int i = 0; i < n; i++){
            System.out.println("Nhập tài khoản thứ " + (i + 1));
            Account account = new Account();
            accounts.add(account);
        }
    }

    public Group(String groupName, Account createAccount, LocalDate createDate, List<Account> accounts) {
        this.groupName = groupName;
        this.createAccount = createAccount;
        this.createDate = createDate;
        this.accounts = accounts;
    }
    public Group(String groupName, Account createAccount, LocalDate createDate, String[] usernames) {
        this.groupName = groupName;
        this.createAccount = createAccount;
        this.createDate = createDate;
        for(int i = 0; i < usernames.length; i++){
            accounts.add(new Account(usernames[i]));
        }
    }

    public Group(int groupId, String groupName, Account createAccount, LocalDate createDate) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.createAccount = createAccount;
        this.createDate = createDate;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(Account createAccount) {
        this.createAccount = createAccount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", createAccount=" + createAccount +
                ", createDate=" + createDate +
                ", accounts=" + accounts.toString() +
                '}';
    }
}
