package com.vti.entity;

public class HighSchoolStudent extends Student2 {
    private String clazz;
    private String desiredUniversity;

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        super(id, name);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }


    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Class: " + clazz);
        System.out.println("Desired University: " + desiredUniversity);
    }
}
