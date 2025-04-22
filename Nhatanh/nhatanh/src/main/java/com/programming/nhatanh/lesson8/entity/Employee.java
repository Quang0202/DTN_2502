package com.programming.nhatanh.lesson8.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee <T> {

    private int id;
    private String name;
    private ArrayList<T> salaries;

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

    public ArrayList<T> getSalaries() {
        return salaries;
    }

    public void setSalaries(ArrayList<T> salaries) {
        this.salaries = salaries;
    }

    public Employee(int id, String name, ArrayList<T> salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        T item;
        if (salaries != null && !salaries.isEmpty()) {
            item = salaries.getLast();
        } else {
            item = null;
        }

        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary last=" + item +
                '}';
    }
}
