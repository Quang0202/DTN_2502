package model;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {

    private final int SCHOLARSHIP_POINTS = 8;

    private String code;
    private String email;
    private Double average;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public Student inputInfo() {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        s.setName(sc.nextLine());
        System.out.println("Enter gender: (1.Male, 2.Female, 3.Other)");
        s.setGender(Gender.get(sc.nextInt()));
        sc.nextLine();
        System.out.println("Enter birthday: (yyyy-mm-dd)");
        s.setBirthday(LocalDate.parse(sc.nextLine()));
        System.out.println("Enter address: ");
        s.setAddress(sc.nextLine());
        System.out.println("Enter code: ");
        s.setCode(sc.nextLine());
        System.out.println("Enter email: ");
        s.setEmail(sc.nextLine());
        System.out.println("Enter average: ");
        s.setAverage(sc.nextDouble());
        return s;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName() +
                "\nGender: " + getGender() +
                "\nBirthday: " + getBirthday() +
                "\nAddress: " + getAddress() +
                "\nCode: " + getCode() +
                "\nEmail: " + getEmail() +
                "\nAverage: " + getAverage());
    }

    public Boolean checkScholarship(){
        return this.average >= SCHOLARSHIP_POINTS;
    }
}
