package com.programming.nhatanh.lesson8.frontend;

import com.programming.nhatanh.lesson8.entity.Student;

import java.util.*;

public class Exercise1Q4_5 {
    public static Set<Student> students = new TreeSet<>(new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            System.out.println( o1.getName().compareTo(o2.getName()));
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    });
    public static Set<Student> studentCopies = new TreeSet<>();
    public static void main(String[] args)  {

        for (int i = 0; i <= 2; i++){
            Student newStudent = new Student(i, "Nguyễn X");
            students.add(newStudent);
        }

        System.out.println(students.size());
        Student newStudent1 = new Student(students.size(), "Nguyễn A");
        students.add(newStudent1);
        Student newStudent2 = new Student(students.size(), "Nguyễn Y");
        students.add(newStudent2);
        System.out.println(students);




//        Map<String, String> studentMap = new HashMap<>();
//        studentMap.put("a", "Nguyen Van A");
//        studentMap.put("b", "Nguyen Van B");
//        studentMap.put("c", "Nguyen Van C");
//        System.out.println(studentMap.get("a"));
//
//        Set<String> keys = studentMap.keySet();
//        for(String s:keys){
//            System.out.println(s);
//        }
//
//
//        Map<String, List<Student>> abc = new HashMap<>();
//        for(Student student : students){
//
//        }
    }
}
