package com.company.frontend.TestingSystem7;

import com.company.backend.TestingSystem7.Exercise1;
import com.company.entity.TestingSystem7.HinhHocException;
import com.company.entity.TestingSystem7.Student;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) throws HinhHocException {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Exercise1 exercise = new Exercise1();
        exercise.q2(students);
//        exercise.q8();
    }
}
