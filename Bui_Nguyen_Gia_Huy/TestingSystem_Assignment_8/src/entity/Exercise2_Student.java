package entity;

import java.util.Date;

public class Exercise2_Student {
    private int id;
    private String name;
    private Date birthDate;
    private float score;

    private static int counter = 0;

    public Exercise2_Student(String name, Date birthDate, float score) {
        this.id = ++counter;
        this.name = name;
        this.birthDate = birthDate;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', birthDate=" + birthDate + ", score=" + score + "}";
    }
}
