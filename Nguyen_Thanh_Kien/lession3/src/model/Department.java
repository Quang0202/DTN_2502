package model;

import java.util.Arrays;
import java.util.Collections;

public class Department {
    private int departmentId;
    private String departmentName;
    private String address;

    public Department() {
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
