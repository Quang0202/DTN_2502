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
        for(Student s: students){
            s.nopQuy(100);
        }
        Student.printMoneyGroup("B1");
        // B2.
        students.get(0).layQuy(50);
        Student.printMoneyGroup("B2");
        // B3.
        students.get(0).layQuy(20);
        Student.printMoneyGroup("B3");
        // B4.
        students.get(0).layQuy(150);
        Student.printMoneyGroup("B4");
        // B5.
        for(Student s: students){
            s.nopQuy(50);
        }
        Student.printMoneyGroup("B5");
    }
    public void q3(){
        System.out.println("Max: " + MyMath.max(3.4, 5.0));
        System.out.println("Min: " + MyMath.min(2, 9));
        System.out.println("Sum: " + MyMath.sum(3.1, 2.9));
    }
    public void q5(){
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
    }
    public void q6(){
        Student s1 = new PrimaryStudent(1, "An");
        Student s2 = new PrimaryStudent(2, "Bình");
        Student s3 = new SecondaryStudent(3, "Cường");
        Student s4 = new SecondaryStudent(4, "Dũng");
        Student s5 = new SecondaryStudent(5, "Em");
        Student s6 = new SecondaryStudent(6, "Phúc");
        Student s7 = new SecondaryStudent(7, "Em");
        Student s8 = new SecondaryStudent(8, "Phúc");
    }
    public void q8() throws HinhHocException {
        HinhHoc h1 = new HinhChuNhat(2, 3);
        HinhHoc h2 = new HinhChuNhat(2, 3);
        HinhHoc h3 = new HinhChuNhat(2, 3);
        HinhHoc h4 = new HinhChuNhat(2, 3);
        HinhHoc h5 = new HinhChuNhat(2, 3);
        HinhHoc h6 = new HinhTron(2);
        HinhHoc h7 = new HinhTron(2);
        System.out.println(Configs.SO_LUONG_HINH_TOI_DA);
    }
}
