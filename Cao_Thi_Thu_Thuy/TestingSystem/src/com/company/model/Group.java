package com.company.model;

import java.time.LocalDate;

public class Group {
    private int groupId;
    private String groupName;
    private Account createAccount;
    private LocalDate createDate;

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
}
