package com.vti.helloworld.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vti.helloworld.converter.PositionNameConverter;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Position")
public class Position {
    @Id
    @Column(name = "positionId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer positionId;

    @Column(name = "positionName", nullable = false, unique = true)
    @Convert(converter = PositionNameConverter.class)
    private PositionName positionName;

    @OneToMany(mappedBy = "position")
    @JsonIgnoreProperties({"department","position"})
    private List<Account> accounts;

    @OneToMany(mappedBy = "position")
    private List<DepartmentPosition> DepartmentPosition;


    public Position(){}

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

    public List<DepartmentPosition> getDepartmentPosition() {
        return DepartmentPosition;
    }

    public void setDepartmentPosition(List<DepartmentPosition> departmentPosition) {
        DepartmentPosition = departmentPosition;
    }
}
