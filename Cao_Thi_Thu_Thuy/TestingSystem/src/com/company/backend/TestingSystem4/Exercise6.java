package com.company.backend.TestingSystem4;

public class Exercise6 {
    public void q1(){
        VietnamesePhone phoneBook = new VietnamesePhone();

        phoneBook.insertContact("A", "0123456789");
        phoneBook.insertContact("B", "0987654321");
        phoneBook.insertContact("A", "0333444555"); // thêm số cho A

        phoneBook.showAllContacts();

        phoneBook.updateContact("B", "0111111111");
        phoneBook.searchContact("C");

        phoneBook.removeContact("A");
        phoneBook.showAllContacts();
    }
    public void q2(){
        User emp = new Employee("Tran Thi B", 2.0);
        User manager = new Manager("Nguyen Van C", 3.0);
        User waiter = new Waiter("Le Van D", 1.5);

        emp.displayInfor();
        System.out.println("-----");

        manager.displayInfor();
        System.out.println("-----");

        waiter.displayInfor();
    }
}
