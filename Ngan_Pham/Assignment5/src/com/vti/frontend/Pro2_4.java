package com.vti.frontend;

import com.vti.entity.MyMath;

public class Pro2_4 {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        int a = 5, b = 10;
        byte c = 2, d = 3;
        float e = 1.5f, f = 2.5f;
        double g = 6.4, h = 3.6;

        System.out.println("Tổng int: " + math.sum(a, b));
        System.out.println("Tổng byte: " + math.sum(c, d));
        System.out.println("Tổng float: " + math.sum(e, f));
        System.out.println("Tổng double: " + math.sum(g, h));
    }
}
