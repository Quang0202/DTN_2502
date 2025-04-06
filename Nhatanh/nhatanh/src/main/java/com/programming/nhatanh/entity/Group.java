package com.programming.nhatanh.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Group {
    public int groupId;
    public String groupName;
    public Account creator;
    public LocalDateTime createDate;
    public List<Account> accounts;

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
            newAccount.userName = i;
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
