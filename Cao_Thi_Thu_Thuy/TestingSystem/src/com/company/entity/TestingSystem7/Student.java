package com.company.entity.TestingSystem7;

public class Student {
    private final int id;
    private String name;
    private static String college = "Đại học Bách Khoa";
    private static double moneyGroup = 0;
    private static int countStudent = 0;
    private static  final int MAX_STUDENTS = 7;

    public Student(int id, String name) {
        if (countStudent >= MAX_STUDENTS) {
            throw new RuntimeException("Không thể tạo thêm học sinh. Đã đạt giới hạn " + MAX_STUDENTS);
        }
        this.id = id;
        this.name = name;
        countStudent += 1;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", name: " + name + ", college: " + college;
    }
    public static void printMoneyGroup(String step){
        System.out.println("Sau " + step + ", quỹ lớp còn lại: " + moneyGroup);
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static double getMoneyGroup() {
        return moneyGroup;
    }

    public static void setMoneyGroup(double moneyGroup) {
        Student.moneyGroup = moneyGroup;
    }

    public void nopQuy(double money){
        System.out.println(name + " nộp quỹ " + money);
        moneyGroup += money;
    }

    public void layQuy(double money){
        System.out.println(name + " lấy quỹ " + money);
        moneyGroup -= money;
    }

    public static int getCountStudent() {
        return countStudent;
    }

    public static void setCountStudent(int countStudent) {
        Student.countStudent = countStudent;
    }
    public final void study(){
        System.out.println("Đang học bài...");
    }
}
