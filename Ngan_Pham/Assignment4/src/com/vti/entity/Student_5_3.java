package com.vti.entity;

public class Student_5_3 extends Person{
    private int id;
    public Student_5_3(String name,int id) {
        super(name);
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
