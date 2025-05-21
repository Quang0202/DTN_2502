package com.vti.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.mapping.Join;

import java.util.List;

@Entity
@Table(name = "`Account`")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int AccountId;

    private String email;
    private String username;
    private String fullName;


    @ManyToOne
    @JoinColumn(name = "departmentId" )
    @JsonIgnoreProperties("accounts")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "positionId")
    @JsonIgnoreProperties("accounts")
private Position position;



public Account() {

}

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        position = position;
    }


}
