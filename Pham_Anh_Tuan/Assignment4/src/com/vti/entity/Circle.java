package com.vti.entity;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    // Constructor không tham số
    public Circle() {
    }

    // Constructor có 1 tham số radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor có 2 tham số radius và color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter và Setter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter và Setter cho color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
