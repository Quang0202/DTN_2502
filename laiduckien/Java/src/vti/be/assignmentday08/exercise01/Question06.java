package vti.be.assignmentday08.exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static vti.be.assignmentday08.exercise01.Question01.Student.college;

public class Question06 {
    public static  void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);




        while (true) {
            System.out.println("Muon tao Primay(1) Second(2): Exit(3)");
            int choice = sc.nextInt();  int max=7;
            switch (choice) {
            case 1:
                System.out.println("Nhap SL muon tao: ");
                int SL = sc.nextInt();




                for ( int i = 0 ; i < SL ; i++ ) {
                    new PrimaryStudent();

                }
                System.out.println("getPrimaryStudentCount" + " " + getPrimaryStudentCount());
                if( getPrimaryStudentCount() > max) {
                    throw new Exception("Too many students");
                }
                break;
                case 2:
                    System.out.println("Nhap SL muon tao: ");
                    int SL2 = sc.nextInt();
                    for ( int i = 0 ; i < SL2 ; i++ ) {
                        new SecondaryStudent();
                    }
                    System.out.println("getSecondaryStudentCount" + " " + getSecondaryStudentCount());
                    if( getPrimaryStudentCount() + getSecondaryStudentCount() > max) {
                        throw new Exception("Too many students");
                    }
                    break;

                    case 3:
                        return;
            }
        }
    }
    public static class PrimaryStudent {
        static int PrimaryStudentCount = 0;
        int id;
        public PrimaryStudent() {
            this.id = InfoID("Nhap ID");
            this.name = InfoName("Nhap Name");
            PrimaryStudentCount++;
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
    public static class SecondaryStudent {
        static int SecondaryStudentCount = 0;
        int id;
        public SecondaryStudent() {
            this.id = InfoID("Nhap ID");
            this.name = InfoName("Nhap Name");
            SecondaryStudentCount++;
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
    public static int getPrimaryStudentCount() {
        return PrimaryStudent.PrimaryStudentCount;
    }
    public static int getSecondaryStudentCount() {
        return SecondaryStudent.SecondaryStudentCount;
    }



    public static int  InfoID(String Message) {
        Scanner sc = new Scanner(System.in);         System.out.println(Message);

        int id = sc.nextInt(); return id;
    }
    public static String  InfoName(String Message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Message);
        String name = sc.nextLine(); return name;
    }


}
