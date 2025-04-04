package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double GPA;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.GPA = 0;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void plusPoint(double plus) {
        this.GPA += plus;
    }

    public void display() {
        String hocLuc = "";
        if (GPA < 4)
            hocLuc = "Yếu";
        else if (GPA < 6)
            hocLuc = "Trung bình";
        else if (GPA < 8)
            hocLuc = "Khá";
        else
            hocLuc = "Giỏi";
        System.out.println(name + " " + hocLuc);
    }
}
