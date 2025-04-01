package com.company.backend.TestingSystem4;

import java.util.Scanner;

public class Exercise4 {
    public void q1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String hometown = scanner.nextLine();
        Student student = new Student(name, hometown);
        System.out.println("Thông tin học sinh: " + student);
        System.out.print("Nhập điểm cộng: ");
        float plus = scanner.nextFloat();
        student.addScore(plus);
        System.out.println("Sau khi cộng điểm: " + student);
    }
}
