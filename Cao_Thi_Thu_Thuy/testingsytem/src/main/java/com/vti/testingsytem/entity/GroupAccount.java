package com.vti.testingsytem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class GroupAccount {
    @EmbeddedId
    private GroupAccountId groupAccountId;

    private LocalDate joinDate;

    public GroupAccount() {
    }
}
