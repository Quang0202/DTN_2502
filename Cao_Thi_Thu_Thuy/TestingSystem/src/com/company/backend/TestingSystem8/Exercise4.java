package com.company.backend.TestingSystem8;

import com.company.entity.TestingSystem8.MyMath;
import com.company.entity.TestingSystem8.MyNumber;
import com.company.entity.TestingSystem8.Salary;

public class Exercise4 {
    public void q1(){
        Salary<Float> salary = new Salary<>(1.8f);
        System.out.println(salary);
    }
    public void q2(){
        MyNumber<Integer> number = new MyNumber<>();
    }
    public void q3(){
        System.out.println(MyNumber.max(1, 6));
    }
    public void q4(){
        MyMath<Integer> myMath = new MyMath<>();
        System.out.println("Tổng 2 số: " + myMath.sum(5, 10));
        System.out.println("Tổng 3 số: " + myMath.sum(5, 10, 15));
        System.out.println("Tổng 4 số: " + myMath.sum(5, 10, 15, 20));
    }
    public void q5(){

    }
}
