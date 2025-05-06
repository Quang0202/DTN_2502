package com.vti.frontend;

import com.vti.entity.Student;

import java.util.ArrayList;

public class Pro2_1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // a) Tạo 10 học sinh chia thành 3 nhóm
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

        // b) Kêu gọi cả lớp điểm danh
        System.out.println("\n== Điểm danh cả lớp ==");
        for (Student s : students) {
            s.diemDanh();
        }

        // c) Gọi nhóm 1 học bài
        System.out.println("\n== Nhóm 1 học bài ==");
        for (Student s : students) {
            if (s.getGroup() == 1) {
                s.hocBai();
            }
        }

        // d) Gọi nhóm 2 đi dọn vệ sinh
        System.out.println("\n== Nhóm 2 dọn vệ sinh ==");
        for (Student s : students) {
            if (s.getGroup() == 2) {
                s.diDonVeSinh();
            }
        }
    }
}
