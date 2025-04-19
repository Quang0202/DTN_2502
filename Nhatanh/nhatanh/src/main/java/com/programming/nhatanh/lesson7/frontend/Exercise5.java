package com.programming.nhatanh.lesson7.frontend;


import com.programming.nhatanh.lesson7.entity.MyException;
import com.programming.nhatanh.lesson7.utils.LogUtils;
import com.programming.nhatanh.lesson8.entity.Student;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        Student newStudent1 = new Student(1, "Nguyễn Văn A");
        Student newStudent2 = new Student(2, "Nguyễn Văn B");
        Student newStudent3 = new Student(3, "Nguyễn Văn C");
//        List<Student> students  = Arrays.asList(newStudent1,newStudent2,newStudent3);
//        FileOutputStream fileOutputStream = new FileOutputStream("/Users/doquang/Documents/Test/StudentInformation.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
////        objectOutputStream.write(newStudent1);
////        objectOutputStream.write(newStudent2);
////        objectOutputStream.write(newStudent3);
//        objectOutputStream.writeObject(students);
//        objectOutputStream.close();
//
//        FileInputStream fileInputStream = new FileInputStream("/Users/doquang/Documents/Test/StudentInformation.ser");
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        List<Student> studentResult = (List<Student>) objectInputStream.readObject();
//        for(Student student: studentResult){
//            System.out.println(student);
//        }
        try{
            throw new MyException("this is message!");
        }catch (MyException e){
            LogUtils.writeLog(e);
        }

        LogUtils.readLog();


        Student student1 = (Student) objectInputStream.readObject();
        Student student2 = (Student) objectInputStream.readObject();
        Student student3 = (Student) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }

}
