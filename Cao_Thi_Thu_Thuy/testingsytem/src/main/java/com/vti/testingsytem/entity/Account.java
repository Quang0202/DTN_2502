package com.vti.testingsytem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String fullName;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDate createDate;

    @ManyToOne()
    @JoinColumn(name = "departmentId")
    @JsonIgnoreProperties("accounts")
    private Department department;

    @ManyToOne()
    @JoinColumn(name = "positionId")
    @JsonIgnoreProperties("accounts")
    private Position position;
}
