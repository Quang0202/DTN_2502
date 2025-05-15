package com;

import com.Exercise5.Department;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Initialize departments
        Department dept1 = new Department(1,"Phòng A", "123 Main St");
        Department dept2 = new Department(2,"Phòng B", "456 Elm St");
        Department dept3 = new Department(3,"Marketing", "789 Oak St");
        Department dept4 = new Department(4,"Accounting", "321 Pine St");
        Department dept5 = new Department(5,"Sales", "654 Maple St");

        // Question 1: Print department 1 information
        System.out.println("Question 1: " + dept1);

        // Question 2: Print all department information
        Department[] departments = {dept1, dept2, dept3, dept4, dept5};
        System.out.println("Question 2:");
        for (Department d : departments) {
            System.out.println(d);
        }

        // Question 3: Print address of department 1
        System.out.println("Question 3: " + dept1.address);

        // Question 4: Check if department 1 is named "Phòng A"
        System.out.println("Question 4: " + dept1.getDepartmentName().equals("Phòng A"));

        // Question 5: Compare department 1 and department 2 by name
        System.out.println("Question 5: " + dept1.equals(dept2));

        // Question 6: Sort and print department names in alphabetical order
        Arrays.sort(departments, Comparator.comparing(Department::getDepartmentName));
        System.out.println("Question 6:");
        for (Department d : departments) {
            System.out.println(d.getDepartmentName());
        }
    }
}
