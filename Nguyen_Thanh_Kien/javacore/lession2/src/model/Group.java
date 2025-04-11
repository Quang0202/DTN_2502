package model;

import java.time.LocalDate;

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
}
