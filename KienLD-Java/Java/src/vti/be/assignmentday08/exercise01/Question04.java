package vti.be.assignmentday08.exercise01;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Question01 q = new Question01();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin can thay doi: ");


        String nhap = sc.nextLine();
        q.ChangeCollege(nhap);
        q.PrintCollege();
    }

}
