package com.company.entity;

import com.company.entity.TestingSystem6.ScannerUtils;

import java.io.Serializable;

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    private int departmentId;
    private String departmentName;
    private ScannerUtils scannerUtils = new ScannerUtils();

    public Department() {
        System.out.print("Nhập id phòng ban: ");
        departmentId = scannerUtils.inputInt("Id is integer");
        System.out.print("Nhập tên phòng ban: ");
        departmentName = scannerUtils.inputString();
    }

    public Department(String departmentName) {
        departmentId = 0;
        this.departmentName = departmentName;
    }

    public Department(int departmentId, String departmentName) {
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

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentName.equals(that.departmentName);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
