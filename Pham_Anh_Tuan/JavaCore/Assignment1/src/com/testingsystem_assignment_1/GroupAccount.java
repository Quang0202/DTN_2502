package com.testingsystem_assignment_1;

import java.util.Date;

public class GroupAccount {
    int groupId;
    Account account;
    Date joinDate;

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
}
