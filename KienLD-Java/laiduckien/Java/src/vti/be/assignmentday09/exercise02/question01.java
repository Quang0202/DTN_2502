package vti.be.assignmentday09.exercise02;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collection.*;

public class question01 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "a", "2001", 1);
        Student student2 = new Student(2, "b", "1996", 2);
        Student student3 = new Student(3, "c", "1989", 3);
        Student student4 = new Student(4, "e", "2002", 4);
        Student student5 = new Student(5, "d", "2003", 5);


        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Collections.sort(students);
        for(Student student : students) {
            System.out.println(student);
        }
    }





}
