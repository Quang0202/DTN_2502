package com.programming.nhatanh.lesson8.entity;

public class StudentE3<T> {
    private T id;
    private String name;

    public StudentE3(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentE3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

