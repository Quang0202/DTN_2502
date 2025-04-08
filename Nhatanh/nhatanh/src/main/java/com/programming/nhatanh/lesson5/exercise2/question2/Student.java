package com.programming.nhatanh.lesson5.exercise2.question2;

import com.vti.backend.Gender;

import java.util.Scanner;

public class Student extends Person{
    private String studentCode;
    private float GPA;
    private String email;

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void showInfo() {
        System.out.println("Student{" +
                "studentCode='" + studentCode + '\'' +
                ", GPA=" + GPA +
                ", email='" + email + '\'' +
                '}');
    }

    @Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Mã sinh viên:");
        this.studentCode = scanner.next();
        System.out.println("Nhập Điểm trung bình: ");
        this.GPA = scanner.nextFloat();
        System.out.println("NhậpEmail:");
        this.email = scanner.next();
        scanner.close();
    }

    public boolean scholarshipQualified(){
        return GPA >= 8.0;
    }
}
