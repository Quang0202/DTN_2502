package com.vti.frontend;

import com.vti.entity.Student;

import java.util.ArrayList;

public class Pro2_1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", 1));
        students.add(new Student(2, "Nguyễn Văn B", 1));
        students.add(new Student(3, "Nguyễn Văn C", 1));
        students.add(new Student(4, "Trần Thị D", 2));
        students.add(new Student(5, "Lê Văn E", 2));
        students.add(new Student(6, "Phạm Thị F", 2));
        students.add(new Student(7, "Hoàng Văn G", 3));
        students.add(new Student(8, "Đỗ Thị H", 3));
        students.add(new Student(9, "Bùi Văn I", 3));
        students.add(new Student(10, "Vũ Thị K", 3));
        System.out.println("Cả lớp điểm danh   ");
        for (Student student : students) {
            student.diemdanh();
        }
        System.out.println("Nhóm 1 học bài   ");
        for (Student student : students) {
            if(student.getGroup() == 1){
                student.hocBai();
            }
        }
        System.out.println("Nhóm 2 đi dọn vệ sinh  ");
        for (Student student : students) {
            if(student.getGroup() == 2){
                student.diDonVeSinh();
            }
        }
    }
}
