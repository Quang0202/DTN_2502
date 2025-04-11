package com.programming.nhatanh.lesson6.exercise2.entity;

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
        ScannerUtils scannerUtils = new ScannerUtils();
        departmentId = scannerUtils.inputInt("Invalid input");
        departmentName = scannerUtils.inputString();
    }

    public Department(String departmentName) {
        this.departmentId = 0;
        this.departmentName = departmentName;
    }
}
