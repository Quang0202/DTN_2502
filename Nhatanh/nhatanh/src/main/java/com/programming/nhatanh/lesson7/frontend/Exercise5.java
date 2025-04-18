package com.programming.nhatanh.lesson7.frontend;


import com.programming.nhatanh.lesson7.entity.Student;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student newStudent1 = new Student(1, "Nguyễn Văn A");
        Student newStudent2 = new Student(2, "Nguyễn Văn B");
        Student newStudent3 = new Student(3, "Nguyễn Văn C");
        List<Student> students = Arrays.asList(newStudent1, newStudent3, newStudent3);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vquan\\OneDrive\\Desktop\\StudentInformation.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vquan\\OneDrive\\Desktop\\StudentInformation.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

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
