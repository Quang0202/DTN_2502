package com.vti.testingsytem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @Column(nullable = false, unique = true)
    @NotBlank
    @Size(min = 6, max = 50)
    @UniqueUsername
    private String username;

    @Column(nullable = false)
    @NotBlank
    @Size(max = 50)
    private String fullName;

    @Column(nullable = false)
    @NotBlank
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(updatable = false)
    @CreationTimestamp
    @PastOrPresent(message = "CreateDate không được lớn hơn ngày hiện tại")
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
