package com.programming.nhatanh.lesson9.frontend;

import com.programming.nhatanh.lesson9.entity.Student;

import java.util.Calendar;
import java.util.Date;

public class E2 {
    public static void main(String[] args)  {
        @SuppressWarnings("deprecation")
        Date date = new Date(2020, Calendar.MAY, 18);
        System.out.println(date);

        Student newStudent = new Student("Nguyễn Văn A");
        System.out.println(newStudent.getName());
        System.out.println(newStudent.getId());
        System.out.println(newStudent.getIdNew());
    }
}
