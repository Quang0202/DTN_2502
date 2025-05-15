package com.model;

public class Department {
    public int departmentId;
    public String departmentName;
    public String address;

    public Department() {
    }

    public Department( String departmentName) {
        this.departmentId= 0;
        this.departmentName = departmentName;
    }

    public Department(int departmentId, String departmentName, String address) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getAddress() {
        return address;
    }
}
