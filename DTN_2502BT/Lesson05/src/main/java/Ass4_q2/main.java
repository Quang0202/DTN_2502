package Ass4_q2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 1:
                    tuyenSinh.themThiSinh();
                    break;
                case 2:
                    tuyenSinh.hienThiThongTin();
                    break;
                case 3:
                    System.out.print("Nhập số báo danh cần tìm: ");
                    String sbd = scanner.nextLine();
//                    tuyenSinh.timKiem(sbd);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (luaChon != 4);

        scanner.close();
    }
    }


