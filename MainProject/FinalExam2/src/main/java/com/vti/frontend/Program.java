package com.vti.frontend;

import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

import java.sql.SQLException;

public class Program {

	public static void main(String[] args) {
		menuLogin();
	}

	private static void menuLogin(){
		Function function = new Function();

		System.out.println("MỜI BẠN LOGIN");
		User user = function.login();

		if (user.getRole() == Role.ADMIN) {
			menuAdmin();
		} else {
			menuUser();
		}
	}

	private static void menuUser()   {
		Function function = new Function();
		while (true) {
			System.out.println("Mời bạn nhập chức năng muốn sử dụng:\n" + "1: In ra danh sách các User\n"
					+ "2: Tìm user theo ID\n" + "3: Thoat khoi chuong trinh");
			int choose = ScannerUtils.inputFunction(1, 3, "Bạn chỉ chọn từ 1 --> 3. Mời nhập lại!");

			switch (choose) {
			case 1:
				function.getListUsers();
				break;
			case 2:
				function.getUserById();
				break;
			case 3:
				System.out.println("Bạn đã thoát khỏi chương trình!");
				return;
			}
		}
	}

	private static void menuAdmin()   {
		Function function = new Function();

		while (true) {
			System.out.println("Mời bạn nhập chức năng muốn sử dụng:\n" + "1: In ra danh sách các User\n"
					+ "2: Tìm user theo ID\n" + "3: Xóa user theo id\n" + "4: Add User\n" + "5: Thoat khoi chuong trinh");
			int choose = ScannerUtils.inputFunction(1, 5, "Bạn chỉ chọn từ 1 --> 5. Mời nhập lại!");

			switch (choose) {
			case 1:
				function.getListUsers();
				break;
			case 2:
				function.getUserById();
				break;
			case 3:
				function.deleteUserById();
				break;
			case 4:
				function.addUser();
				break;
			case 5:
				System.out.println("Bạn đã thoát khỏi chương trình!");
				return;
			}
		}
	}

}
