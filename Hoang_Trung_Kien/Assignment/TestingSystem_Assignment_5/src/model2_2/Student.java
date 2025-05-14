package model2_2;

import java.util.Scanner;

public class Student extends Person{
    private String maSinhVien;
    private double diemTB;
    private String email;

    @Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhap ma sinh vien: ");
        maSinhVien = scanner.nextLine();
        System.out.println("Nhap diem trung binh: ");
        diemTB = scanner.nextDouble();
        System.out.println("Nhap email: ");
        scanner.nextLine();
        email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    public boolean scholarship() {
        return diemTB >= 8.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", diemTB=" + diemTB +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }
}
