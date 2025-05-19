package com.vti.testingsytem.entity;

import com.vti.testingsytem.converter.PositionNameConverter;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "positionId", columnDefinition = "TINYINT UNSIGNED")
    private int positionId;

    @Column(nullable = false, unique = true)
    @Convert(converter = PositionNameConverter.class)
    private EPositionName positionName;

    @OneToMany(mappedBy = "position", fetch = FetchType.LAZY)
    private Set<Account> accounts;

    public Position() {
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public EPositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(EPositionName positionName) {
        this.positionName = positionName;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}
