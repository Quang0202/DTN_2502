package com.programming.nhatanh.lesson3;

import com.programming.nhatanh.entity.Account;
import com.programming.nhatanh.entity.Department;
import com.programming.nhatanh.entity.Group;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Homework4 {
    public static void exercise1question1() {
        float salary1 = 5240.5f;
        float salary2 = 10970.055f;
        int intSalary1 = (int) salary1;
        int intSalary2 = (int) salary2;
        System.out.printf("Lương của account 1 là: %d", intSalary1);
        System.out.println();
        System.out.printf("Lương của account 2 là: %d", intSalary2);
    }

    public static void exercise1question2() {
        // Nhập department
        Random random = new Random();
        int randomInt = random.nextInt(0, 99999);
        String number = String.valueOf(randomInt);
        switch (number.length()) {
            case 1:
                System.out.println("0000" + number);
                break;
            case 2:
                System.out.println("000" + number);
                break;
            case 3:
                System.out.println("00" + number);
                break;
            case 4:
                System.out.println("0" + number);
                break;
            case 5:
                System.out.println(number);
                break;
        }
    }

    public static void exercise1question3() {
        Random random = new Random();
        int randomInt = random.nextInt(0, 99999);
        String number = String.valueOf(randomInt);
        switch (number.length()) {
            case 1:
                number = ("0000" + number);
                break;
            case 2:
                number = ("000" + number);
                break;
            case 3:
                number = ("00" + number);
                break;
            case 4:
                number = ("0" + number);
                break;
            case 5:
                break;
        }
        System.out.println(number.substring(number.length() - 2));

    }

    public static void exercise1question4(int a, int b) {
        System.out.println((float) a / b);
    }

    public static void exercise2question1() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].email = "Email " + (i + 1);
            accounts[i].userName = "User name " + (i + 1);
            accounts[i].fullName = "Full nam " + (i + 1);
            accounts[i].createDate = LocalDateTime.now();
            System.out.println(accounts[i].AccountInfo());
        }
    }

    public static void exercise3question1() {
        int salary = 5000;
        System.out.printf("%.2f", (float) salary);
    }

    public static void exercise3question2() {
        String number = "1234567";
        System.out.println(Integer.parseInt(number));
    }

    public static void exercise3question3() {
        Integer number = 1234567;
        int numberint = number;

        System.out.println(numberint);
    }

    public static void exercise4question1(String input) {
        System.out.println(input.length());
    }

    public static void exercise4question2(String s1, String s2) {
        System.out.println(s1 + s2);
    }

    public static void exercise4question3(String s1, String s2) {
        System.out.println(s1 + s2);
    }

    public static void exercise4question4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: \n");
        String input = scanner.next();
        if (input != null && isUpperCase(input.charAt(0))) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input);
        }
        scanner.close();

    }

    public static void exercise4question5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: \n");
        String input = scanner.next();
        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                System.out.printf("Ký tự thứ %d là: %s \n", i + 1, input.toUpperCase().charAt(i));
            }
        }
        scanner.close();

    }

    public static void exercise4question6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: \n");
        String input = scanner.nextLine();
        if (input != null) {
            String regex = " ";
            String[] myArray = input.split(regex);
            System.out.printf("Họ là: %s \n", myArray[0]);
            System.out.printf("Tên đệm  là: %s \n", myArray[1]);
            System.out.printf("Tên là: %s \n", myArray[2]);
        }
        scanner.close();
    }

    public static void exercise4question7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: \n");
        String input = scanner.nextLine();
        if (input != null) {
            input = input.trim();
            String regex = " ";
            String[] myArray = input.split(regex);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < myArray.length; i++) {
                String cap = myArray[i].substring(0, 1).toUpperCase() + myArray[i].substring(1) + " ";
                result.append(cap);

            }
            System.out.println(result);
        }
        scanner.close();
    }

    public static void exercise4question8(Group[] departments) {
        for (Group i : departments) {
            if (i.groupName.toLowerCase().contains("Java".toLowerCase())) {
                System.out.println(i);
            }
        }
    }

    public static void exercise4question9(Group[] departments) {
        for (Group i : departments) {
            if (Objects.equals(i.groupName, "Java")) {
                System.out.println(i);
            }
        }
    }

    public static void exercise4question10(String s1, String s2) {
        int count = 0;
        s1 = s1.toLowerCase();

        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }

        System.out.println(Objects.equals(rev, s2.toLowerCase()));
    }

    public static void exercise4question11(String stringInput) {
        int count = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            String check = String.valueOf(stringInput.charAt(i));
            System.out.println(check);
            if (check.equals("a")) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public static void exercise4question12(String s1) {
        int count = 0;
        s1 = s1.toLowerCase();

        // Reverse the string
        StringBuilder rev = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev.append(s1.charAt(i));
        }
        System.out.println(rev);
    }

    public static void exercise4question13(String[] s1) {
        boolean containDigit = false;
        for (String str : s1) {
            for (char c : str.toCharArray()) {  // Iterate over each character in the string
                if (Character.isDigit(c)) {  // Check if the character is a digit
                    containDigit = true;
                    break;  // No need to check further in this string
                }
            }
            if (containDigit) break;  // Stop searching if we found a digit
        }
        System.out.println(containDigit);
    }

    public static void exercise4question14(String s1, char s2, char s3) {
        System.out.println(s1.replace(s2, s3));
    }

    public static void exercise4question15(String s1) {
        System.out.println("Input string: \n");
        if (s1 != null) {
            s1 = s1.trim();
            String regex = " ";
            String[] myArray = s1.split(regex);
            StringBuilder result = new StringBuilder();
            for (int i = myArray.length - 1; i >= 0; i--) {
                String cap = myArray[i] + " ";
                result.append(cap);

            }
            System.out.println(result);
        }

    }

    public static String exercise4question16(String s1, int n1) {
        String regex = String.format("(?<=\\G.{%d})", n1);
        s1 = s1.replaceAll("\\s+", "");
        var splitArray = (s1.split(regex));
        for (String string : splitArray) {
            if (string.length() != n1) {
                return "KO";
            }
        }
        return Arrays.toString(splitArray);

    }

    public static void exercise5question1(Department[] s1) {
        System.out.println(s1[0]);
    }

    public static void exercise5question2(Department[] s1) {
        for(Department i : s1){
            System.out.println(i);
        }
    }

    public static void exercise5question3(Department[] s1) {
        System.out.println(s1[0].departmentName);
    }

    public static void exercise5question4(Department[] s1) {
        System.out.println(Objects.equals(s1[0].departmentName, "Phòng A"));
    }

    public static void exercise5question5(Department d1, Department d2) {
        System.out.println(d1.equals(d2));
    }

    public static void exercise5question6() {
//        Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo
//        thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//        VD:
//        Accounting
//        Boss of director
//                Marketing
//        Sale
//        Waiting room
        Department[] departments = new Department[5];
        String[] departmentNames = { "Boss of director", "Waiting room","Sale", "Accounting", "Marketing", };
        Arrays.sort(departmentNames);
        for (int i = 0; i < departments.length; i++){
            departments[i] = new Department();
            departments[i].departmentId = i;
            departments[i].departmentName = departmentNames[i];
            System.out.println(departments[i]);
        }
    }

    public static void exercise5question7() {
//        Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra dan sách phòng ban được sắp
//        xếp theo tên
//        VD:
//        Accounting
//        Boss of director
//                Marketing
//        waiting room
//        Sale
        Account[] accounts = new Account[5];
        String[] departmentNames = { "Boss of director", "Waiting room","Sale", "Accounting", "Marketing", };
        Arrays.sort(departmentNames);
        for (int i = 0; i < accounts.length; i++){
            accounts[i] = new Account();
            Department department = new Department();
            department.departmentId = i;
            department.departmentName = departmentNames[i];
            accounts[i].department = department;
            System.out.println(accounts[i]);
        }
    }

    public static void main(String[] args) throws ParseException {
        exercise5question7();
    }
}
