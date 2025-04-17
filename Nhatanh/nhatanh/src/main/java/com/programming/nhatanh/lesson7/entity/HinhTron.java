package com.programming.nhatanh.lesson7.entity;

import com.programming.nhatanh.lesson7.exception.HinhHocException;

public class HinhTron extends HinhHoc{

    public double radius;

    public HinhTron(double radius) {
        if(super.getShapeCount() < Configs.SO_LUONG_HINH_TOI_DA) {
            super.increaseShapeCount();
            this.radius = radius;
        } else {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
        }
    }

    public HinhTron() {
        if(super.getShapeCount() < Configs.SO_LUONG_HINH_TOI_DA) {
            super.increaseShapeCount();
        } else {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public float perimeter() {
        return (float) (2*3.14f*radius);
    }

    @Override
    public float area() {
        return (float) (3.14f*radius*radius);
    }
}
