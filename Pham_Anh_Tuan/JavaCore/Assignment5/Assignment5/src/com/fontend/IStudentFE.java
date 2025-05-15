package com.fontend;

import com.entity.Student;

import java.util.ArrayList;

public class IStudentFE {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nguyễn Văn A", 1));
        students.add(new Student(2, "Nguyễn Văn B", 1));
        students.add(new Student(3, "Nguyễn Văn C", 1));
        students.add(new Student(4, "Trần Thị D", 2));
        students.add(new Student(5, "Lê Văn E", 2));
        students.add(new Student(6, "Phạm Thị F", 2));
        students.add(new Student(7, "Đỗ Văn G", 3));
        students.add(new Student(8, "Ngô Thị H", 3));
        students.add(new Student(9, "Vũ Văn I", 3));
        students.add(new Student(10, "Hoàng Thị K", 3));

        System.out.println("==> Điểm danh cả lớp:");
        for (Student s : students) {
            s.diemDanh();
        }

        System.out.println("\n==> Nhóm 1 học bài:");
        for (Student s : students) {
            if (s.getGroup() == 1) {
                s.hocBai();
            }
        }

        System.out.println("\n==> Nhóm 2 đi dọn vệ sinh:");
        for (Student s : students) {
            if (s.getGroup() == 2) {
                s.diDonVeSinh();
            }
        }
    }
}
