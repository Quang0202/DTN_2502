package backend;

import model2_1.Student;

import java.util.ArrayList;

public class Exercise2 {
    ArrayList<Student> students = new ArrayList<>();
    public void ques1a() {
        Student student1 = new Student("a", 1, 1);
        Student student2 = new Student("b", 2, 2);
        Student student3 = new Student("c", 3, 3);
        Student student4 = new Student("d", 4, 2);
        Student student5 = new Student("e", 5, 3);
        Student student6 = new Student("f", 6, 1);
        Student student7 = new Student("g", 7, 2);
        Student student8 = new Student("h", 8, 1);
        Student student9 = new Student("j", 9, 1);
        Student student10 = new Student("i", 10, 1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
    }

    public void ques1b() {
        for (Student student : students) {
            student.diemDanh();
        }
    }

    public void ques1c() {
        for (Student student : students) {
            if (student.getGroup() == 1)
                student.hocBai();
        }
    }

    public void ques1d() {
        for (Student student : students) {
            if (student.getGroup() == 2)
                student.donVeSinh();
        }
    }
}
