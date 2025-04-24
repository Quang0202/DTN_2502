package com.programming.nhatanh.lesson8.frontend;

import com.programming.nhatanh.lesson8.entity.Student;
import com.programming.nhatanh.lesson8.entity.StudentE2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class E2Q2 {
    public static void main(String[] args)  {
        StudentE2 newStudent1 = new StudentE2(1, "Nguyễn T", 3.5, LocalDateTime.of(2009, 4, 13, 12, 23));
        StudentE2 newStudent2 = new StudentE2(2, "Nguyễn W", 3.7, LocalDateTime.of(2002, 6, 12, 12, 23));
        StudentE2 newStudent3 = new StudentE2(3, "Nguyễn A", 3.5, LocalDateTime.of(2001, 4, 30, 12, 23));
        StudentE2 newStudent4 = new StudentE2(4, "Nguyễn R", 3.2, LocalDateTime.of(2005, 5, 13, 12, 23));
        StudentE2 newStudent5 = new StudentE2(5, "Nguyễn C", 4.0, LocalDateTime.of(2009, 3, 13, 12, 23));
        ArrayList<StudentE2> listStudent = new ArrayList<>();
        listStudent.add(newStudent1);
        listStudent.add(newStudent2);
        listStudent.add(newStudent3);
        listStudent.add(newStudent4);
        listStudent.add(newStudent5);
        listStudent.sort(
                Comparator.comparing(StudentE2::getName)
                        .thenComparing(StudentE2::getDoB)
                        .thenComparing(StudentE2::getGPA)
        );

        listStudent.sort(new Comparator<StudentE2>() {
            @Override
            public int compare(StudentE2 o1, StudentE2 o2) {
                if (o1.getName().equalsIgnoreCase(o2.getName())) {
                    if (o1.getDoB().equals(o2.getDoB())) {
                        return (int) (o1.getGPA() - o2.getGPA());
                    } else {
                        return o1.getDoB().compareTo(o2.getDoB());
                    }
                } else {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
            }
        });
        System.out.println(listStudent);
    }
}
