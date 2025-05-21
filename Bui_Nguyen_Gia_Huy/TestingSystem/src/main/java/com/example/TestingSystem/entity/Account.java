package com.example.TestingSystem.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Account",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"email", "username"})})
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short accountID;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(name = "FullName", nullable = false, length = 50)
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "departmentID", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "positionID", nullable = false)
    private Position position;

    @Column(nullable = false)
    private LocalDateTime createDate = LocalDateTime.now();
}
