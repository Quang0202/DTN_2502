package Question03;

import java.util.Scanner;

public class Refund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RealHighSchoolStudent student = new RealHighSchoolStudent(1,"tai","CNTT","DH mo dia chat");
        student.study();
        System.out.println(student);
    }
}
