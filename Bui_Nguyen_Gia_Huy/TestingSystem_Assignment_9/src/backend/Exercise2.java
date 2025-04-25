package backend;

import entity.Student;

import java.util.Date;

@SuppressWarnings("deprecation")
public class Exercise2 {
    public void question1() {
        // Deprecated Date constructor
        Date date = new Date(120, 4, 18); // Deprecated
        System.out.println("Date without warning: " + date);
    }

    public void question2() {
        Student student = new Student("Nguyễn Văn A");
        System.out.println("Student Name: " + student.getName());

        // Using deprecated method
        System.out.println("Student ID (old): " + student.getId());

        // Using new method
        System.out.println("Student ID (new): " + student.getIdWithPrefix());
    }
}
