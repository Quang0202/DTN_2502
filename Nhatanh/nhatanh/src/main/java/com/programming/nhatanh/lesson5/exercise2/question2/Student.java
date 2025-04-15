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
        System.out.println(this);
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Mã sinh viên:");
        this.studentCode = scanner.nextLine();
        System.out.println("Nhập Điểm trung bình: ");
        this.GPA = (float) scanner.nextDouble();
        System.out.println("Nhập Email:");
        this.email = scanner.nextLine();
        scanner.close();
    }

    public boolean scholarshipQualified(){
        return GPA >= 8.0;
    }
}
