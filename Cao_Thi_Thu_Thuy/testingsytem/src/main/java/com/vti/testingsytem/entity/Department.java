package com.vti.testingsytem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentId", columnDefinition = "TINYINT UNSIGNED")
    private int departmentId;

    @Column(nullable = false, unique = true)
    private String departmentName;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private Set<Account> accounts;
}
