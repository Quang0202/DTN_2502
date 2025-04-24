package entity;

import java.io.Serializable;

public class Exercise5_Student implements Serializable {
    private int id;
    private String name;

    public Exercise5_Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}
