package vti.be.assignmentday08.exercise01;

import java.util.ArrayList;
import java.util.List;

import static vti.be.assignmentday08.exercise01.Question01.Student.college;

public class Question01 {
    public static  void main(String[] args) {
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");

        Student[] students = { student1, student2 , student3 };
        int j = students.length;
        for( int i =0; i < j; i ++) {
            System.out.println(students[i] + " " + college);
        }
        Student.college = "Đại học công nghệ";

        System.out.println("#######################");

        for( int i =0; i < j; i ++) {
            System.out.println(students[i] + " " + college);
        }
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
    }

    public static void ChangeCollege(String college_change) {
        Student.college = college_change;
    }


    public static void PrintCollege() {
        System.out.println(Student.college);
    }

}
