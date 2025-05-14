package frontend;

import model2_2.Person;
import model2_2.Student;

public class Program2 {
    public static void main(String[] args) {
        Person student = new Student();
//        student.inputInfo();
//        student.showInfo();
        Student s = (Student) student;
        System.out.println(s.scholarship());
    }
}
