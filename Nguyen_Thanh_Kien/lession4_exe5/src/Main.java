import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<CongNhan> congNhans = new ArrayList<>();
    private static ArrayList<KySu> kySus = new ArrayList<>();
    private static ArrayList<NhanVien> nhanViens = new ArrayList<>();

    public static void main(String[] args) {
        KySu kySu = new KySu();
        kySu.setTuoi(1);
        kySu.setGioiTinh(Gender.Nam);
        kySu.setDiaChi("a");
        kySu.setNganhDaoTao("b");
        kySu.setHoTen("nguyen thanh kien");
        kySus.add(kySu);
        menu();
    }

    private static void menu() {
        System.out.println("Chọn chức năng: ");
        System.out.println("1/ Thêm cán bộ\n" +
                "2/ Tìm kiếm theo họ tên\n" +
                "3/ Hiện thông tin về danh sách các cán bộ\n" +
                "4/ Nhập vào tên cán bộ và xóa cán bộ\n" +
                "5/ Thoát chương trình");
        Scanner myScanner = new Scanner(System.in);
        int chon = myScanner.nextInt();
        myScanner.nextLine();
        switch (chon) {
            case 1:
                themCanBo();
                break;
            case 2:
                timKiemTheoHoTen();
                break;
            case 3:
                displayList();
            case 4:
                deleteByName();
            default:
                System.exit(0);
        }
    }

    private static void displayChildMenu() {
        System.out.println("Chọn loại cán bộ: ");
        System.out.println("1. Kỹ sư");
        System.out.println("2. Công nhân");
        System.out.println("3. Nhân viên");
    }

    private static void deleteByName() {
        displayChildMenu();
        Scanner myScanner = new Scanner(System.in);
        int chon = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Nhập tên cán bộ muốn xoá: ");
        String name = myScanner.nextLine();
        switch (chon) {
            case 1:
                kySus = (ArrayList<KySu>) kySus.stream()
                        .filter(e -> {
                            if(e.getHoTen().contains(" ")){
                               return !e.getHoTen().substring(e.getHoTen().lastIndexOf(" ") + 1).equalsIgnoreCase(name);
                            } else {
                                return !e.getHoTen().equalsIgnoreCase(name);
                            }
                        })
                        .collect(Collectors.toList());
                break;
            case 2:
                congNhans = (ArrayList<CongNhan>) congNhans.stream()
                        .filter(e -> {
                            if(e.getHoTen().contains(" ")){
                                return !e.getHoTen().substring(e.getHoTen().lastIndexOf(" ") + 1).equalsIgnoreCase(name);
                            } else {
                                return !e.getHoTen().equalsIgnoreCase(name);
                            }
                        })
                        .collect(Collectors.toList());
                break;
            case 3:
                nhanViens = (ArrayList<NhanVien>) nhanViens.stream()
                        .filter(e -> {
                            if(e.getHoTen().contains(" ")){
                                return !e.getHoTen().substring(e.getHoTen().lastIndexOf(" ") + 1).equalsIgnoreCase(name);
                            } else {
                                return !e.getHoTen().equalsIgnoreCase(name);
                            }
                        })
                        .collect(Collectors.toList());
                break;
        }
        System.out.println("Delete complete!!! Enter continue...");
        myScanner.nextLine();
        menu();
    }

    private static void displayList() {
        displayChildMenu();
        Scanner myScanner = new Scanner(System.in);
        int chon = myScanner.nextInt();
        myScanner.nextLine();
        switch (chon) {
            case 1:
                System.out.println(kySus.toString());
                break;
            case 2:
                System.out.println(congNhans.toString());
                break;
            case 3:
                System.out.println(nhanViens.toString());
                break;
        }
        System.out.println("Enter continue");
        myScanner.nextLine();
        menu();
    }

    private static void themCanBo() {
        displayChildMenu();
        Scanner myScanner = new Scanner(System.in);
        int chon = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = myScanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = myScanner.nextInt();
        System.out.println("Chọn giới tính \n1.Nam\n2.Nữ\n3.Khác");
        int gender = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = myScanner.nextLine();

        switch (chon) {
            case 1:
                KySu kySu = new KySu();
                kySu.setDiaChi(address);
                kySu.setHoTen(name);
                kySu.setGioiTinh(Gender.get(gender));
                kySu.setTuoi(age);
                System.out.println("Nhập ngành đào tao:");
                kySu.setNganhDaoTao(myScanner.nextLine());
                kySus.add(kySu);
                System.out.println("Thêm thành công!!! enter continue");
                myScanner.nextLine();
                break;
            case 2:
                CongNhan congNhan = new CongNhan();
                congNhan.setDiaChi(address);
                congNhan.setHoTen(name);
                congNhan.setGioiTinh(Gender.get(gender));
                congNhan.setTuoi(age);
                System.out.println("Nhập bậc (1-10):");
                congNhan.setBac(myScanner.nextInt());
                myScanner.nextLine();
                congNhans.add(congNhan);
                System.out.println("Thêm thành công!!! enter continue");
                myScanner.nextLine();
                break;
            case 3:
                NhanVien nhanVien = new NhanVien();
                nhanVien.setDiaChi(address);
                nhanVien.setHoTen(name);
                nhanVien.setGioiTinh(Gender.get(gender));
                nhanVien.setTuoi(age);
                System.out.println("Nhập công việc:");
                nhanVien.setCongViec(myScanner.nextLine());
                nhanViens.add(nhanVien);
                System.out.println("Thêm thành công!!! enter continue");
                myScanner.nextLine();
                break;
        }
        menu();
    }

    private static void timKiemTheoHoTen() {
        displayChildMenu();
        Scanner myScanner = new Scanner(System.in);
        int chon = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Nhập họ tên muốn tìm kiếm:");
        String nameSearch = myScanner.nextLine();
        switch (chon) {
            case 1:
                ArrayList<KySu> resultListKysu = (ArrayList<KySu>) kySus.stream().filter(e -> e.getHoTen().equalsIgnoreCase(nameSearch)).collect(Collectors.toList());
                if (!resultListKysu.isEmpty()) {
                    System.out.println("Kết quả tìm được: " + resultListKysu.toString());
                } else {
                    System.out.println("Không có kết quả");
                }
                break;
            case 2:
                ArrayList<NhanVien> resultListNhanVien = (ArrayList<NhanVien>) nhanViens.stream().filter(e -> e.getHoTen().equalsIgnoreCase(nameSearch)).collect(Collectors.toList());
                if (!resultListNhanVien.isEmpty()) {
                    System.out.println("Kết quả tìm được: " + resultListNhanVien.toString());
                } else {
                    System.out.println("Không có kết quả");
                }
                break;
            case 3:
                ArrayList<CongNhan> resultListCongNhan = (ArrayList<CongNhan>) congNhans.stream().filter(e -> e.getHoTen().equalsIgnoreCase(nameSearch)).collect(Collectors.toList());
                if (!resultListCongNhan.isEmpty()) {
                    System.out.println("Kết quả tìm được: " + resultListCongNhan.toString());
                } else {
                    System.out.println("Không có kết quả");
                }
                break;
        }
        System.out.println("Enter to cotinue!!!");
        myScanner.nextLine();
        menu();
    }
}