package com.programming.nhatanh.lesson8.frontend;

import com.programming.nhatanh.lesson8.entity.Student;

import java.util.ArrayList;
import java.util.Collections;

public class E2Q1 {
    public static void main(String[] args)  {
        Student newStudent1 = new Student(1, "Nguyễn T");
        Student newStudent2 = new Student(2, "Nguyễn W");
        Student newStudent3 = new Student(3, "Nguyễn A");
        Student newStudent4 = new Student(4, "Nguyễn R");
        Student newStudent5 = new Student(5, "Nguyễn C");
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(newStudent1);
        listStudent.add(newStudent2);
        listStudent.add(newStudent3);
        listStudent.add(newStudent4);
        listStudent.add(newStudent5);
        Collections.sort(listStudent);
        System.out.println(listStudent);
    }
}
