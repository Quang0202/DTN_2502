package com.company.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private int groupId;
    private String groupName;
    private Account createAccount;
    private LocalDate createDate;
    private Account[] accounts;

    public Group() {
    }

    public Group(String groupName, Account createAccount, LocalDate createDate, Account[] accounts) {
        this.groupName = groupName;
        this.createAccount = createAccount;
        this.createDate = createDate;
        this.accounts = accounts;
    }
    public Group(String groupName, Account createAccount, LocalDate createDate, String[] usernames) {
        this.groupName = groupName;
        this.createAccount = createAccount;
        this.createDate = createDate;
        this.accounts = new Account[usernames.length];
        for(int i = 0; i < usernames.length; i++){
            accounts[i] = new Account(usernames[i]);
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

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", createAccount=" + createAccount +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
