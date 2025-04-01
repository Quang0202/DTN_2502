package com.company.backend.TestingSystem4;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float score;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        score = 0;
    }

    public void setScore(float score) {
        this.score = score;
    }
    public void addScore(float plusScore){
        score += plusScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + (score < 4 ? "Yếu":((score >= 4 & score<6)?"Trung bình":((score >= 6 & score<8)?"Khá":"Giỏi"))) +
                '}';
    }
}
