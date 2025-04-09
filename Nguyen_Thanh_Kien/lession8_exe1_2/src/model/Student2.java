package model;

import java.time.LocalDate;

public class Student2 {
    private static int countId = 0;
    private int id;
    private String name;
    private Double score;
    private LocalDate birthday;

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", birthday=" + birthday +
                '}';
    }

    public Student2(String name, Double score, LocalDate birthday) {
        countId++;
        this.id = countId;
        this.name = name;
        this.score = score;
        this.birthday = birthday;
    }

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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
