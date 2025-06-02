package com.example.TestingSystem.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID")
    private Short departmentID;

    @Column(name = "DepartmentName", nullable = false, unique = true, length = 30)
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;
}
