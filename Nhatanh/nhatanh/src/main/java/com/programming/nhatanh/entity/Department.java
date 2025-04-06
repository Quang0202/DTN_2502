package com.programming.nhatanh.entity;

public class Department {
    public int departmentId;
    public String departmentName;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;

        return departmentName.equals(that.departmentName);
    }

    public Department() {
    }

    public Department(String departmentName) {
        this.departmentId = 0;
        this.departmentName = departmentName;
    }
}
