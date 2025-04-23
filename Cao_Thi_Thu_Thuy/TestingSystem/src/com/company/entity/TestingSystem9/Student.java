package com.company.entity.TestingSystem9;

public class Student {
    private static int counter = 0;
    private int id;
    private String name;

    public Student(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Deprecated
    /*
      @deprecated Hãy sử dụng getFormattedId() thay thế".
     */
    public int getId() {
        return id;
    }

    public String getFormattedId() {
        return "MSV: " + id;
    }
}
