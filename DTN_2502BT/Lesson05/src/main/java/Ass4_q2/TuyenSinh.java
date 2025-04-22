package Ass4_q2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    private ArrayList<ThiSinh> danhSach = new ArrayList<>();
Scanner sc = new Scanner(System.in);


    @Override
    public void themThiSinh() {
        System.out.println("Vui long nhap ten thi sinh");
        String name = sc.nextLine();
        System.out.println("Vui long nhap so bao danh");
        int soBaoDanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Vui long nhap dia chi");
        String diaChi = sc.nextLine();
        System.out.println("Vui long nhap mon thi");
        String monThi = sc.nextLine();
        System.out.println("Vui long nhap khoi uu tien");
        int khoiUuTien = sc.nextInt();
        sc.nextLine();

        ThiSinh ts = null;
        switch (khoiUuTien) {
            case 1:
                System.out.println("Ban da chon Khoi A!");
               ts = new KhoiA(name,soBaoDanh,diaChi,khoiUuTien,monThi);
               ts.hienThiThongTin();
                System.out.println(ts);
                break;
                case 2:
                    System.out.println("Ban da chon Khoi B!");
                    ts = new KhoiB(name,soBaoDanh,diaChi,khoiUuTien,monThi);
                    ts.hienThiThongTin();
                    System.out.println(ts);
                    break;
                    case 3:
                        System.out.println("Ban da chon Khoi C!");
                        ts = new KhoiC(name,soBaoDanh,diaChi,khoiUuTien,monThi);
                        ts.hienThiThongTin();
                        System.out.println(ts);
                        break;
                        case 4:
                            System.out.println("Thoat");
                        default:
                            System.out.println("khong co khoi da chon");
        }
        danhSach.add(ts);
        System.out.println("Đã thêm thí sinh!");
    }

    @Override
    public void hienThiThongTin() {
if(danhSach.isEmpty()) {
    System.out.println("chua co thi sinh nao!");
    return;
}
for (ThiSinh thiSinh : danhSach) {
    thiSinh.hienThiThongTin();
}
    }


//    @Override
//    public void timKiem(String soBaoDanh) {
//        for (ThiSinh thiSinh : danhSach) {
//            if (thiSinh.getSoBaoDanh().(soBaoDanh)) {
//                thiSinh.hienThiThongTin();
//                return;
//            }
//        }
//        System.out.println("khong tim thay thi sinh voi " + soBaoDanh);
//
//    }
}
