package vti.be.assignmentday09.exercise01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static javax.swing.UIManager.get;

public class Question04 {
    static Set<Student> students = new HashSet<>();

    public static void main(String[] args) {

        students.add(new Student("a"));
        students.add(new Student("b"));
        students.add(new Student("c"));
        students.add(new Student("d"));
        students.add(new Student("d"));
        students.add(new Student("d"));

        khongtrungnhau();



    }

    static Set<String> studentCopies = new HashSet<>();
    public static void khongtrungnhau() {
        for (Student student : students) {
            studentCopies.add(student.getName());
        }
        System.out.println(studentCopies);
    }








}
