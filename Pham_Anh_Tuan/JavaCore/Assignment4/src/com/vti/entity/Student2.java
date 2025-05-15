package com.vti.entity;

public abstract class Student2 extends Person {

    protected int id;

    public Student2(int id, String name) {
        super(name);
        this.id = id;
    }
}
