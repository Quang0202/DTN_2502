import model.*;
import utils.HinhHocException;
import utils.MyMath;
import utils.StudentException;

import java.util.ArrayList;

public class Main {
    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) throws HinhHocException, StudentException {
//        Student student = new Student(1, "Nguyen Van A");
//        students.add(student);
//        student = new Student(2, "Nguyen Van B");
//        students.add(student);
//        student = new Student(3, "Nguyen Van C");
//        students.add(student);
//        question1();

//       code question 2

//        Student.moneyGroup += 100 * students.size();
//        System.out.println(Student.moneyGroup);
//        Student.moneyGroup -= 50;
//        System.out.println(Student.moneyGroup);
//        Student.moneyGroup -= 20;
//        System.out.println(Student.moneyGroup);
//        Student.moneyGroup -= 150;
//        System.out.println(Student.moneyGroup);
//        Student.moneyGroup += 50 * students.size();
//        System.out.println(Student.moneyGroup);

//        code question 3


//        System.out.println(MyMath.max(6,1));
//        System.out.println(MyMath.max(6.1,6.2));
//        System.out.println(MyMath.min(-6,1));
//        System.out.println(MyMath.sum(2,4));
//        System.out.println(MyMath.sum(2,4.2));
//        System.out.println(MyMath.sum(2.2,4.2));

//        code question 6

//        Student student = new PrimaryStudent(1, "Nguyen Van A");
//        student = new PrimaryStudent(2, "Nguyen Van B");
//        student = new SecondaryStudent(3, "Nguyen Van C");
//        student = new SecondaryStudent(4, "Nguyen Van D");
//        student = new SecondaryStudent(5, "Nguyen Van E");
//        student = new SecondaryStudent(6, "Nguyen Van F");
//
//        System.out.println("Student count: " + Student.getCounter());
//        System.out.println("Student Primary count: " + PrimaryStudent.getCounter());
//        System.out.println("Student Secondary count: " + SecondaryStudent.getCounter());

//        code question 7

//        student = new SecondaryStudent(7, "Nguyen Van G");
//        student = new SecondaryStudent(8, "Nguyen Van H");

//        code question 8

//        Circle circle = new Circle(1);
//        circle = new Circle(2);
//        circle = new Circle(3);
//
//        Rectangle rectangle = new Rectangle(4, 4);
//        rectangle = new Rectangle(5, 5);
//        rectangle = new Rectangle(6, 6);

    }

    private static void question1() {
        Student.college = "Đại học bách khoa";
        students.forEach(e -> {
            System.out.println(e.toString());
        });
        Student.college = "Đại học công nghệ";
        students.forEach(e -> {
            System.out.println(e.toString());
        });
    }
}