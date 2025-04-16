package backend;

import entity.MyMath;
import entity.Student2;

public class Exercise2 {
    public void question1(){
        System.out.println("Sum: " + MyMath.sum(10));
    }

    public void question2() {
        Student2 student = new Student2(1, "Tuấn Khỉ ( Nai Xừ )");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
    }

    public void question3() {
        Student2 student = new Student2(1, "Student Nai Xừ");
        student.setName("Jane Doe");
        System.out.println("Updated Name: " + student.getName());
    }
}
