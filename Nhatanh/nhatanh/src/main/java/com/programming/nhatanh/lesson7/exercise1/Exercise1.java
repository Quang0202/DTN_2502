package com.programming.nhatanh.lesson7.exercise1;

import com.programming.nhatanh.lesson7.entity.Student;

import java.util.ArrayList;

public class Exercise1 {


    public static void main(String[] args) {

        //Q1
        String[] names = {"Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C"};
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for( int i = 0; i <= 2; i++){
            int id = i + 1;
            Student newStudent = new Student(id, names[i]);
            studentArrayList.add(newStudent);
        }

        for(Student i : studentArrayList){
            System.out.println(i);
        }

        Student.college = "Đại học công nghệ";

        for(Student i : studentArrayList){
            System.out.println(i);
        }

        //Q2
        //Nộp quỹ
        for(Student i : studentArrayList){
            i.increaseMoneyGroup(100000);
        }
        System.out.println(Student.moneyGroup);
        //B2:
        studentArrayList.get(0).decreaseMoneyGroup(50000);
        System.out.println(Student.moneyGroup);
        //B3:
        studentArrayList.get(1).decreaseMoneyGroup(20000);
        System.out.println(Student.moneyGroup);
        //B4:
        studentArrayList.get(2).decreaseMoneyGroup(150000);
        System.out.println(Student.moneyGroup);
        //B5
        for(Student i : studentArrayList){
            i.increaseMoneyGroup(50000);
        }
        System.out.println(Student.moneyGroup);


        for( int i = 0; i <= 9; i++){
            int id = i + 1;
            Student newStudent = new Student(id, "Example " + i);
            studentArrayList.add(newStudent);
            System.out.println(newStudent);
        }
    }

}
