package model;

import utils.HinhHocException;

public class Rectangle extends HinhHoc {
    private double width;
    private double length;

    public Rectangle(double width, double length) throws HinhHocException {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return (width + length) * 2;
    }

    @Override
    public double acreage() {
        return width * length;
    }
}
