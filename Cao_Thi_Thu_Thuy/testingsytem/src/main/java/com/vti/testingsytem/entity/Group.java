package com.vti.testingsytem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "`Group`")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;

    @Column(nullable = false, unique = true)
    private String groupName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorId")
    private Account createAccount;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDate createDate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "GroupAccount", joinColumns = { @JoinColumn(name = "groupId") }, inverseJoinColumns = {
            @JoinColumn(name = "accountId") })
    private Set<Account> accounts;
}
