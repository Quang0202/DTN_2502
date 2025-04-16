package MaiTienThanh.src.com.vti.backend.Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public void question1() {
        Scanner scanner = new Scanner(System.in);
        List<News> newss = new ArrayList<>();

        while (true) {
            System.out.println("\n------MY NEWS------");
            System.out.println("1. Insert News");
            System.out.println("2. View list news");
            System.out.println("3. Average Rate");
            System.out.println("4. Exit Program");
            System.out.println("Enter your choice: ");

            int choice;
            while (true) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Please enter an integer: ");
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    News news = new News();
                    System.out.print("Title: ");
                    news.setTitle(scanner.nextLine());
                    System.out.print("Publish date: ");
                    news.setPublishDate(scanner.nextLine());
                    System.out.print("Author: ");
                    news.setAuthor(scanner.nextLine());
                    System.out.print("Content: ");
                    news.setContent(scanner.nextLine());
                    System.out.print("Nhập 3 rates: ");
                    int[] rates = new int[3];
                    for (int i = 0; i < 3; i++) {
                        rates[i] = scanner.nextInt();
                    }
                    news.setRates(rates);
                    newss.add(news);
                    news.Display();
                    break;
                case 2:
                    for (News n : newss) {
                        n.Display();
                    }
                    break;
                case 3:
                    for (News n : newss) {
                        n.Calculate();
                        n.Display();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    public void question2(){
        Scanner scanner = new Scanner(System.in);
        TuyenSinh ts = new TuyenSinh();
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice;
            while(true){
                if(scanner.hasNextInt()){
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
                    System.out.print("Nhập SBD: ");
                    String sbd = scanner.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();
                    System.out.print("Nhập mức ưu tiên: ");
                    int uuTien = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Chọn khối (A/B/C): ");
                    String khoi = scanner.nextLine().toUpperCase();

                    ThiSinh thiSinh = null;
                    switch (khoi) {
                        case "A":
                            thiSinh = new ThiSinhKhoiA(sbd, hoTen, diaChi, uuTien);
                            break;
                        case "B":
                            thiSinh = new ThiSinhKhoiB(sbd, hoTen, diaChi, uuTien);
                            break;
                        case "C":
                            thiSinh = new ThiSinhKhoiC(sbd, hoTen, diaChi, uuTien);
                            break;
                        default:
                            System.out.println("Khối không hợp lệ.");
                            continue;
                    }
                    ts.themThiSinh(thiSinh);
                    System.out.println("Thêm thành công!");
                    break;
                case 2:
                    ts.hienThi();
                    break;
                case 3:
                    System.out.print("Nhập SBD cần tìm: ");
                    String ma = scanner.nextLine();
                    ThiSinh found = ts.timKiemTheoSBD(ma);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Không tìm thấy thí sinh.");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}