package MaiTienThanh.src.com.vti.backend.Lesson4;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Exercise4 {
    public void question1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int studentID = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter hometown: ");
        String hometown = scanner.nextLine();
        Student student = new Student(studentName, studentID, hometown);
        System.out.println("Student's information: " + student);
        System.out.print("Enter grade: ");
        float plusgrade = Float.parseFloat(scanner.nextLine());
        student.addGrade(plusgrade);
        System.out.println("After adding grade: " + student);
    }
}
