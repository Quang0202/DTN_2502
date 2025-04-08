package com.company.backend.TestingSystem5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student2 extends Person{
    private int maSinhVien;
    private float diemTrungBinh;
    private String email;

    public Student2() {
    }

    public Student2(String ten, String gioiTinh, LocalDate ngaySinh, String diaChi, int maSinhVien, float diemTrungBinh, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
        this.email = email;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
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
        maSinhVien = sc.nextInt();

        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh = sc.nextFloat();

        sc.nextLine();

        System.out.print("Nhập email: ");
        email = sc.nextLine();
        sc.close();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Email: " + email);
    }
    public boolean nhanHocBong(){
        return diemTrungBinh > 8;
    }
}
