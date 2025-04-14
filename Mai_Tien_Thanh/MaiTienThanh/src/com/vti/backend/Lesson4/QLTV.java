package MaiTienThanh.src.com.vti.backend.Lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class QLTV {
    private ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themTaiLieu() {
        System.out.println("Chọn loại tài liệu(1-3): ");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");

        int choice = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Lựa chọn không hợp lệ.");
                }
            } else {
                System.out.println("Mời nhập lại: ");
                scanner.next();
            }
        }
        System.out.print("Nhập mã tài liệu: ");
        String code = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int createAmount = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Nhập tên tác giả: ");
                String bookCreator = scanner.nextLine();
                System.out.print("Nhập số trang: ");
                int pageNumb = scanner.nextInt();
                break;
            case 2:
                System.out.print("Nhập số phát hành: ");
                String createNo = scanner.nextLine();
                System.out.print("Nhập tháng phát hành: ");
                int createMonth = scanner.nextInt();
                break;
            case 3:
                System.out.print("Nhập ngày phát hành: ");
                int createDay = scanner.nextInt();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }

    public void xoaTaiLieu() {
        System.out.print("Nhập mã tài liệu cần xóa: ");
        String codeDel = scanner.nextLine();
        boolean removed = danhSachTaiLieu.removeIf(x -> x.getCode().equals(codeDel));
        if (removed) {
            System.out.println("Xóa thành công mã tài liệu " + codeDel);
        } else {
            System.out.println("Không tìm thấy tài liệu.");
        }
    }

    public void hienThiThongTinTaiLieu() {
        if (danhSachTaiLieu.isEmpty()) {
            System.out.println("Danh sách tài liệu trống.");
        } else {
            for (TaiLieu t : danhSachTaiLieu) {
                t.hienThi();
                System.out.println("-------------------");
            }
        }
    }

    public void timKiemTaiLieu() {
        System.out.println("Nhập loại tài liệu cần tìm (Sach/TapChi/Bao): ");
        String loai = scanner.next();
        boolean found = false;

        for (TaiLieu tl : danhSachTaiLieu) {
            if ((loai.equalsIgnoreCase("Sach") && tl instanceof Sach) ||
                    (loai.equalsIgnoreCase("TapChi") && tl instanceof TapChi) ||
                    (loai.equalsIgnoreCase("Bao") && tl instanceof Bao)) {
                tl.hienThi();
                System.out.println("------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy tài liệu thuộc loại này.");
        }
    }

    public void thoatChuongTrinh() {
        System.out.println("Thoát chương trình...");
        scanner.close();
        System.exit(0);
    }

    public void menu() {
        while (true) {
            System.out.println("\n--- QUẢN LÝ THƯ VIỆN ---");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Xóa tài liệu");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm tài liệu");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice;
            while (true) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.print("Mời nhập lại: ");
                    scanner.next();
                }
            }

            switch (choice) {
                case 1:
                    themTaiLieu();
                    break;
                case 2:
                    xoaTaiLieu();
                    break;
                case 3:
                    hienThiThongTinTaiLieu();
                    break;
                case 4:
                    timKiemTaiLieu();
                    break;
                case 5:
                    thoatChuongTrinh();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}