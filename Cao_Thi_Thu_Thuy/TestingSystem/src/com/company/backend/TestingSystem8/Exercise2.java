package com.company.backend.TestingSystem8;

import com.company.entity.TestingSystem8.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise2 {
    public void q1(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "An", LocalDate.of(2002, 5, 10), 8.0f));
        students.add(new Student(2, "Binh", LocalDate.of(2001, 3, 15), 7.5f));
        students.add(new Student(3, "An", LocalDate.of(2002, 5, 10), 9.0f));
        students.add(new Student(4, "Cuong", LocalDate.of(2000, 12, 1), 6.8f));
        students.add(new Student(5, "Binh", LocalDate.of(2001, 3, 10), 8.5f));
        Collections.sort(students);
        for (Student s : students){
            System.out.println(s.thongTinStudent());
        }
    }
    public void q2(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "An", LocalDate.of(2002, 5, 10), 8.0f));
        students.add(new Student(2, "Binh", LocalDate.of(2001, 3, 15), 7.5f));
        students.add(new Student(3, "An", LocalDate.of(2002, 5, 10), 9.0f));
        students.add(new Student(4, "Cuong", LocalDate.of(2000, 12, 1), 6.8f));
        students.add(new Student(5, "Binh", LocalDate.of(2001, 3, 10), 8.5f));
        students.sort(Comparator.comparing((Student s) -> s.getName())
        .thenComparing(s -> s.getNgaySinh())
        .thenComparing(s -> s.getDiem()));
        for (Student s : students){
            System.out.println(s.thongTinStudent());
        }
    }
}
