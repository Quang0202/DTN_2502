package com.vti.backend;

public abstract class Student extends Person{
    private int id;

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }
}
