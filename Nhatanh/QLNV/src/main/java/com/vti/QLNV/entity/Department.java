package com.vti.QLNV.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Table(name= "Department", uniqueConstraints = @UniqueConstraint(columnNames={"departmentName", "abc"}))
public class Department {
    @Id
    @Column(name = "departmentId")
    private Integer departmentId;

    @ColumnDefault("sale")
    @Column(name = "departmentName", nullable = false)
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;

    public Department() {
    }

    public Department(Integer departmentId, String departmentName, List<Account> accounts) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.accounts = accounts;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}

