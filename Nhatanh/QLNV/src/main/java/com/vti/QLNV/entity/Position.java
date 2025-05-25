package com.vti.QLNV.entity;

import com.vti.QLNV.converter.PositionNameConverter;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "positionId")
    private Integer positionId;
    @Column(name = "positionName", nullable = false, unique = true)
    @Convert(converter = PositionNameConverter.class)
    private PositionName positionName;

    public Position() {
    }

    public Position(Integer positionId, PositionName positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    @OneToMany(mappedBy = "position")
    private List<Account> accounts;

    public Position(PositionName positionName) {
        this.positionName = positionName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
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
