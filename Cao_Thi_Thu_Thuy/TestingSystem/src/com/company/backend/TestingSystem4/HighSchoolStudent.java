package com.company.backend.TestingSystem4;

public class HighSchoolStudent extends Student_q3{
    private String clazz;
    private String desiredUniversity;

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        super(id, name);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }
    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Lớp: " + clazz);
        System.out.println("Trường đại học mong muốn: " + desiredUniversity);
    }
}
