package com.vti.entity;

import java.util.Objects;

public class Department {
     int departmentId;
     String departmentName;

     public Department(int id, String name){
         this.departmentId = id;
         this.departmentName = name;
     }

    public Department(String name){
        this.departmentName = name;
    }

    public Department(){
    }

    @Override
    public String toString() {
        return "com.vti.entity.Department{" +
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

    @Override
    public int hashCode() {
        return Objects.hashCode(departmentName);
    }
}
