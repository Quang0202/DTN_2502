package backend;

import entity.*;
import utils.Configs;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    // Question 1
    public void question1() {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");

        System.out.println("Student information before changing college:");
        System.out.println("Student 1: ID = " + student1.getId() + ", Name = " + student1.getName() + ", College = " + Student.college);
        System.out.println("Student 2: ID = " + student2.getId() + ", Name = " + student2.getName() + ", College = " + Student.college);
        System.out.println("Student 3: ID = " + student3.getId() + ", Name = " + student3.getName() + ", College = " + Student.college);

        Student.college = "Đại học công nghệ";

        System.out.println("\nStudent information after changing college:");
        System.out.println("Student 1: ID = " + student1.getId() + ", Name = " + student1.getName() + ", College = " + Student.college);
        System.out.println("Student 2: ID = " + student2.getId() + ", Name = " + student2.getName() + ", College = " + Student.college);
        System.out.println("Student 3: ID = " + student3.getId() + ", Name = " + student3.getName() + ", College = " + Student.college);
    }

    // Question 2
    public void question2() {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");

        Student.moneyGroup += 100 * 3;
        System.out.println("B1: After all students contribute 100k each, total money: " + Student.moneyGroup + "k");

        Student.moneyGroup -= 50;
        System.out.println("B2: After student 1 takes 50k for snacks, total money: " + Student.moneyGroup + "k");

        Student.moneyGroup -= 20;
        System.out.println("B3: After student 2 takes 20k for bread, total money: " + Student.moneyGroup + "k");

        Student.moneyGroup -= 150;
        System.out.println("B4: After student 3 takes 150k for school supplies, total money: " + Student.moneyGroup + "k");

        Student.moneyGroup += 50 * 3;
        System.out.println("B5: After all students contribute 50k more each, total money: " + Student.moneyGroup + "k");
    }

    // Question 4
    public void question4() {
        System.out.println("Current college: " + Student.getCollege());
        Student.setCollege("Đại học FPT");
        System.out.println("New college: " + Student.getCollege());
    }

    // Question 5
    public void question5() {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");

        System.out.println("Total number of students created: " + Student.getCount());
    }

    // Question 6
    public void question6() {
        Student student1 = new Student(1, "Student 1");
        Student student2 = new Student(2, "Student 2");

        PrimaryStudent primary1 = new PrimaryStudent(3, "Primary 1");
        PrimaryStudent primary2 = new PrimaryStudent(4, "Primary 2");

        SecondaryStudent secondary1 = new SecondaryStudent(5, "Secondary 1");
        SecondaryStudent secondary2 = new SecondaryStudent(6, "Secondary 2");
        SecondaryStudent secondary3 = new SecondaryStudent(7, "Secondary 3");
        SecondaryStudent secondary4 = new SecondaryStudent(8, "Secondary 4");

        System.out.println("Total Students: " + Student.getCount());
        System.out.println("Primary Students: " + PrimaryStudent.getPrimaryCount());
        System.out.println("Secondary Students: " + SecondaryStudent.getSecondaryCount());
    }

    // Question 7
    public void question7() {
        List<Student> students = new ArrayList<>();

        try {
            // Create 7 students (maximum allowed)
            for (int i = 1; i <= 7; i++) {
                students.add(new Student(i, "Student " + i));
            }
            System.out.println("Created " + Student.getCount() + " students successfully");

            // Try to create one more student (exceeds the limit)
            Student student8 = new Student(8, "Student 8");
        } catch (Exception e) {
            System.out.println("Cannot create more than 7 students");
        }
    }

    // Question 8
    public void question8() {
        try {
            HinhTron circle1 = new HinhTron(5);
            System.out.println("Created circle 1 with radius 5");
            System.out.println("Circle 1 - Area: " + circle1.tinhDienTich() + ", Perimeter: " + circle1.tinhChuVi());

            HinhChuNhat rectangle1 = new HinhChuNhat(4, 6);
            System.out.println("Created rectangle 1 with width 4 and height 6");
            System.out.println("Rectangle 1 - Area: " + rectangle1.tinhDienTich() + ", Perimeter: " + rectangle1.tinhChuVi());

            HinhTron circle2 = new HinhTron(3);
            System.out.println("Created circle 2 with radius 3");

            HinhChuNhat rectangle2 = new HinhChuNhat(2, 8);
            System.out.println("Created rectangle 2 with width 2 and height 8");

            HinhTron circle3 = new HinhTron(4);
            System.out.println("Created circle 3 with radius 4");

            // This should throw an exception as it exceeds the limit
            HinhTron circle4 = new HinhTron(7);

        } catch (HinhHocException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
