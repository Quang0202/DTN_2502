package com.programming.nhatanh.lesson6.Testing_System_Assignment_4_Debug.src.backend;

import com.programming.nhatanh.lesson6.Testing_System_Assignment_4_Debug.src.entity.QLCB;

import java.util.Scanner;


public class Exercise5 {

	public void question1_2() {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();

		System.out.println("Mời bạn nhập vào chức năng muốn dùng\n" + "1.Thêm mới cán bộ\n" + "2.Tìm kiếm theo họ tên\n"
				+ "3.Hiện thị thông tin về danh sách các cán bộ.\n" + "4.Nhập vào tên của cán bộ và delete cán bộ đó\n"
				+ "5.Thoát khỏi chương trình.");
		System.out.print("Mời bạn chọn chức năng: ");

		int choose = scanner.nextInt();
//		boolean continueLoop = true;
		while (true) {
			switch (choose) {
			case 1:
				qlcb.addCanBo();
				return;
			case 2:
				qlcb.findByName();
				return;
			case 3:
				qlcb.printListCanBo();
				return;
			case 4:
				qlcb.deleteCanBo();
				return;
			case 5:
				return;
			default:
				System.out.println("Bạn đã nhập sai. Bạn chỉ được nhập từ 1 tới 5 thôi!");
				break;
			}

		}
	}
}
