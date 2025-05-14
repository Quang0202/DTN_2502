package model2_2;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;

    public Person() {
    }

    public Person(String name, String address, String dateOfBirth, String gender) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = scanner.nextLine();
        System.out.println("Nhap gioi tinh:");
        gender = scanner.nextLine();
        System.out.println("Nhap ngay sinh:");
        dateOfBirth = scanner.nextLine();
        System.out.println("Nhap dia chi:");
        address = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
