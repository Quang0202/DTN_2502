package com.testingsystem_assignment_1;

import java.util.Date;

public class Group {
    int groupId;
    public String groupName;
    Account creator;
    Date createDate;

    public Group(int groupId, String groupName, Account creator, Date createDate) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
    }

    public Group(int groupId, String group_b) {
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
