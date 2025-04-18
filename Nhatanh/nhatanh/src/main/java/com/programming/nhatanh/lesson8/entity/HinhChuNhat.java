package com.programming.nhatanh.lesson8.entity;

import com.programming.nhatanh.lesson7.entity.HinhHoc;

public class HinhChuNhat extends HinhHoc {

    public double height;
    public double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public HinhChuNhat(double height, double width) {

        this.height = height;
        this.width = width;
    }

    public HinhChuNhat() {
    }

    @Override
    public float perimeter() {
        return (float) (2*(height+width));
    }

    @Override
    public float area() {
        return (float) (height*width);
    }
}
