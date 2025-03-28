package com.programming.nhatanh.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Group {
    public int groupId;
    public String groupName;
    public Account creator;
    public LocalDateTime createDate;
    public List<Account> accounts;

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
