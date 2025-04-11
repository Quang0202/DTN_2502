package model;

import utils.HinhHocException;

public class Circle extends HinhHoc{
    private double radius;
    private final Double PI = 3.14;

    public Circle(double radius) throws HinhHocException {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return PI * radius;
    }

    @Override
    public double acreage() {
        return PI * radius * radius;
    }
}
