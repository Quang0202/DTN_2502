package MaiTienThanh.src.com.vti.entity;

import java.time.LocalDate;

public class Group {
    private  Account[] accounts;
    private int groupId;
    private String groupName;
    private Account createAccount;
    private LocalDate createDate;

    public Group() {
        this.groupId = groupId;
        this.groupName = groupName;
        this.createAccount = createAccount;
        this.createDate = createDate;
    }

    public Group(String groupName, Account createAccount, LocalDate createDate, Account[] accounts) {
        this.groupName = groupName;
        this.createAccount = createAccount;
        this.createDate = createDate;
        this.accounts = accounts;

    }
    public Group(String GroupName, Account createAccount, LocalDate createDate, String[] usernames) {
        this.groupName = GroupName;
        this.createAccount = createAccount;
        this.createDate = createDate;
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            accounts[i] = new Account(usernames[i]);
        }
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

