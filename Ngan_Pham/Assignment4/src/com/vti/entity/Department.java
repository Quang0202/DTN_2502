package com.vti.entity;

public class Department {
    private int departmentID;
    private String departmentName;

    // Ex_1_Question1_a
    public Department() {
    }

    // Ex_1_Question1_b
    public Department(String departmentName) {
        this.departmentName = departmentName;

    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
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
                "departmentID=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
