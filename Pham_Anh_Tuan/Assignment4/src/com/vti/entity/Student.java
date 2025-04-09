package com.vti.entity;

public class Student {
    private static int idCounter = 1; // Biến đếm để tạo id tự động
    private int id;
    private String name;
    private String hometown;
    private double gpa;

    // b) Constructor cho phép nhập tên, hometown và mặc định GPA = 0
    public Student(String name, String hometown) {
        this.id = idCounter++;
        this.name = name;
        this.hometown = hometown;
        this.gpa = 0.0; // Điểm mặc định là 0
    }

    // c) Method để set điểm học lực
    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 10) {
            System.out.println("Invalid GPA! GPA must be between 0 and 10.");
            return;
        }
        this.gpa = gpa;
    }

    // d) Method để cộng thêm điểm vào GPA
    public void addGpa(double additionalGpa) {
        double newGpa = this.gpa + additionalGpa;
        if (newGpa > 10) {
            this.gpa = 10;
        } else if (newGpa < 0) {
            this.gpa = 0;
        } else {
            this.gpa = newGpa;
        }
    }

    // e) Method để in thông tin sinh viên
    public void printInfo() {
        System.out.print("Student ID: " + id + " | Name: " + name + " | Hometown: " + hometown + " | GPA: " + gpa + " | Classification: ");
        if (gpa < 4.0) {
            System.out.println("Yếu");
        } else if (gpa < 6.0) {
            System.out.println("Trung bình");
        } else if (gpa < 8.0) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
    }
}

