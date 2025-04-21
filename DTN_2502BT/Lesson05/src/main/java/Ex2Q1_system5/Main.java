package Ex2Q1_system5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i <10; i++) {
            System.out.println("vui long nhap hoc sinh" + (i+1) + ":");
           String hocSnh = scanner.nextLine();
            int group = (i % 3) + 1;
            Student student = new Student(i + 1, hocSnh, group);
            list.add(student);
        }
        System.out.println("Danh sach hoc Sinh");
        for (int g = 1; g <4; g++) {
            System.out.println("\nNhóm " + g + ":");
            for(Student student : list) {
                if (student.getGroup() == g) {
                    System.out.println(student);
                }
            }

        }
        scanner.close();

        for (Student student : list) {
            System.out.println("-------------------");
            student.diemDanh();
        }
        for (Student student : list) {
            if (student.getGroup() == 1) {
                System.out.println("-------------------");
                student.hocBai();
            }
        }
        for (Student student : list) {
            if (student.getGroup() == 2) {
                System.out.println("-------------------");
                student.Clear();
            }
        }



    }



}
