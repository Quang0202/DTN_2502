package com.vti.backend;

import com.vti.entity.Student;

public class Excercise4 {
    public static void question1(){
        Student student = new Student("Kien", "Da Nang");
        System.out.println("Name: " + student.getName());
        System.out.println("Hometown: " + student.getHometown());
        System.out.println("Diem: " + student.getDiemHocLuc());

        student.setDiemHocLuc(5);
        student.congDiem(4);
        student.screen();
    }
}
