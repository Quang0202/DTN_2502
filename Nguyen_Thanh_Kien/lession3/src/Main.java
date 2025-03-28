import model.Account;

import java.time.LocalDate;
import java.util.Arrays;
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
//        exe4Question1();
//        exe4Question2();
//        exe4Question3();
//        exe4Question4();
//        exe4Question5();
//        exe4Question6();
        exe4Question7();
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
        System.out.println((float) a / b);
    }

    public static void exe2Question1() {
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

    public static void exe3Question1() {
        int salary = 5000;
        System.out.printf("%.2f\n", (float) salary);
    }

    public static void exe3Question2() {
        String value = "1234567";
        System.out.println(Integer.parseInt(value));
    }

    public static void exe3Question3() {
        Integer value = Integer.valueOf("1234567");
        System.out.println((int) value);
    }

    public static void exe4Question1() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap xau ky tu: ");
        String val = myObj.nextLine();
        System.out.println(val.length());
    }

    public static void exe4Question2() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap xau ky tu 1: ");
        String val1 = myObj.nextLine();
        System.out.println("Nhap xau ky tu 2: ");
        String val2 = myObj.nextLine();
        System.out.println(val1.concat(val2));
    }

    public static void exe4Question3() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String val1 = myObj.nextLine();
        System.out.println(String.valueOf(val1.charAt(0)).toUpperCase() + val1.substring(1));
    }

    public static void exe4Question4() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String val1 = myObj.nextLine();
        for (int i = 0; i < val1.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + String.valueOf(val1.charAt(i)).toUpperCase());
        }
    }

    public static void exe4Question5() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho: ");
        String val1 = myObj.nextLine();
        System.out.println("Nhap ten: ");
        String val2 = myObj.nextLine();
        System.out.println(val1 + " " + val2);
    }

    public static void exe4Question6() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String val1 = myObj.nextLine();
        String[] temp = val1.split(" ");
        System.out.println("Ho la: " + temp[0]);
        String tempName = "";
        for (int i = 0; i < temp.length - 1; i++) {
            if (i != 0) {
                tempName += temp[i];
            }
        }
        System.out.println("Ten dem la: " + tempName);
        System.out.println("Ten la: " + temp[temp.length - 1]);
    }

    public static void exe4Question7() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String val1 = myObj.nextLine().trim();
        String[] temp = val1.split(" ");
        String name = "";
        for (int i = 0; i < temp.length; i++) {
            if(temp[i].isEmpty()){
                continue;
            }
            name += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
            if (i == temp.length - 1) {
                break;
            }
            name += " ";
        }
        System.out.println(name);
    }
}