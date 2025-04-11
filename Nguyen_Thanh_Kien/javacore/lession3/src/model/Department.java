package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

 public class Department {
    private int departmentId;
    private String departmentName;
    private String address;

     public Department() {
    }

    public int getDepartmentId(){
         return departmentId;
    }

    public void setDepartmentId(int departmentId){
         this.departmentId = departmentId;
    }

     public String getDepartmentName() {
         return departmentName;
     }

     public void setDepartmentName(String departmentName) {
         this.departmentName = departmentName;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public Boolean compareDepartment(Department department){
        return this.departmentName.equals(department.departmentName);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(departmentName);
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
