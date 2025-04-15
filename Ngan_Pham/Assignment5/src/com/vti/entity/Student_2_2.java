package com.vti.entity;

import java.util.Scanner;

public class Student_2_2 extends Person {
    private int maSinhVien;
    private double diemTrungBinh;
    private String email;
    public Student_2_2() {
        super();
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student_2_2(String name, String gioiTinh, String ngaySinh, String diaChi, int maSinhVien, double diemTrungBinh, String email) {
        super(name, gioiTinh, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
        this.email = email;
    }
    @Override
    public void inputInfor(){
        super.inputInfor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        maSinhVien = sc.nextInt();
        System.out.println("Nhập điểm trung bình:");
        diemTrungBinh = sc.nextDouble();
        System.out.println("Nhập email: ");
        email = sc.nextLine();
    }
    @Override
    public void showInfor(){
        super.showInfor();
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Email: " + email);
    }
    public boolean hocBong(){
        return diemTrungBinh > 8.0;
    }
}
