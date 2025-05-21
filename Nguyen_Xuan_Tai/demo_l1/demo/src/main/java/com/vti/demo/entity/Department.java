package com.vti.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int departmentID;


    private String departmentName;

    @OneToMany(mappedBy = "department")
    @JsonIgnoreProperties({"department","position"})
    private List<Account> accounts;


//    @ManyToMany
//    @JoinTable(
//            name = "DepartmentPosition",
//            joinColumns = {
//                    @JoinColumn(name ="depaertmentId")
//            },
//            inverseJoinColumns = {
//                    @JoinColumn(name = "positionId")
//            }
//    )
    @OneToMany(mappedBy = "department")
    @JsonIgnoreProperties({"departments","accounts"})
//    private List<Position> positions;
    private List<DepartmentPosition> departmentPositions;

    public Department(int departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }
    public Department() {

    }

//    public List<Position> getPositions() {
//        return positions;
//    }
//
//    public void setPositions(List<Position> positions) {
//        this.positions = positions;
//    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
