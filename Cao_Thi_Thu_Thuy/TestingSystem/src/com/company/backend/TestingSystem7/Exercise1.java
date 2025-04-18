package com.company.backend.TestingSystem7;

import com.company.entity.TestingSystem7.*;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public void q1(List<Student> students){
        for(Student s: students) {
            System.out.println(s.toString());
        }
        Student.setCollege("Đại học công nghệ");
        for(Student s: students) {
            System.out.println(s.toString());
        }
    }
    public void q2(List<Student> students){
        // B1.
        for(Student student : students){
            student.nopQuy(100);
        }
        System.out.println("Số quỹ còn lại là: "+ Student.getMoneyGroup());

//        Student.setMoneyGroup(Student.getMoneyGroup() + students.size() * 100);
//        Student.printMoneyGroup("B1");
//        // B2.
        students.get(0).layQuy(50);
        System.out.println("Số quỹ còn lại là: "+ Student.getMoneyGroup());

//        Student.setMoneyGroup(Student.getMoneyGroup() - 50);
//        Student.printMoneyGroup("B2");
//        // B3.
        students.get(1).layQuy(20);
        System.out.println("Số quỹ còn lại là: "+ Student.getMoneyGroup());
//        Student.setMoneyGroup(Student.getMoneyGroup() - 20);
//        Student.printMoneyGroup("B3");
//        // B4.
        students.get(2).layQuy(150);
        System.out.println("Số quỹ còn lại là: "+ Student.getMoneyGroup());
//        Student.setMoneyGroup(Student.getMoneyGroup() - 150);
//        Student.printMoneyGroup("B4");
//        // B5.
        for(Student student : students){
            student.nopQuy(50);
        }
        System.out.println("Số quỹ còn lại là: "+ Student.getMoneyGroup());
//        Student.setMoneyGroup(Student.getMoneyGroup() + students.size() * 50);
//        Student.printMoneyGroup("B5");

    }
    public void q3(){
        System.out.println("Max: " + MyMath.max(3.4, 5.0));
        System.out.println("Min: " + MyMath.min(2, 9));
        System.out.println("Sum: " + MyMath.sum(3.1, 2.9));
    }
    public void q5(){
        try {
            Student s1 = new PrimaryStudent(1, "An");
            Student s2 = new PrimaryStudent(2, "Bình");
            Student s3 = new SecondaryStudent(3, "Cường");
            Student s4 = new SecondaryStudent(4, "Dũng");
            Student s5 = new SecondaryStudent(5, "Em");
            Student s6 = new SecondaryStudent(6, "Phúc");

            System.out.println("\n--- Tổng kết ---");
            System.out.println("Số lượng Student: " + Student.getCountStudent());
            System.out.println("Số lượng PrimaryStudent: " + PrimaryStudent.getCountPrimaryStudent());
            System.out.println("Số lượng SecondaryStudent: " + SecondaryStudent.getCountSecondaryStudent());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void q6(){
        try {
            Student s1 = new PrimaryStudent(1, "An");
            Student s2 = new PrimaryStudent(2, "Bình");
            Student s3 = new SecondaryStudent(3, "Cường");
            Student s4 = new SecondaryStudent(4, "Dũng");
            Student s5 = new SecondaryStudent(5, "Em");
            Student s6 = new SecondaryStudent(6, "Phúc");
            Student s7 = new SecondaryStudent(7, "Em");
            Student s8 = new SecondaryStudent(8, "Phúc");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(Student.getCountStudent());
    }
    public void q8() {
        try {
            HinhHoc h1 = new HinhChuNhat(2, 3);
            HinhHoc h2 = new HinhChuNhat(2, 3);
            HinhHoc h3 = new HinhChuNhat(2, 3);
            HinhHoc h4 = new HinhChuNhat(2, 3);
            HinhHoc h5 = new HinhChuNhat(2, 3);
            HinhHoc h6 = new HinhTron(2);
            HinhHoc h7 = new HinhTron(2);
        } catch (HinhHocException e){
            System.out.println(e.getMessage());
        }
        System.out.println(HinhHoc.getCount());
    }
}
