package com.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    int groupId;
    public String groupName;
    Account creator;
    LocalDate createDate;
    Account[] accounts;

    // a) Constructor không có tham số
    public Group() {
    }

    // b) Constructor với groupName, creator, danh sách Account[], createDate
    public Group(String groupName, Account creator, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    // c) Constructor với groupName, creator, danh sách usernames[], createDate
    public Group(String groupName, Account creator, String[] usernames, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;

        // Tạo danh sách Account từ usernames (chỉ có username, các thông tin khác = null)
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            this.accounts[i] = new Account();
            this.accounts[i].username = usernames[i];
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", creator=" + (creator != null ? creator.username : "N/A") +
                ", accounts=" + Arrays.toString(accounts) +
                ", createDate=" + createDate +
                '}';
    }
}
