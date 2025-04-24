package com.programming.nhatanh.lesson9.entity;

public class Student {
    private int id;
    private String name;
    private static int count = 0;

    public Student(String name) {
        this.name = name;
        count++;
        id = count;
    }

    /**
     * @deprecated replaced by {@link #getIdNew()}
     */
    public int getId() {
        return id;
    }

    public String getIdNew() {
        return "MSV: " + id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
