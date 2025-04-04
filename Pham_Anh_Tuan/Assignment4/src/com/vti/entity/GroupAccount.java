package com.vti.entity;

import java.util.Date;

public class GroupAccount {
    private int groupId;
    private Account account;
    private Date joinDate;

    public GroupAccount(int groupId, Account account, Date joinDate) {
        this.groupId = groupId;
        this.account = account;
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "GroupAccount{" +
                "groupId=" + groupId +
                ", account=" + account +
                ", joinDate=" + joinDate +
                '}';
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
