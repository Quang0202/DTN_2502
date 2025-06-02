package com.vti.helloworld.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "`Account`")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    private String email;

    private String userName;

    private String fullName;
    @ManyToOne
    @JoinColumn(name = "positionId")
    @JsonIgnoreProperties("accounts")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    @JsonIgnoreProperties("accounts")
    private Department department;


    private LocalDateTime createDate;

    @PrePersist
    public void prePersist(){
        createDate = LocalDateTime.now();
    }

}
