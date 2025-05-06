package com.vti.frontend;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.Waiter;

public class Pro6_2_3 {
    public static void main(String[] args) {
        Employee emp = new Employee("Nguyen", 2.5);
        Manager mgr = new Manager("Orm", 3.5);
        Waiter waiter = new Waiter("Ling", 2);

        System.out.println("== Thông tin nhân viên ==");
        emp.displayInfor();

        System.out.println("\n== Thông tin quản lý ==");
        mgr.displayInfor();

        System.out.println("\n== Thông tin phục vụ ==");
        waiter.displayInfor();

    }
}
