package com.vti.QLNV.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Account {
    @Id
    private Integer accountId;
    private String email;
    private String username;
    private String fullname;
    private LocalDateTime createDate;
    private Department department;
    private Position position;
}

