package com.company.backend.TestingSystem3;

import com.company.entity.Department;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise5 {
    public void q1(Department[] departments){
        Department department = new Department(1, "Dev");
        System.out.println(department.toString());
    }
    public void q2(Department[] departments){
        for(Department d: departments){
            System.out.println(d.toString());
        }
    }
    public void q3(Department[] departments){
        System.out.println(departments[0].getDepartmentName());
    }
    public void q4(Department[] departments){
        if(departments[1].getDepartmentName() == "Phòng A"){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public void q5(Department[] departments){
        System.out.println(departments[0].equals(departments[1]));
    }
    public void q6(Department[] departments){
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o1.getDepartmentName().compareTo(o2.getDepartmentName());
            }
        });
        q2(departments);
    }
    public void q7(Department[] departments){
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                String[] arrStr1 = o1.getDepartmentName().trim().split("\\s+");
                String[] arrStr2 = o2.getDepartmentName().trim().split("\\s+");
                String str1 = arrStr1[arrStr1.length - 1];
                String str2 = arrStr2[arrStr2.length - 1];
                return str1.compareTo(str2);
            }
        });
        q2(departments);
    }
}
