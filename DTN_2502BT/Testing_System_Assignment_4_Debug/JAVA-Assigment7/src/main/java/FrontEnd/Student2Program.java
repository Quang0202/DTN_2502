package FrontEnd;

import BackEnd.PrimaryStudent2;
import BackEnd.Student;
import BackEnd.StudentQ2;

public class Student2Program {
    public static void main(String[] args) {
        StudentQ2 studentQ2 = new StudentQ2();
        studentQ2.study();

        StudentQ2 primaryStudent2 = new PrimaryStudent2();
        primaryStudent2.study();
    }
}
