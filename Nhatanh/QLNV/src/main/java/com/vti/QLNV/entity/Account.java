package com.vti.QLNV.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    private String email;
    private String username;
    private String fullname;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    @JsonIgnoreProperties("accounts")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "positionId")
    @JsonIgnoreProperties("accounts")
    private Position position;

    private LocalDateTime createDate;


    public Account(Integer accountId, String email, String username, String fullname, LocalDateTime createDate, Department department, Position position) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.createDate = createDate;
        this.department = department;
        this.position = position;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}

