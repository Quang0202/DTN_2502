package com.programming.nhatanh.lesson5.exercise2.question1;

import java.text.ParseException;
import java.util.ArrayList;

public class Demo {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) throws ParseException {

        Student newStudent1 = new Student(1, "Nguyễn Văn A", 1);
        Student newStudent2 = new Student(2, "Nguyễn Văn B", 1);
        Student newStudent3 = new Student(3, "Nguyễn Văn C", 2);
        Student newStudent4 = new Student(4, "Nguyễn Văn D", 2);
        Student newStudent5 = new Student(5, "Nguyễn Văn E", 3);
        Student newStudent6 = new Student(6, "Nguyễn Văn F", 3);
        Student newStudent7 = new Student(7, "Nguyễn Văn G", 1);
        Student newStudent8 = new Student(8, "Nguyễn Văn H", 2);
        Student newStudent9 = new Student(9, "Nguyễn Văn I", 1);
        Student newStudent10 = new Student(10, "Nguyễn Văn K", 3);
        students.add(newStudent1);
        students.add(newStudent2);
        students.add(newStudent3);
        students.add(newStudent4);
        students.add(newStudent5);
        students.add(newStudent6);
        students.add(newStudent7);
        students.add(newStudent8);
        students.add(newStudent9);
        students.add(newStudent10);

        for (Student i : students){
            i.điểmDanh();
        }

        for (Student i : students){
            if(i.getGroup() == 1){
                i.họcBài();
            }
        }

        for (Student i : students){
            if(i.getGroup() == 2){
                i.điDọnVệSinh();
            }
        }

    }
}
