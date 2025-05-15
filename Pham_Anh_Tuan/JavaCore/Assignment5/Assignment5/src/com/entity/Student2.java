package com.entity;

import java.util.Scanner;

public class Student2 extends Person{
    private String studentId;
    private double gpa;
    private String email;

    public Student2() {
        super();
    }

    public Student2(String name, String gender, String birthDate, String address,
                   String studentId, double gpa, String email) {
        super(name, gender, birthDate, address);
        this.studentId = studentId;
        this.gpa = gpa;
        this.email = email;
    }

    // Getters và Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        studentId = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        gpa = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập email: ");
        email = sc.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
        System.out.println("Email: " + email);
    }

    public boolean hasScholarship() {
        return gpa >= 8.0;
    }
}
