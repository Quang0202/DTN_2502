package com.vti.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int AccountID;
    private String Email;
    private String Username;
    private String FullName;

//  @EmbeddedId
//private GroupAccountPK id;

public Account() {

}

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

//    public GroupAccountPK getId() {
//        return id;
//    }
//
//    public void setId(GroupAccountPK id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountID=" + AccountID +
                ", Email='" + Email + '\'' +
                ", Username='" + Username + '\'' +
                ", FullName='" + FullName + '\'' +
//                ", id=" + id +
                '}';
    }
}
