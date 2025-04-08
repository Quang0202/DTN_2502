package com.vti.backend;

import com.vti.entity.Bao;
import com.vti.entity.Sach;
import com.vti.entity.TaiLieu;
import com.vti.entity.TapChi;

import javax.xml.transform.Source;
import java.net.SocketTimeoutException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<TaiLieu> danhSach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void themTaiLieu() {
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Chọn loại tài liệu: ");
        int loai = sc.nextInt();

        System.out.print("Nhập mã tài liệu: ");
        String ma = sc.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String nxb = sc.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBan = sc.nextInt();
        switch (loai) {
            case 1:
                System.out.println("Nhập tên tác giả: ");
                String tacGia = sc.nextLine();
                System.out.println("Nhập số trang: ");
                int soTrang = sc.nextInt();
                danhSach.add(new Sach(ma, nxb, soBan, tacGia, soTrang));
                break;
            case 2:
                System.out.println("Nhập số phát hành: ");
                int soPH = sc.nextInt();
                System.out.println("Nhập tháng phát hành: ");
                int thangPH = sc.nextInt();
                danhSach.add(new TapChi(ma , nxb, soBan, thangPH, soPH));
                break;
            case 3:
                System.out.print("Nhập ngày phát hành (yyyy-mm-dd): ");
                String ngay = sc.nextLine();
                danhSach.add(new Bao(ma, nxb, soBan, LocalDate.parse(ngay)));
                break;
        }
    }

    public void xoaTaiLieu(String ma) {
        danhSach.removeIf(tl -> tl.getMaTaiLieu().equalsIgnoreCase(ma));
        System.out.println("Đã xoá nếu có mã phù hợp.");
    }

    public void hienThiThongTin() {
        for (TaiLieu tl : danhSach) {
            System.out.println(tl);
        }
    }

    public void timKiemTheoLoai(Class<?> loai) {
        for (TaiLieu tl : danhSach) {
            if (tl.getClass() == loai) {
                System.out.println(tl);
            }
        }
    }
}
