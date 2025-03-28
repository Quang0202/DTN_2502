package com.company.exercise.TestingSystem3;

import com.company.model.Department;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise5 {
    public static void main(String[] args) {
        Department department1 = new Department(1, "Dev");
        Department department2 = new Department(2, "HR");
        Department department3 = new Department(3, "R&D");
        Department department4 = new Department(4, "Director");
        Department department5 = new Department(5, "Sale");
        Department[] departments = {department1, department2, department3, department4, department5};
        q6(departments);
    }
    private static void q1(Department[] departments){
        Department department = new Department(1, "Dev");
        System.out.println(department.toString());
    }
    private static void q2(Department[] departments){
        for(Department d: departments){
            System.out.println(d.toString());
        }
    }
    private static void q3(Department[] departments){
        System.out.println(departments[0].getDepartmentName());
    }
    private static void q4(Department[] departments){
        if(departments[1].getDepartmentName() == "Phòng A"){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    private static void q5(Department[] departments){
        System.out.println(departments[0].equals(departments[1]));
    }
    private static void q6(Department[] departments){
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o1.getDepartmentName().compareTo(o2.getDepartmentName());
            }
        });
        q2(departments);
    }
    private static void q7(Department[] departments){
//        tương tự q6
    }
}
