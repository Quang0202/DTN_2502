package model2_2;

import java.util.Scanner;

public class Student extends Person{
    private String maSinhVien;
    private double diemTB;
    private String email;

    @Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        setName(scanner.nextLine());
        System.out.println("Nhap gioi tinh:");
        setGender(scanner.nextLine());
        System.out.println("Nhap ngay sinh:");
        setDateOfBirth(scanner.nextLine());
        System.out.println("Nhap dia chi:");
        setAddress(scanner.nextLine());
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
        System.out.println("Ho ten: " + getName() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Date Of Birth: " + getDateOfBirth() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Ma sinh vien: " + maSinhVien + "\n" +
                "Diem trung binh: " + diemTB + "\n" +
                "Email: " + email);
    }

    public boolean scholarship() {
        return diemTB >= 8.0;
    }
}
