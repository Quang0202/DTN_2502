package com.vti.QLNV.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vti.QLNV.annotation.EmailNotExist;
import com.vti.QLNV.annotation.UsernameNotExist;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountId")
    private Integer accountId;

    @Column(nullable = false, unique = true)
    @NotBlank
    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @EmailNotExist
    private String email;

    @NotBlank
    @Length(min = 6, max = 50, message = "invalid username length")
    @UsernameNotExist
    private String username;

    @NotBlank
    @Max(value = 50, message="fullname has too many characters")
    private String fullname;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    @JsonIgnoreProperties("accounts")
    @JsonBackReference
    private Department department;

    @ManyToOne
    @JoinColumn(name = "positionId")
    @JsonIgnoreProperties("accounts")
    private Position position;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "createDate")
    @PastOrPresent
    private Date createDate;


}

