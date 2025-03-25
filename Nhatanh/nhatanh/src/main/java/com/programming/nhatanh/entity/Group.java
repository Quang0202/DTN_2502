package com.programming.nhatanh.entity;

import java.time.LocalDateTime;

public class Group {
    public int groupId;
    public String groupName;
    public Account creator;
    public LocalDateTime createDate;
    public Account[] accounts;
    public LocalDateTime[] joinDate;
}
