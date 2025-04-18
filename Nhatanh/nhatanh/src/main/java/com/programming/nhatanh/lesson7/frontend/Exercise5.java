package com.programming.nhatanh.lesson7.frontend;


import com.programming.nhatanh.lesson8.entity.Student;

import java.io.*;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        Student newStudent1 = new Student(1, "Nguyễn Văn A");
        Student newStudent2 = new Student(2, "Nguyễn Văn B");
        Student newStudent3 = new Student(3, "Nguyễn Văn C");

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vquan\\OneDrive\\Desktop\\StudentInformation.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.write(newStudent1);
        objectOutputStream.write(newStudent2);
        objectOutputStream.write(newStudent3);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vquan\\OneDrive\\Desktop\\StudentInformation.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    }
}
