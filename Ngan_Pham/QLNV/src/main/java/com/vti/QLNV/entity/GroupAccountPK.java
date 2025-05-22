package com.vti.QLNV.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class GroupAccountPK {
    @Column(name = "accountId")
    private int accountId;
    @Column(name = "groupId")
    private int groupId;

    public GroupAccountPK(){}
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
