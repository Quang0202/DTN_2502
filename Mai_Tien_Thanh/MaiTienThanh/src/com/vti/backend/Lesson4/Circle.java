package MaiTienThanh.src.com.vti.backend.Lesson4;

public class Circle {
    private double radius;
    private String color = "red";
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void setArea(double area) {
        this.radius = area;
    }

    @Override
    public String toString() {
        return "Circle: \n" +
                "Radius: " + radius + "\n" +
                "Color: " + color + "\n" ;
    }
}
