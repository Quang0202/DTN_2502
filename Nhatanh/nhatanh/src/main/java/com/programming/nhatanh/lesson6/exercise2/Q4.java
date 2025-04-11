package com.programming.nhatanh.lesson6.exercise2;

import com.programming.nhatanh.entity.Department;

import java.util.ArrayList;

public class Q4 {
    static ArrayList<Department> departments = new ArrayList<>();
    public static void main(String[] args) {
        Department newDepartment1 = new Department();
        Department newDepartment2 = new Department();
        Department newDepartment3 = new Department();
        departments.add(newDepartment1);
        departments.add(newDepartment2);
        departments.add(newDepartment3);

        try {
            System.out.println(getIndex(4));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department");
        }

    }

    public static Department getIndex(int a) {
        return departments.get(a);
    }
}
