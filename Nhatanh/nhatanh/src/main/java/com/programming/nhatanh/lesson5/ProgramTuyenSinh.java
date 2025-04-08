package com.programming.nhatanh.lesson5;

import com.vti.backend.Khoi;
import com.vti.backend.News;
import com.vti.backend.ThiSinh;

import java.text.ParseException;
import java.util.Scanner;

public class ProgramTuyenSinh {

//    a. Thêm mới thí sinh.
//    b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
//    c. Tìm kiếm theo số báo danh.
//    d. Thoát khỏi chương trình.

    public static void main(String[] args) throws ParseException {

        TuyenSinh tuyenSinh = new TuyenSinh();

        Scanner scanner = new Scanner(System.in);
        boolean validResponse = true;
        while (validResponse) {
            System.out.println("mời bạn nhập vào chức năng muốn sử dụng");
            System.out.println("1. Thêm mới thí sinh:");
            System.out.println("2. Hiện thị thông tin của thí sinh:");
            System.out.println("3. Tìm kiếm theo số báo danh:");
            System.out.println("4. Ngừng chương trình");
            int inputRequestNumber = scanner.nextInt();
            switch (inputRequestNumber) {
                case 1:
                    System.out.println("Nhập số báo danh: ");
                    String inputSoBaoDanh = scanner.next();
                    System.out.println("Nhập họ tên: ");
                    String inputHoTen = scanner.next();
                    System.out.println("Nhập địa chỉ: ");
                    String inputDiaChi = scanner.next();
                    System.out.println("Nhập mức ưu tiên: ");
                    int inputMucUuTien = scanner.nextInt();
                    System.out.println("Nhập khối: ");
                    Khoi inputKhoi = Khoi.valueOf(scanner.next());
                    ThiSinh newThiSinh = new ThiSinh(inputSoBaoDanh, inputHoTen, inputDiaChi, inputMucUuTien, inputKhoi);
                    tuyenSinh.addStudent(newThiSinh);
                    break;
                case 2:
                    tuyenSinh.displayStudentInfo();
                    break;
                case 3:
                    System.out.println("Nhập số báo danh: ");
                    String inputQuerySoBaoDanh = scanner.next();
                    tuyenSinh.findStudent(inputQuerySoBaoDanh);
                    break;
                case 4:
                    validResponse = false;
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }
        }
        scanner.close();
    }

}
