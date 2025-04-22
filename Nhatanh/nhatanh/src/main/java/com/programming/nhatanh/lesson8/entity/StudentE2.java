package com.programming.nhatanh.lesson8.entity;

import java.time.LocalDateTime;
import java.util.Comparator;

public class StudentE2 {
    private int id;
    private String name;
    private double GPA;
    private LocalDateTime DoB;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public LocalDateTime getDoB() {
        return DoB;
    }

    public void setDoB(LocalDateTime doB) {
        DoB = doB;
    }

    public StudentE2(int id, String name, double GPA, LocalDateTime doB) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
        DoB = doB;
    }

    public StudentE2() {
    }

    @Override
    public String toString() {
        return "StudentE2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                ", DoB=" + DoB +
                '}';
    }
}
