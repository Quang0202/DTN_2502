package com.vti.frontend;

import com.vti.entity.Student_2_2;

public class Pro2_2 {
    public static void main(String[] args) {
        Student_2_2 student = new Student_2_2();
        System.out.println("=== Nhập thông tin sinh viên ===");
        student.inputInfo();

        System.out.println("\n=== Thông tin sinh viên ===");
        student.showInfo();
    }
}
