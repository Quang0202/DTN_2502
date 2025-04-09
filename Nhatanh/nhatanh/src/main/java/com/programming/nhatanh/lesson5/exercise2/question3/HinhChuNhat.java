package com.programming.nhatanh.lesson5.exercise2.question3;

public class HinhChuNhat {
    private int height;
    private int width;

    public void perimeter(){
        if(this instanceof HinhVuong){
            System.out.println("Tính chu vi theo hình vuông");

        } else {
            System.out.println("Tính chu vi theo hình chữ nhật");
        }
        System.out.println("Tính chu vi theo " + this.getClass());
        System.out.println((height + width)*2);
    }

    public HinhChuNhat(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void area(){
        if(this instanceof HinhVuong){
            System.out.println("Tính diện tích theo hình vuông");

        } else {
            System.out.println("Tính diện tích theo hình chữ nhật");
        }
        System.out.println(height * width);
    }

}
