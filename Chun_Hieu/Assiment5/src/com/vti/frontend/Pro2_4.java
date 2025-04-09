package com.vti.frontend;

import com.vti.entity.MyMath;

public class Pro2_4 {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int a = 5, b = 10;
        float x = 5.5f, y = 3.3f;
        byte m = 4, n = 7;

        System.out.println("Tổng int: " + myMath.sum(a, b));
        System.out.println("Tổng float: " + myMath.sum(x, y));
        System.out.println("Tổng byte: " + myMath.sum(m, n));
    }
}
