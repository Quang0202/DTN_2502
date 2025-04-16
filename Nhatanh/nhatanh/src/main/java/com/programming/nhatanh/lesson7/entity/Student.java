package com.programming.nhatanh.lesson7.entity;

public class Student {

    private final int id;
    private String name;
    public static String college = "Đại học bách khoa";
    public static int moneyGroup;
    public static int studentCount = 0;
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        if(studentCount <= 6) {
            this.id = id;
            this.name = name;
            studentCount += 1;
        } else {
            throw new RuntimeException("Limit reached");
        }

    }

    public Student() {
        if(studentCount <= 6) {
        studentCount += 1;
        this.id = studentCount;
        } else {
            throw new RuntimeException("Limit reached");
        }
    }

    public void increaseMoneyGroup(int amount){
        moneyGroup += amount;
    }
    public void decreaseMoneyGroup(int amount){
        moneyGroup -= amount;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String newCollege){
        college = newCollege;
    }

    public final void study(){
        System.out.println("Đang học bài…");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college=" + college +
                '}';
    }
}
