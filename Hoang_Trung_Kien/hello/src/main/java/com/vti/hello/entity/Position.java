package com.vti.hello.entity;

import com.vti.hello.converter.PositionNameConverter;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Position")
public class Position {

    @Id
    @Column(name = "positionId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int positionId;

    @Column(name = "positionName", nullable = false, unique = true)
    @Convert(converter = PositionNameConverter.class)
    private PositionName positionName;

    @OneToMany(mappedBy = "position")
    private List<Account> accounts;

    public Position() {
    }

    public Position(int positionId) {
        this.positionId = positionId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
