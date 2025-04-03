package com.vti.frontend;

import com.vti.backend.*;

import java.text.ParseException;
import java.util.Scanner;

public class L4E5Q5 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
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
                    System.out.println("Nhập tên: ");
                    String inputName = scanner.next();
                    System.out.println("Nhập tuổi: ");
                    int inputAge = scanner.nextInt();
                    System.out.println("Nhập giới tính (MALE/FEMALE): ");
                    Gender inputGender = Gender.valueOf(scanner.next());
                    System.out.println("Nhập địa chỉ: ");
                    String inputAddress = scanner.next();
                    System.out.println("Chọn vị trí: \n1.Công nhân\n2.Kỹ sư\n3.Nhân viên");
                    int inputPosition = scanner.nextInt();
                    switch (inputPosition) {
                        case 1:
                            boolean validInputLv = true;
                            int inputLv = 0;
                            while (validInputLv) {
                                System.out.println("Nhập số bậc");
                                inputLv = scanner.nextInt();
                                if (inputLv > 0 && inputLv <= 10) {
                                    validInputLv = false;
                                }
                            }
                            CongNhan newCongNhan = new CongNhan(inputLv, inputName, inputAge, inputGender, inputAddress);
                            qlcb.themCanBo(newCongNhan);
                            break;
                        case 2:
                            System.out.println("Nhập ngành đào tạo");
                            String inputNganhDaoTao = scanner.next();
                            KySu newKySu = new KySu(inputNganhDaoTao, inputName, inputAge, inputGender, inputAddress);
                            qlcb.themCanBo(newKySu);
                            break;
                        case 3:
                            System.out.println("Nhập công việc");
                            String inputCongViec = scanner.next();
                            NhanVien newNhanVien = new NhanVien(inputCongViec, inputName, inputAge, inputGender, inputAddress);
                            qlcb.themCanBo(newNhanVien);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên cán bộ cần tìm: ");
                    String inputSearchQuery = scanner.next();
                    qlcb.timCanBo(inputSearchQuery);
                    break;
                case 3:
                    qlcb.showCanBo();
                    break;
                case 4:
                    System.out.println("Nhập tên cán bộ cần xoá: ");
                    String inputDeleteQuery = scanner.next();
                    qlcb.deleteCanBo(inputDeleteQuery);
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
