package servies.impl;

import model.Group;
import model.Student;
import servies.ITuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinhImpl implements ITuyenSinh {
    ArrayList<Student> students = new ArrayList<>();

    public TuyenSinhImpl() {
        Student student = new Student();
        student.setFullName("Nguyen Thanh Kien");
        student.setAddress("Da Nang");
        student.setGroup(Group.get(1));
        student.setRegistrationNumber("123");
        student.setPriority("1");
        students.add(student);

        student = new Student();
        student.setFullName("Le Van");
        student.setAddress("Da Nang");
        student.setGroup(Group.get(2));
        student.setRegistrationNumber("A1");
        student.setPriority("3");
        students.add(student);
    }

    public void mainMenu() {
        System.out.println("1. Add Student\n" +
                "2. View\n" +
                "3. Search by registration number\n" +
                "4. Exit");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                display();
                break;
            case 3:
                search();
                break;
            default:
                System.exit(0);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhap so bao danh: ");
        Scanner in = new Scanner(System.in);
        Student student = new Student();
        student.setRegistrationNumber(in.nextLine());
        System.out.println("Nhap muc uu tien: ");
        student.setPriority(in.nextLine());
        System.out.println("Nhap dia chi: ");
        student.setAddress(in.nextLine());
        System.out.println("Nhap ho ten: ");
        student.setFullName(in.nextLine());
        System.out.println("Nhập vào số khối dự thi (1.A/2.B/3.C): ");
        student.setGroup(Group.get(in.nextInt()));
        students.add(student);
        System.out.println("Added!!! Enter to continue...");
        in.nextLine();
        mainMenu();
    }

    @Override
    public void display() {
        students.forEach(Student::display);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter to continue...");
        in.nextLine();
        mainMenu();
    }

    @Override
    public void search() {
        System.out.println("Nhập số báo danh cần tìm: ");
        Scanner in = new Scanner(System.in);
        String registrationNumber = in.nextLine();
        students.stream()
                .filter(student -> student.getRegistrationNumber().equalsIgnoreCase(registrationNumber))
                .forEach(Student::display);
        System.out.println("Enter to continue...");
        in.nextLine();
        mainMenu();
    }
}
