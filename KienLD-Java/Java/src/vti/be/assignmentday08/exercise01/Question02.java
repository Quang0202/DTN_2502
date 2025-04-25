package vti.be.assignmentday08.exercise01;

import java.util.ArrayList;
import java.util.List;

import static vti.be.assignmentday08.exercise01.Question01.Student.college;

public class Question02 {
    public static  void main(String[] args) {
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");

        Student[] students = { student1, student2 , student3 };
        System.out.println("Các Student sẽ nộp quỹ, mỗi Student 100k");
        for( int i =0; i < students.length; i ++) {
            Student.moneyGroup += 100;
        }

        System.out.println("So tien buoc 1: " + Student.moneyGroup + 'k');


        System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
        Student.moneyGroup -= 50;         System.out.println("So tien buoc 2: " + Student.moneyGroup + 'k');

        System.out.println("Student thứ 2 lấy 20k đi mua bánh mì");
        Student.moneyGroup -= 20;         System.out.println("So tien buoc 3: " + Student.moneyGroup + 'k');

        System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm");
        Student.moneyGroup -= 150;         System.out.println("So tien buoc 4: " + Student.moneyGroup + 'k');

        System.out.println("cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
        for( int i =0; i < students.length; i ++) {
            Student.moneyGroup += 50;
        }
        System.out.println("So tien buoc 5: " + Student.moneyGroup + 'k');

    }
    public static class Student {
        int id;
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
        String name;
        static String college = "Đại học bách khoa";
        static int moneyGroup;
    }

}
