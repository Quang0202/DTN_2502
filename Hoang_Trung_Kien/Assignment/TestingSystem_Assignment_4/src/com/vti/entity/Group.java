package com.vti.entity;

import java.time.LocalDateTime;

public class Group {
    private int groupId;
    private String groupName;
    private Account creator;
    private LocalDateTime createDate;
    private Account[] accounts;
    private LocalDateTime[] joinDate;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public LocalDateTime[] getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime[] joinDate) {
        this.joinDate = joinDate;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Group() {
    }

    public Group(String groupName, Account creator, Account[] accounts, LocalDateTime createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String groupName, Account creator, String[] usernames, LocalDateTime createDate) {
        this.groupName = groupName;
        this.creator = creator;
        Account[] accounts = new Account[usernames.length];
        int i = 0;
        for (String username : usernames) {
            accounts[i] = new Account();
            accounts[i].setUserName(username);
            i++;
        }
        this.accounts = accounts;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "com.vti.entity.Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
