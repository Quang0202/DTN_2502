package org.example.entity;

public class Department {
    public Department(int departmentid, String department) {
        this.departmentid = departmentid;
        this.department = department;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentid=" + departmentid +
                ", department='" + department + '\'' +
                '}';
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private int departmentid;
    private String department;

}
