package com.vti.testingsytem.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentId", columnDefinition = "TINYINT UNSIGNED")
    private int departmentId;
    private String departmentName;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private Set<Account> accounts;

    public Department() {
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}
