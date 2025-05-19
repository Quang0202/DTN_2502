package com.vti.demo.entity;

import jakarta.persistence.*;

@Entity

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int departmentID;


    private String departmentName;

    public Department(int departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }
    public Department() {

    }

    public int getDepartmentId() {
        return departmentID;
    }

    public void setDepartmentId(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
