package Exercise2.Q1;

import java.util.ArrayList;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", 1));
        students.add(new Student(2, "Nguyen Van B", 1));
        students.add(new Student(3, "Nguyen Van C", 1));
        students.add(new Student(4, "Nguyen Van D", 2));
        students.add(new Student(5, "Nguyen Van E", 2));
        students.add(new Student(6, "Nguyen Van F", 2));
        students.add(new Student(7, "Nguyen Van G", 3));
        students.add(new Student(8, "Nguyen Van H", 3));
        students.add(new Student(9, "Nguyen Van I", 3));
        students.add(new Student(10, "Nguyen Van J", 3));

        System.out.println("--- Diem danh ---");
        for (Student s : students) {
            s.diemDanh();
        }

        System.out.println("--- Nhom 1 hoc bai ---");
        for (Student s : students) {
            if (s.getGroup() == 1) {
                s.hocBai();
            }
        }

        System.out.println("--- Nhom 2 don ve sinh ---");
        for (Student s : students) {
            if (s.getGroup() == 2) {
                s.diDonVeSinh();
            }
        }
    }
}