package vti.fe.assignmentday08;

import vti.be.assignmentday08.exercise05.Question01;
import vti.be.assignmentday08.exercise05.Student;

import java.io.IOException;
import java.util.ArrayList;

public class Exercise05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Question01 question01 = new Question01();
//        Student student01 = new Student(); Student student02 = new Student(); Student student03 = new Student();
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(student01);
//        students.add(student02);
//        students.add(student03);
//        question01.WriteObject("D:\\\\\\\\\\\\\\\\Data\\\\\\\\\\\\\\\\test\\\\\\\\\\\\\\\\StudentInformation.ser", students);
                System.out.println(question01.ReadObject("D:\\\\\\\\\\\\\\\\Data\\\\\\\\\\\\\\\\test\\\\\\\\\\\\\\\\StudentInformation.ser"));


    }
}
