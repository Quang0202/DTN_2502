package com.vti.frontend;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

import java.sql.SQLException;
import java.util.List;

public class Function {

	private UserController userController;

	public Function() {
		userController = new UserController();
	}

	public void getListUsers()   {

		List<User> users = userController.getListUsers();

		System.out.printf("%-15s %-25s %-25s\n", "ID", "Email", "Fullname");
		for (User user : users) {
			System.out.printf("%-15s %-25s %-25s\n", user.getId(), user.getEmail(), user.getFullName());
		}

	}

	public void getUserById()   {

		System.out.print("Mời bạn nhập User ID: ");
		int userId = ScannerUtils.inputPositiveInt("Bạn phải nhập vào số nguyên dương! Mời nhập lại");

		User user = userController.getUserById(userId);

		if (user != null) {
			System.out.println(user);
		} else {
			System.out.println("Không tìm thấy user có id = " + userId);
		}
	}

	public void deleteUserById()   {
		while (true) {
			System.out.print("Mời bạn nhập User ID muốn xóa: ");
			int userId = ScannerUtils.inputPositiveInt("Bạn phải nhập vào số nguyên dương! Mời nhập lại");
			boolean result = userController.deleteUserExistsById(userId);
			if (result) {
				System.out.println("Đã xóa thành công");
				return;
			} else {
				System.out.println("Không tìm thấy user có id = " + userId + "\n");
			}
		}
	}

	public User login()   {
		while (true) {
			System.out.print("Mời bạn nhập vào Email của account: ");
			String email = ScannerUtils.inputEmail("Email chưa đúng định dạng.");

			System.out.print("Mời bạn nhập password: ");
			String password = ScannerUtils
					.inputPassword("Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!");

			User user = userController.login(email, password);

			if (user != null) {
				System.out.printf("Chào mừng %s (%s) \n \n \n", user.getFullName(), user.getRole());
				return user;
			} else {
				System.out.println("Bạn đã điền Email/Password không đúng! Mời bạn nhập lại!");
			}
		}
	}

	public void addUser()   {
		System.out.print("Mời bạn nhập vào Fullname của account: ");
		String fullname = ScannerUtils.inputFullName("Fullname chỉ chứa chữ, không chứa bất kỳ kí tự đặc biệt nào");

		String email;
		System.out.print("Mời bạn nhập vào Email của account: ");
		while (true) {
			email = ScannerUtils.inputEmail("Email chưa đúng định dạng.");
			boolean resultExistsEmail = userController.isUserExistsByEmail(email);
			if (resultExistsEmail) {
				System.out.printf("\nEmail %s đã tồn tại! Mời bạn nhập mail khác: ", email);
			} else {
				break;
			}
		}

		userController.createUser(fullname, email);
		System.out.printf("Bạn đã tạo user %s thành công!", fullname);
	}
}
