package com.vti.entity;

public class Department {

    private final int DEFAULT_ID = 0;

    private int departmentId;
    private String departmentName;
    private String address;

    public Department() {
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.departmentId = DEFAULT_ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Boolean checkDepartmentName(String nameCheck){
        return this.departmentName.equals(nameCheck);
    }

    public Boolean compareDepartment(Department department){
        return this.departmentName.equals(department.getDepartmentName());
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
