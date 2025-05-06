package com.vti.entity;

import java.util.Scanner;

public class Student_2_2 extends Person {
    private String studentId;
    private double gpa;
    private String email;

    public Student_2_2() {
        super();
    }

    public Student_2_2(String name, String gender, String birthDate, String address, String studentId, double gpa, String email) {
        super(name, gender, birthDate, address);
        this.studentId = studentId;
        this.gpa = gpa;
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        studentId = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        String inputGpa = scanner.nextLine().replace(",", ".");
        gpa = Double.parseDouble(inputGpa);
        System.out.print("Nhập email: ");
        email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("GPA: " + gpa);
        System.out.println("Email: " + email);
        System.out.println("Học bổng: " + (isEligibleScholarship() ? "Có" : "Không"));
    }

    public boolean isEligibleScholarship() {
        return gpa >= 8.0;
    }
}
