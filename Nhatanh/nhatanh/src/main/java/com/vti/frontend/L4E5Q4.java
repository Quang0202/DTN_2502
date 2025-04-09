package com.vti.frontend;

import com.vti.backend.Bao;
import com.vti.backend.QLTL;
import com.vti.backend.Sach;
import com.vti.backend.TapChi;

import java.text.ParseException;
import java.util.Scanner;

public class L4E5Q4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        QLTL qlcb = new QLTL();
        boolean validResponse = true;
        while (validResponse) {
            System.out.println("mời bạn nhập vào chức năng muốn sử dụng");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Tìm tài liệu");
            System.out.println("3. Hiển thị tài liệu");
            System.out.println("4. Xoá tài liệu");
            System.out.println("5. Ngừng chương trình");
            int inputRequestNumber = scanner.nextInt();
            switch (inputRequestNumber) {
                case 1:
                    String inputMaTaiLieu = "";
                    while (true) {
                        System.out.println("Nhập Mã tài liệu: ");
                        inputMaTaiLieu = scanner.next();
                        if (!qlcb.checkIfIdExist(inputMaTaiLieu)) {
                            break;
                        }
                    }
                    System.out.println("Nhập Tên nhà xuất bản: ");
                    String inputPublisher = scanner.next();
                    System.out.println("Nhập số bản phát hành: ");
                    int inputPublishNumber = scanner.nextInt();
                    System.out.println("Chọn loại tài liệu: \n1.Sách\n2.Tạp chí\n3.Báo");
                    int inputPosition = scanner.nextInt();
                    switch (inputPosition) {
                        case 1:
                            System.out.println("Nhập Tên tác giả: ");
                            String inputAuthorName = scanner.next();
                            System.out.println("Nhập số trang: ");
                            int inputPageNum = scanner.nextInt();
                            Sach newSach = new Sach(inputMaTaiLieu, inputPublisher, inputPublishNumber, inputAuthorName, inputPageNum);
                            qlcb.themTaiLieu(newSach);
                            break;
                        case 2:
                            System.out.println("Nhập Số phát hành: ");
                            int inputPublishNum = scanner.nextInt();
                            System.out.println("Nhập tháng phát hành: ");
                            int inputPublishMonth = scanner.nextInt();
                            TapChi newTapChi = new TapChi(inputMaTaiLieu, inputPublisher, inputPublishNumber, inputPublishNum, inputPublishMonth);
                            qlcb.themTaiLieu(newTapChi);
                            break;
                        case 3:
                            System.out.println("Nhập Ngày phát hành: ");
                            int inputPublishDate = scanner.nextInt();
                            Bao newBao = new Bao(inputMaTaiLieu, inputPublisher, inputPublishNumber, inputPublishDate);
                            qlcb.themTaiLieu(newBao);
                            break;
                        default:
                            System.out.println("nhập sai");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Nhập Mã tài liệu cần xoá: ");
                    inputMaTaiLieu = scanner.nextLine();
                    if (qlcb.checkIfIdExist(inputMaTaiLieu)) {
                        qlcb.xoaTaiLieu(inputMaTaiLieu);
                    } else {
                        System.out.println("Tài liệu cần xoá không tồn tại");
                    }
                    break;
                case 3:
                    System.out.println("Nhập Mã tài liệu cần hiển thị: ");
                    inputMaTaiLieu = scanner.next();
                    if (qlcb.checkIfIdExist(inputMaTaiLieu)) {
                        qlcb.showTaiLieu(inputMaTaiLieu);
                    } else {
                        System.out.println("Tài liệu cần xoá không tồn tại");
                    }
                    break;
                case 2:
                    System.out.println("Nhập loại tài liệu cần tìm:\n1.Sách\n2.Tạp chí\n3.Báo");
                    int inputFilterQuery = scanner.nextInt();
                    qlcb.findByTypeTaiLieu(inputFilterQuery);
                    break;
                case 5:
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
