package com.vti.testingsytem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class GroupAccountId implements Serializable {

    @Column(nullable = false)
    private int groupId;

    @Column(nullable = false)
    private int accountId;
}
