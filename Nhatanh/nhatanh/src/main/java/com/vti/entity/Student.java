package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float GPA;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.GPA = 0;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public void addGPA(float value){
        this.GPA += value;
    }

    public void getStudentInfo(){
        String classify = "";
        if(this.GPA < 4.0){
            classify = "Yếu";
        } else if (this.GPA < 6.0){
            classify = "Trung bình";
        } else if (this.GPA < 8.0) {
            classify = "Khá";
        } else {
            classify = "Giỏi";
        }

        System.out.println(name + " " + classify);

    }
}
