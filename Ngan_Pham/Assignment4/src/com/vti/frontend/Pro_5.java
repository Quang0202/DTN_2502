package com.vti.frontend;

import com.vti.backend.QuanLyCanBo;
import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;

import java.util.Scanner;

public class Pro_5 {

    public static void print(CongNhan cn){

    }

    public static void print2(CanBo cb){

    }
    public static void main(String[] args) {

        CanBo canBo = new CongNhan("ethanpham", 19,"nu", "BD", 1); // instanceof CongNhan, CanBo
        System.out.println(canBo);

        CongNhan congNhan = (CongNhan) canBo;
        congNhan.getBac();


//        CanBo canBo = new CongNhan("hoten",19,"nam","HN",1);// instance of CongNhan, Canbo
//        System.out.println(canBo);
//        CanBo canBo1 = new CanBo("canbo",2,"nu","TH");// instance of CanBo
//        CongNhan congNhan = (CongNhan) canBo1;
//        congNhan.getBac();
//        ((CongNhan) canBo).setBac(2);
//        print((CongNhan) canBo);
//        print((CongNhan) canBo1);
//
//        CongNhan congNhan1 = new CongNhan("hoten",19,"nam","HN",1);
//        print2(congNhan1);
//        if(canBo1 instanceof CanBo){
//
//        }


        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Them moi can bo");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi thong tin can bo");
            System.out.println("4. Xoa can bo");
            System.out.println("5. Thoat");

            int choi = sc.nextInt();
            switch (choi) {
                case 1:
                    quanLyCanBo.themCanBo();
                    break;
                 case 2:
                     System.out.println("Nhập tên cần tìm: ");
                     String ten = sc.nextLine();
                     quanLyCanBo.timKiemTheoTen(ten);
                     break;
                case 3:
                    quanLyCanBo.hienThiDanhSach();
                    break;
                case 4:
                    System.out.println("Nhập tên cán bộ cần xóa: ");
                    String x = sc.nextLine();
                    quanLyCanBo.xoaCanBo(x);
                    break;
                case 5:
                        System.out.println("Đã thoát chương trình");
                        return;
                default :
                        System.out.println("Lựa chọn sai");
            }
        }
    }
}
