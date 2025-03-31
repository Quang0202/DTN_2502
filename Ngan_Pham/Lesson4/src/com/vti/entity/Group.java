package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private int groupId;
    private String groupName;
    private Account creator;
    private LocalDate createDate;
    private Account[] accounts;
    private LocalDate[] joinDate;

    public LocalDate[] getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate[] joinDate) {
        this.joinDate = joinDate;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
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

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Group() {
    }

//    exe1Question3b
    public Group(String groupName, Account creator, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    //    exe1Question3c
    public Group(String groupName, Account creator, LocalDate createDate, String[] usernames) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        this.accounts = this.getAccountByUsernames(usernames);
    }

    private Account[] getAccountByUsernames(String[] usernames){
        Account[] accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account account = new Account();
            account.setUserName(usernames[i]);
            accounts[i] = account;
        }
        return accounts;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                ", joinDate=" + Arrays.toString(joinDate) +
                '}';
    }
}
