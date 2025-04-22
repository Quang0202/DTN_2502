package com.company.backend.TestingSystem9;

import com.company.entity.TestingSystem9.Student;

import java.util.Date;

public class Exercise2 {
    @SuppressWarnings("deprecation")
    public void q1(){
        Date date = new Date(120, 4, 18); // Năm = 2020 - 1900, Tháng = 5 - 1
        System.out.println(date);
    }
    public void q2(){
        Student student = new Student("Nguyễn Văn A");
        System.out.println("Tên sinh viên: " + student.getName());
        System.out.println("ID (cũ): " + student.getId());
        System.out.println("ID (mới): " + student.getFormattedId());
    }
}
