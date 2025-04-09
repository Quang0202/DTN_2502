package com.vti.backend;

import com.vti.entity.Account_4;
import com.vti.entity.Circle;
import com.vti.entity.Date;

public class Ex_4_2 {
    public void question4_2(){
        Circle circle = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(5.0,"red");

        System.out.println(circle);
        System.out.println(circle2);
        System.out.println(circle3);

        Account_4 ac1 = new Account_4("23","Ethan",5000);
        Account_4 ac2 = new Account_4("25","Ngan",3000);
        System.out.println(ac1);
        ac1.credit(2000);
        System.out.println(ac1);
        ac1.debit(1000);
        System.out.println(ac1);

        ac1.transferTo(ac2, 3000);
        System.out.println(ac1);
        System.out.println(ac2);

        Date date = new Date(4,5,2025);
        System.out.println(date);
        System.out.println("Co phai nam nhuan ko: " + date.isLeapYear());
    }
}
