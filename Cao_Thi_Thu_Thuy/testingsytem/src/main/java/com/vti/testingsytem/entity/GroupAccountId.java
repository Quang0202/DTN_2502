package com.vti.testingsytem.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class GroupAccountId implements Serializable {
    private int groupId;
    private int accountId;
}
