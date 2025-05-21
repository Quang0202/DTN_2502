package com.vti.QLNV.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Table(name= "Department", uniqueConstraints = @UniqueConstraint(columnNames={"departmentName", "abc"}))
public class Department {
    @Id
    private Integer departmentId;

    @ColumnDefault("sale")
    @Column(nullable = false)
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;

}

