package com.vti.helloworld.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Formula;

import java.util.List;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;

    @Column(name = "departmentName",nullable = false, length = 50, unique = true)
    @ColumnDefault("sale")
    private String departmentName;

    @Formula("Concat(departmentName ,' ', 'abc')")
    private String demoFormula;

    @OneToMany(mappedBy = "department")
    @JsonIgnoreProperties({"department","position"})
    private List<Account> accounts;

//    @ManyToMany
//    @JoinTable(
//            name = "DepartmentPosition",
//            joinColumns = {@JoinColumn(name = "departmentId") },
//            inverseJoinColumns = {@JoinColumn(name = "positionId") }
//    )
    @OneToMany(mappedBy = "department")
    @JsonIgnoreProperties({"accounts","department"})
    private List<DepartmentPosition> positions;


    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department(){

    }

    public Department(int departmentId) {
        this.departmentId = departmentId;
    }

    public List<DepartmentPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<DepartmentPosition> positions) {
        this.positions = positions;
    }

    public String getDemoFormula() {
        return demoFormula;
    }

    public void setDemoFormula(String demoFormula) {
        this.demoFormula = demoFormula;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
