package com.vti.backend;


import com.model.Account;
import com.model.Department;
import com.model.Group;
import com.model.Position;

import java.time.LocalDate;

public class Exercise1 {

    public void question1() {
        Department department = new Department();
        Department department1 = new Department("Dev");

        System.out.println(department);
        System.out.println(department1);
    }

    public void question2() {
        // a) Khởi tạo với constructor không có tham số
        Account account1 = new Account();
        System.out.println(account1);

        // b) Khởi tạo với constructor có id, email, username, firstName, lastName
        Account account2 = new Account(1, "nguyen van a@gmai.com", "nguyenvana", "a", "nguyen van");
        System.out.println(account2);

        // c) Khởi tạo với constructor có id, email, username, firstName, lastName, position (mặc định createDate là ngày hiện tại)
        Position position1 = new Position("Manager");
        Account account3 = new Account(2, "phamtuan", "tuan", "tuan", "pham", position1);
        System.out.println(account3);

        // d) Khởi tạo với constructor có id, email, username, firstName, lastName, position và createDate
        Account account4 = new Account(3, "test@example.com", "test123", "test", "testlastname", new Position("Developer"), LocalDate.now());
        System.out.println(account4);
    }

    public void question3() {
        // a) Khởi tạo Group không có tham số
        Group group1 = new Group();
        System.out.println(group1);

        // b) Khởi tạo Group với groupName, creator, danh sách Account[], createDate
        Account creator1 = new Account("admin");
        Account[] accounts1 = {new Account("user1"), new Account("user2")};
        Group group2 = new Group("Developers", creator1, accounts1, LocalDate.of(2024, 4, 2));
        System.out.println(group2);

        // c) Khởi tạo Group với groupName, creator, danh sách usernames[], createDate
        String[] usernames = {"john_doe", "jane_smith", "alice_brown"};
        Group group3 = new Group("Designers", creator1, usernames, LocalDate.of(2024, 4, 2));
        System.out.println(group3);
    }

}
