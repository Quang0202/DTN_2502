package com.vti.frontend;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.entity.Waiter;

public class Pro6_2_3 {
    public static void main(String[] args) {
        User emp = new Employee("Chun", 1.2);
        User man  = new Manager("Hieu", 1.5);
        User wai = new Waiter("Wai", 1.0);

        emp.displayInfo();
        man.displayInfo();
        wai.displayInfo();
    }
}
