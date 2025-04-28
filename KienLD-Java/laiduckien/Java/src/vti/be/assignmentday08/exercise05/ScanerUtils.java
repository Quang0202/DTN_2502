package vti.be.assignmentday08.exercise05;

import java.util.Scanner;

public class ScanerUtils {

    public static int input_studentid(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        int id = sc.nextInt();
        return id;
    }
    public static String input_studentname(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String name = sc.nextLine();
        return name;
    }


}
