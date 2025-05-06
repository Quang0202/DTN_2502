package com.vti.frontend;

import com.vti.entity.VietnamesePhone;

import java.util.Scanner;

public class Pro_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VietnamesePhone phone = new VietnamesePhone();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm liên hệ");
            System.out.println("2. Xóa liên hệ");
            System.out.println("3. Cập nhật số điện thoại");
            System.out.println("4. Tìm kiếm liên hệ");
            System.out.println("5. Hiển thị tất cả liên hệ");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Tên: ");
                    String nameAdd = scanner.nextLine();
                    System.out.print("SĐT: ");
                    String phoneAdd = scanner.nextLine();
                    phone.insertContact(nameAdd, phoneAdd);
                    break;
                case 2:
                    System.out.print("Nhập tên cần xóa: ");
                    String nameDel = scanner.nextLine();
                    phone.removeContact(nameDel);
                    break;
                case 3:
                    System.out.print("Tên cần cập nhật: ");
                    String nameUpd = scanner.nextLine();
                    System.out.print("SĐT mới: ");
                    String newPhone = scanner.nextLine();
                    phone.updateContact(nameUpd, newPhone);
                    break;
                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String nameSearch = scanner.nextLine();
                    phone.searchContact(nameSearch);
                    break;
                case 5:
                    phone.showAllContacts();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
