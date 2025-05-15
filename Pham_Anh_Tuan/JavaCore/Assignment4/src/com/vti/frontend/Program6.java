package com.vti.frontend;

import com.vti.entity.*;

public class Program6 {
    public static void main(String[] args) {
        VietnamesePhone phone = new VietnamesePhone();

//        phone.insertContact("Nam", "0901234567");
//        phone.insertContact("Lan", "0912345678");
//        phone.insertContact("Nam", "0987654321"); // Thêm số thứ 2 cho Nam
//        phone.printContacts();
//
//        phone.searchContact("Lan");
//
//        phone.updateContact("Lan", "0333333333");
//        phone.printContacts();
//
//        phone.removeContact("Nam");
//        phone.printContacts();

        Employee employee = new Employee("Tuan",12.2);
        Manager manager = new Manager("Tuan 2",31.3);
        Waiter waiter = new Waiter("Tuan 3",4.5);
        employee.displayInfor();
        manager.displayInfor();
        waiter.displayInfor();
    }
}
