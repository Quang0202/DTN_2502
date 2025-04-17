package vti.be.assignmentday08.exercise01;

import java.util.ArrayList;
import java.util.List;

import static vti.be.assignmentday08.exercise01.Question01.Student.college;

public class Question05 {
    public static  void main(String[] args) {
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");

        System.out.println(getStudentCount());
    }
    public static class Student {
        static int studentCount = 0;
        int id;
        public Student(int id, String name) {
            this.id = id;
            this.name = name; studentCount++;
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
    public static int getStudentCount() {
        return Student.studentCount;
    }


}
