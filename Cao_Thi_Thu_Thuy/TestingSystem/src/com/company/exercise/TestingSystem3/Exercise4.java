package com.company.exercise.TestingSystem3;

import com.company.model.Group;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        q16();
    }
    private static void q1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần đếm từ: ");
        String str = scanner.nextLine();
        str = str.trim();
        while (str.contains("  ")){
            str = str.replace("  ", " ");
        }
        String[] strs = str.split(" ");
        int count = strs.length;
        System.out.println("Số từ của chuỗi là: " + count);
        scanner.close();
    }
    private static void q2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi 2: ");
        String str2 = scanner.nextLine();
        System.out.println("Kết quả: " + str1 + str2);
        scanner.close();
    }
    private static void q3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String str = scanner.nextLine();
        str = str.trim();
        while (str.contains("  ")){
            str = str.replace("  ", " ");
        }
        for(int i = 0; i < str.length(); i++){
            if(i == 0 || (str.charAt(i - 1) == ' ')){
                str = str.substring(0, i) +
                        Character.toUpperCase(str.charAt(i)) +
                        str.substring(i + 1);
            }
        }
        System.out.println("Kết quả: " + str);
        scanner.close();
    }
    private static void q4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String str = scanner.nextLine();
        str = str.trim();
        while (str.contains("  ")){
            str = str.replace("  ", " ");
        }
        for (int i = 0; i < str.length(); i++){
            System.out.printf("Ký tự thứ %d là %c", i, str.charAt(i));
            System.out.println();
        }
        scanner.close();
    }
    private static void q5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String str2 = scanner.nextLine();
        System.out.println("Họ và tên: " + str1 + " " + str2);
        scanner.close();
    }
    private static void q6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên đầy đủ: ");
        String hoTen = scanner.nextLine();
        hoTen = hoTen.trim();
        while (hoTen.contains("  ")){
            hoTen = hoTen.replace("  ", " ");
        }
        String[] hoTens = hoTen.split(" ");
        String tenDem = "";
        for (int i = 1; i < hoTens.length - 1; i++){
            tenDem += hoTens[i] + " ";
        }
        tenDem = tenDem.trim();
        System.out.println("Họ là: " + hoTens[0]);
        System.out.println("Tên đệm là: " + tenDem);
        System.out.println("Tên là: " + hoTens[hoTens.length - 1]);
    }
    private static void q7(){
        // Tương tự bài 3.
    }
    private static void q8(){
        String[] groups = {"Java", "Backend Java", "Python", "SQL", "Frontend Java", "Java"};
        for(String s: groups){
            if (s.contains("Java")){
                System.out.println(s);
            }
        }
    }
    private static void q9(){
        String[] groups = {"Java", "Backend Java", "Python", "SQL", "Frontend Java", "Java"};
        for(String s: groups){
            if (s.equals("Java")){
                System.out.println(s);
            }
        }
    }
    private static void q10(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi 2: ");
        String str2 = scanner.nextLine();
        str2 = new StringBuilder(str2).reverse().toString();
        if(str1.equals(str2)){
            System.out.println("Hai chuỗi là chuỗi đảo ngược của nhau.");
        } else {
            System.out.println("Hai chuỗi không phải chuỗi đảo ngược của nhau.");
        }
        scanner.close();
    }
    private static void q11(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Ký tự a xuất hiện " + count + " lần");
        scanner.close();
    }
    private static void q12(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        String reversed = "";
        for(int i = 0; i < str.length(); i++){
            reversed = str.charAt(i) + reversed;
        }
        System.out.println("Đảo ngược: " + reversed);
        scanner.close();
    }
    private static void q13(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        if(str.matches(".*[0-9].*")){
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        scanner.close();
    }
    private static void q14(){
        String str = "VTI Academy";
        str = str.replace("e", "*");
        System.out.println("Kết quả: " + str);
    }
    private static void q15(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        str = str.trim();
        while (str.contains("  ")){
            str = str.replace("  ", " ");
        }
        String reversed = "";
        String[] strs = str.split(" ");
        for (String s:strs) {
            reversed = s + " " + reversed;
        }
        reversed = reversed.trim();
        System.out.println(reversed);
        scanner.close();
    }
    private static void q16(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        if (str.length() % n != 0) {
            System.out.println("KO");
        } else {
            for (int i = 0; i < str.length(); i += n) {
                System.out.println(str.substring(i, i + n));
            }
        }
        scanner.close();
    }
}
