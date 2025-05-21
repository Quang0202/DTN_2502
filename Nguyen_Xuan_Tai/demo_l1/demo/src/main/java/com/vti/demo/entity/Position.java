package com.vti.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vti.demo.converter.PositionNameConverter;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Position")
public class Position {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "positionId")
    private int positionId;
@Column(name = "positionName",nullable = false,unique = true)
//@Enumerated(EnumType.STRING)

@Convert(converter = PositionNameConverter.class)
    private PositionName positionName ;


@OneToMany(mappedBy = "position")

private List<Account> accounts;

@ManyToMany(mappedBy = "positions")
@JsonIgnoreProperties("positions")
    private List<Department> departments;

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }



    public Position(int positionId, PositionName positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }
    public Position() {

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

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionName=" + positionName +
                '}';
    }
}
