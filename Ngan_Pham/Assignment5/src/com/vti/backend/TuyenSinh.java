package com.vti.backend;

import com.vti.entity.ThiSinh;
import com.vti.entity.ThiSinhKhoiA;
import com.vti.entity.ThiSinhKhoiB;
import com.vti.entity.ThiSinhKhoiC;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    ArrayList<ThiSinh> danhSach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    @Override
    public void addThiSinh() {
        System.out.println("Nhập số báo danh:");
        int sbd = sc.nextInt();
        System.out.println("Nhập họ tên:");
        String hoTen = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nập mức ưu tiên: ");
        int uuTien = sc.nextInt();
        System.out.println("Chọn khối thi: A/B/C");
        String khoi = sc.nextLine().toUpperCase();

        ThiSinh ts = null;
        switch (khoi) {
            case "A":
                ts =  new ThiSinhKhoiA(sbd, hoTen, diaChi, uuTien);
                break;
            case "B":
                ts = new ThiSinhKhoiB(sbd, hoTen, diaChi, uuTien);
                break;
            case "C":
                ts = new ThiSinhKhoiC(sbd, hoTen, diaChi, uuTien);
                break;
            default:
                System.out.println("Khối thi không đúng.");
                return;
        }
        danhSach.add(ts);
        System.out.println("Đã thêm thí sinh");
    }

    @Override
    public void showThiSinh() {
        for (ThiSinh thiSinh : danhSach) {
            thiSinh.display();
            System.out.println("Khối thi: " + thiSinh.getKhoithi());
        }
    }

    @Override
    public void timKiem(int sbd) {
        for (ThiSinh thiSinh : danhSach) {
            if (thiSinh.getSoBaoDanh()==sbd) {
                thiSinh.display();
                System.out.println("Khối thi: " + thiSinh.getKhoithi());
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh với SBD: " + sbd);
    }
}
