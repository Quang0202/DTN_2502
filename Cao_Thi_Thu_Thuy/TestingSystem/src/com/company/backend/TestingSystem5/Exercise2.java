package com.company.backend.TestingSystem5;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public void q1(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "An", 1));
        students.add(new Student(2, "Bình", 2));
        students.add(new Student(3, "Châu", 1));
        students.add(new Student(4, "Dũng", 3));
        students.add(new Student(5, "Em", 2));
        students.add(new Student(6, "Phong", 1));
        students.add(new Student(7, "Giang", 2));
        students.add(new Student(8, "Hà", 3));
        students.add(new Student(9, "Khánh", 1));
        students.add(new Student(10, "Linh", 3));
        System.out.println("----------Cả lớp điểm danh-----------");
        for(Student s : students){
            s.diemDanh();
        }
        System.out.println("----------Nhóm 1 đi học bài-----------");
        for(Student s : students){
            if (s.getGroup() == 1){
                s.hocBai();
            }
        }
        System.out.println("----------Nhóm 2 đi dọn vệ sinh-----------");
        for(Student s : students){
            if (s.getGroup() == 2){
                s.donVeSinh();
            }
        }
    }

    public void q2(){
        Student2 student = new Student2();
        student.inputInfo();
        student.showInfo();
        System.out.println("Sinh viên được nhận học bổng: " + (student.nhanHocBong() ? "Có" : "Không"));
    }

    public void q3(){
        HinhChuNhat a = new HinhChuNhat(2, 3);
        HinhChuNhat b = new HinhVuong(3);
        a.tinhDienTich();
        b.tinhDienTich();
    }

    public void q4(){
        MyMath myMath = new MyMath();

        int intSum = myMath.sum(10, 20);
        byte b1 = 5;
        byte b2 = 15;
        int byteSum = myMath.sum(b1, b2);
        float floatSum = myMath.sum(3.5f, 4.5f);

        System.out.println("Tổng int: " + intSum);
        System.out.println("Tổng byte: " + byteSum);
        System.out.println("Tổng float: " + floatSum);
    }

    public void q5(){

    }
}
