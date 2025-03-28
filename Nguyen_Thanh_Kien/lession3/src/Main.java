import model.Account;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
//        question4();
        exe2Question1();
        exe3Question1();
        exe3Question2();
        exe3Question3();
    }

    public static void question1() {
        float salary = 5240.5F;
        float salary2 = 10970.055F;
        System.out.println(Math.round(salary));
        System.out.println(Math.round(salary2));
    }

    public static void question2() {
        Random rand = new Random();
        String temp = String.valueOf(rand.nextInt(99999));
        if (temp.length() < 5) {
            for (int i = 0; i < 5 - temp.length(); i++) {
                temp = "0" + temp;
            }
        }
        System.out.println(temp);
    }

    public static void question3() {
        Random rand = new Random();
        String temp = String.valueOf(rand.nextInt(99999));
        if (temp.length() < 5) {
            for (int i = 0; i < 5 - temp.length(); i++) {
                temp = "0" + temp;
            }
        }
        System.out.println(temp.substring(temp.length() - 2));
    }

    public static void question4() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu 1: ");
        int a = myObj.nextInt();
        System.out.println("Nhap so nguyen thu 2: ");
        int b = myObj.nextInt();
        System.out.println((float) a /b);
    }

    public static void exe2Question1(){
        Account[] accounts = new Account[5];
        for (int i = 0; i < 5; i++) {
            Account account = new Account();
            account.setEmail("Email" + i);
            account.setUserName("User name" + i);
            account.setFullName("Full name" + i);
            account.setCreateDate(LocalDate.now());
            accounts[i] = account;
        }
    }

    public static void exe3Question1(){
        int salary = 5000;
        System.out.printf("%.2f\n", (float) salary);
    }

    public static void exe3Question2(){
        String value = "1234567";
        System.out.println(Integer.parseInt(value));
    }

    public static void exe3Question3(){
        Integer value = Integer.valueOf("1234567");
        System.out.println((int) value);
    }
}