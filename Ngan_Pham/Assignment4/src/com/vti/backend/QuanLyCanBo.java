package com.vti.backend;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {

    private ArrayList<CanBo> danhSachCanBo = new ArrayList<>();

//     danhSachCanBo.add(canbo);
//        danhSachCanBo.remove(0);
//        danhSachCanBo.get(0);
//        danhSachCanBo.removeIf(canBo -> canBo.getHoTen().equals("abc") && canBo.getDiaChi().equals("xyz"));
//
//        for(CanBo canBo: danhSachCanBo){
//        if(canBo.getHoTen().equals("abc")){
//            danhSachCanBo.remove(canBo);
//        }
//    }


    public void themCanBo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn loại cán bộ:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");

        int loai = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        CanBo canBo = null;

        switch (loai) {
            case 1 :{
                System.out.print("Nhập bậc (1-10): ");
                int bac = scanner.nextInt();
                scanner.nextLine();
                canBo = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                break;
            }
            case 2: {
                System.out.print("Nhập ngành đào tạo: ");
                String nganh = scanner.nextLine();
                canBo = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganh);
                break;
            }
            case 3: {
                System.out.print("Nhập công việc: ");
                String congViec = scanner.nextLine();
                canBo = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                break;
            }
            default :
                System.out.println("Loại cán bộ không hợp lệ!");
                return;
        }

        if (canBo != null) {
            danhSachCanBo.add(canBo);
            System.out.println(" Đã thêm cán bộ thành công!");
        }
    }
    public void timKiemTheoTen(String ten){
        for (CanBo cb : danhSachCanBo) {
            if(cb.getHoTen().equalsIgnoreCase(ten)){
                System.out.println(cb);
            }
        }
    }
    public void hienThiDanhSach() {
        for (CanBo cb : danhSachCanBo) {
            System.out.println(cb);
        }
    }

    public void xoaCanBo(String ten) {
        danhSachCanBo.removeIf(cb -> cb.getHoTen().equalsIgnoreCase(ten));
    }
}
