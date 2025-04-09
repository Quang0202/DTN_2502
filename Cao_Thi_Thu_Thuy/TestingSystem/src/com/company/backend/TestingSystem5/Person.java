package com.company.backend.TestingSystem5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person {
    private String ten;
    private String gioiTinh;
    private LocalDate ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String ten, String gioiTinh, LocalDate ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    // Getter và Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Nhập tên: ");
        ten = sc.nextLine();

        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String ngaySinhStr = sc.nextLine();
        ngaySinh = LocalDate.parse(ngaySinhStr, formatter);

        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public void showInfo(){
        System.out.println("Tên: " + ten);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
