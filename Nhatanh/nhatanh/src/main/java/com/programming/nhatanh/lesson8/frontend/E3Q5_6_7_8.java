package com.programming.nhatanh.lesson8.frontend;

import com.programming.nhatanh.lesson8.entity.*;

import java.util.ArrayList;
import java.util.Arrays;

public class E3Q5_6_7_8 {
    public static void main(String[] args)  {

        ArrayList<Integer> salary1 = new ArrayList<>(Arrays.asList(1, 2, 3)); ;
        ArrayList<Float> salary2 = new ArrayList<>(Arrays.asList(1.2f, 2.3f, 3.4f)); ;
        ArrayList<Double> salary3 = new ArrayList<>(Arrays.asList(1.2, 2.5, 3.6)); ;

        Employee<Integer> newEmployee1 = new Employee<Integer>(1, "A", salary1);
        System.out.println(newEmployee1);
        Employee<Float> newEmployee2 = new Employee<Float>(2, "B", salary2);
        System.out.println(newEmployee2);
        Employee<Double> newEmployee3 = new Employee<Double>(3, "C", salary3);
        System.out.println(newEmployee3);


        MyMap<Integer, String> studentMap = new MyMap<>();
        studentMap.put(1, "Nguyễn V");
        System.out.println(studentMap.getKey());
        System.out.println(studentMap.getValue(1));


        Phone<String> newPhone1 = new Phone<String>("Nguyễn V", "098222898");
        Phone<String> newPhone2 = new Phone<String>("NguyenV@gmail.com", "098222898");
        Phone<Integer> newPhone3 = new Phone<Integer>(3, "098222898");
        System.out.println(newPhone1.getKey());
        System.out.println(newPhone2.getKey());
        System.out.println(newPhone3.getKey());
        System.out.println(newPhone1.getPhoneNumber("Nguyễn V"));
        System.out.println(newPhone2.getPhoneNumber("NguyenV@gmail.com"));
        System.out.println(newPhone3.getPhoneNumber(3));

        Staff<Integer> staffList = new Staff<Integer>();
        staffList.addStaff(1, "Nguyễn V");
        System.out.println(staffList.getId());
        System.out.println(staffList.getName(1));

    }
}
