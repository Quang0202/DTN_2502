package Exercise1.backend;

import Exercise1.entity.*;

import java.util.ArrayList;

public class Exercise1 {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    public void ques1() {
        try {
            Student student1 = new Student(1, "Nguyen van a");
            Student student2 = new Student(2, "Nguyen van b");
            Student student3 = new Student(3, "Nguyen van c");

            studentArrayList.add(student1);
            studentArrayList.add(student2);
            studentArrayList.add(student3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Student.setCollege("Đại học bách khoa");

        for (Student student : studentArrayList) {
            System.out.println(student + " " + Student.getCollege());
        }

        Student.setCollege("Đại học công nghệ");

        for (Student student : studentArrayList) {
            System.out.println(student + " " + Student.getCollege());
        }
    }

    public void ques2() {
        for (Student student : studentArrayList) {
            student.chargeMoney(100000);
        }
        System.out.println("Tien quy: " + Student.getMoneyGroup());

        studentArrayList.get(0).useMoney(50000);
        System.out.println("Mua bim bim, banh keo");
        System.out.println("Tien quy: " + Student.getMoneyGroup());

        studentArrayList.get(1).useMoney(20000);
        System.out.println("Mua banh mi");
        System.out.println("Tien quy: " + Student.getMoneyGroup());

        studentArrayList.get(2).useMoney(150000);
        System.out.println("Mua do dung hoc tap");
        System.out.println("Tien quy: " + Student.getMoneyGroup());

        for (Student student : studentArrayList) {
            student.chargeMoney(50000);
        }
        System.out.println("Tien quy: " + Student.getMoneyGroup());
    }

    public void ques3() {
        int a = 5;
        int b = 7;
        System.out.println(MyMath.max(a, b));
        System.out.println(MyMath.min(a, b));
        System.out.println(MyMath.sum(a, b));
    }

    public void ques6() {
        try {
            Student student1 = new SecondaryStudent(1, "nva");
            Student student2 = new SecondaryStudent(2, "nvb");
            Student student3 = new SecondaryStudent(3, "nvc");
            Student student4 = new SecondaryStudent(4, "nvc");
            Student student5 = new PrimaryStudent(5, "nve");
            Student student6 = new PrimaryStudent(6, "nvf");
            Student student7 = new PrimaryStudent(6, "nvf");
            Student student8 = new PrimaryStudent(6, "nvf");
        }
        catch (Exception e) {
            System.out.println("Chi duoc tao toi da 7 hoc sinh");
        }

        System.out.println("So luong student: " + Student.getCount());
        System.out.println("So luong primary student: " + PrimaryStudent.getCount());
        System.out.println("So luong secondary student: " + SecondaryStudent.getCount());
    }

    public void ques8() {
        ArrayList<HinhHoc> hinhHocs = new ArrayList<>();
        try {
            HinhHoc h1 = new HinhTron(1);
            hinhHocs.add(h1);
            HinhHoc h2 = new HinhTron(1.5);
            hinhHocs.add(h2);
            HinhHoc h3 = new HinhTron(2);
            hinhHocs.add(h3);
            HinhHoc h4 = new HinhChuNhat(3, 5);
            hinhHocs.add(h4);
            HinhHoc h5 = new HinhChuNhat(6, 9);
            hinhHocs.add(h5);
            HinhHoc h6 = new HinhChuNhat(1, 7);
            hinhHocs.add(h6);
        }
        catch (HinhHocException e) {
            System.out.println(e.getMessage());
        }

        for (HinhHoc hinhHoc : hinhHocs) {
            hinhHoc.tinhChuVi();
        }
    }
}
