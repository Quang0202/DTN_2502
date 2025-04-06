package com.vti.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Group {
    private int groupId;
    private String groupName;
    private Account creator;
    private LocalDateTime createDate;
    private List<Account> accounts;

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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Group() {
    }

    public Group(String groupName, Account creator, LocalDateTime createDate, List<Account> accounts) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        this.accounts = accounts;
    }

    public Group(String groupName, Account creator, LocalDateTime createDate, String[] usernames) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        for (String i : usernames) {
            Account newAccount = new Account();
            newAccount.setUserName(i);
            accounts.add(newAccount);
        }

    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + accounts +
                '}';
    }


}
