package com.vti.entity;

public class Department {
    private int departmentId;
    private String departmentName;

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
    public Department(int departmentId,String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
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
}
