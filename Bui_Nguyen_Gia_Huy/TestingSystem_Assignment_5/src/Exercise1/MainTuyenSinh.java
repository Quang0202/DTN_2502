package Exercise1;

import java.util.Scanner;

public class MainTuyenSinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh ts = new TuyenSinh();
        while (true) {
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem theo SBD");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Ban muon nhap bao nhieu thi sinh? ");
                    int soThiSinh = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < soThiSinh; i++) {
                        System.out.println("Nhap thong tin thi sinh thu " + (i + 1) + ":");
                        System.out.print("Nhap SBD: ");
                        String sbd = scanner.nextLine();
                        System.out.print("Nhap ho ten: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhap dia chi: ");
                        String address = scanner.nextLine();
                        System.out.print("Nhap muc uu tien: ");
                        int priority = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhap khoi thi (A/B/C): ");
                        String block = scanner.nextLine();

                        ThiSinh thiSinh;
                        if (block.equalsIgnoreCase("A")) {
                            thiSinh = new ThiSinhKhoiA(sbd, name, address, priority);
                        } else if (block.equalsIgnoreCase("B")) {
                            thiSinh = new ThiSinhKhoiB(sbd, name, address, priority);
                        } else {
                            thiSinh = new ThiSinhKhoiC(sbd, name, address, priority);
                        }
                        ts.addThiSinh(thiSinh);
                    }
                    break;
                case 2:
                    ts.displayThiSinhs();
                    break;
                case 3:
                    System.out.print("Nhap SBD can tim: ");
                    String search = scanner.nextLine();
                    ts.searchBySBD(search);
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}