package com.vti.frontend;

import com.vti.abstraction.Employee;
import com.vti.abstraction.User;
import com.vti.backend.Exercise5;
import com.vti.abstraction.Phone;
import com.vti.abstraction.VietnamesePhone;

public class Program5 {
    public static void main(String[] args) {

        Exercise5 exercise5 = new Exercise5();
//        exercise5.ques5a();
//        exercise5.ques5b();
//        exercise5.ques5c();
//        exercise5.ques5d();
        Phone phone = new VietnamesePhone();
        if (phone instanceof VietnamesePhone) {
            phone.insertContact("kien", "0942968033");
        }

        User user = new Employee("kien", 5200);
        user.calculatePay();
    }
}
