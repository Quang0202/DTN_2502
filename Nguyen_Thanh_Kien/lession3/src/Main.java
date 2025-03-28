import model.Account;
import model.Group;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        group.setGroupId(1);
        group.setGroupName("Golang Java");
        group.setCreateDate(LocalDate.parse("2022-01-12"));

        Group group1 = new Group();
        group1.setGroupId(2);
        group1.setGroupName("Java");
        group1.setCreateDate(LocalDate.parse("2023-01-12"));

        Group group2 = new Group();
        group2.setGroupId(3);
        group2.setGroupName("TestJavaGolang");
        group2.setCreateDate(LocalDate.parse("2024-11-12"));

        Group[] groups = {group, group1, group2};

//        question1();
//        question2();
//        question3();
//        question4();
//        exe2Question1();
//        exe3Question1();
//        exe3Question2();
//        exe3Question3();
//        exe4Question1();
//        exe4Question2();
//        exe4Question3();
//        exe4Question4();
//        exe4Question5();
//        exe4Question6();
//        exe4Question7();
//        exe4Question8(groups);
//        exe4Question9(groups);
//        exe4Question10();
//        exe4Question11();
//        exe4Question12();
//        exe4Question13();
//        exe4Question14();
        exe4Question15();
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
            if (temp[i].isEmpty()) {
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

    public static void exe4Question8(Group[] groups) {
        for (Group group : groups) {
            if (group.getGroupName().contains("Java")) {
                System.out.println(group);
            }
        }
    }

    public static void exe4Question9(Group[] groups) {
        for (Group group : groups) {
            if (group.getGroupName().equals("Java")) {
                System.out.println(group);
            }
        }
    }

    public static void exe4Question10() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi 1: ");
        String chuoi1 = myObj.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String chuoi2 = myObj.next();
        boolean check = false;
        if (chuoi1.isEmpty() || chuoi1.length() != chuoi2.length()) {
            System.out.println("KO");
        } else {
            for (int i = 0; i < chuoi1.length(); i++) {
                if (chuoi1.charAt(i) != chuoi2.charAt(chuoi1.length() - i - 1)) {
                    check = false;
                    System.out.println("KO");
                    break;
                }
                check = true;
            }
        }
        if (check) {
            System.out.println("OK");
        }
    }

    public static void exe4Question11() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void exe4Question12() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        String temp = "";
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            temp += chuoi.charAt(i);
        }
        System.out.println(temp);
    }

    public static void exe4Question13() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        boolean check = false;
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isDigit(chuoi.charAt(i))) {
                check = false;
                break;
            }
            check = true;
        }
        System.out.println(check);
    }

    public static void exe4Question14() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        System.out.println("Nhap ky tu chi dinh: ");
        String kyTuChiDinh = myObj.nextLine();
        System.out.println("Nhap ky tu muon chuyen: ");
        String kyTuMuonChuyen = myObj.nextLine();
        String temp = "";
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTuChiDinh.charAt(0)) {
                temp += kyTuMuonChuyen;
            } else {
                temp += chuoi.charAt(i);
            }
        }
        System.out.println(temp);
    }

    public static void exe4Question15(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String val1 = myObj.nextLine().trim();
        String[] temp = val1.split(" ");
        String name = "";
        for (int i =  temp.length-1; i >= 0; i--) {
            if (temp[i].isEmpty()) {
                continue;
            }
            name += temp[i];
            if (i == 0) {
                break;
            }
            name += " ";
        }
        System.out.println(name);
    }
}