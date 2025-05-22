package com.vti.assignment3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountID;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, length = 50)
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "departmentID", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "positionID", nullable = false)
    private Position position;

    @Column(name = "createDate")
    private LocalDateTime createDate = LocalDateTime.now();
}
