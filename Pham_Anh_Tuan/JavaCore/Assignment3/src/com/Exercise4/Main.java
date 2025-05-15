package com.Exercise4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Count words in a string
//        System.out.println("Enter a string:");
//        String input = scanner.nextLine();
//        question1(input);
//
//        // Concatenate two strings
//        System.out.println("Enter first string:");
//        String s1 = scanner.nextLine();
//        System.out.println("Enter second string:");
//        String s2 = scanner.nextLine();
//        question2(s1, s2);
//
//        // Capitalize first letter if not already
//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
//        question3(name);
//
//        // Print each character in the name
//        System.out.println("Enter a name to print characters:");
//        String userName = scanner.nextLine();
//        question4(userName);
//
//        // Get full name
//        System.out.println("Enter your last name:");
//        String lastName = scanner.nextLine();
//        System.out.println("Enter your first name:");
//        String firstName = scanner.nextLine();
//        question5(lastName, firstName);
//
//        // Split full name
//        System.out.println("Enter your full name:");
//        String fullName = scanner.nextLine();
//        question6(fullName);
//
//        // Normalize full name
//        System.out.println("Enter your full name for normalization:");
//        String unformattedName = scanner.nextLine();
//        question7(unformattedName);

        question8("Java is fun. I love Java programming.");
        question9("Java is a language. Java Java Java!");
        question10("word", "drow");
        question11("banana");
        question12("hello");
        question13("abc");
        question13("123abc");
        question14("VTI Academy", 'e', '*');
        question15(" I am developer ");
        question16("abcdefgh", 2);

        scanner.close();
    }

    public static void question1(String str) {
        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

    public static void question2(String s1, String s2) {
        System.out.println("Concatenated string: " + s1 + s2);
    }

    public static void question3(String name) {
        if (!name.isEmpty() && Character.isLowerCase(name.charAt(0))) {
            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        }
        System.out.println("Formatted name: " + name);
    }

    public static void question4(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Character " + (i + 1) + " is: " + name.charAt(i));
        }
    }
    public static void question5(String lastName, String firstName) {
        System.out.println("Full name: " + lastName + " " + firstName);
    }

    public static void question6(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        if (parts.length >= 2) {
            System.out.println("Last name: " + parts[0]);
            System.out.println("Middle name: " + String.join(" ", Arrays.copyOfRange(parts, 1, parts.length - 1)));
            System.out.println("First name: " + parts[parts.length - 1]);
        } else {
            System.out.println("Invalid full name format.");
        }
    }

    public static void question7(String name) {
        String[] words = name.trim().toLowerCase().split("\\s+");
        StringBuilder normalized = new StringBuilder();
        for (String word : words) {
            normalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println("Normalized name: " + normalized.toString().trim());
    }
    // Question 8: Print all groups containing "Java"
    public static void question8(String text) {
        Pattern pattern = Pattern.compile("(.*?Java.*?)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    // Question 9: Print all exact "Java" groups
    public static void question9(String text) {
        Pattern pattern = Pattern.compile("(Java)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    // Question 10: Check if two strings are reverse of each other
    public static void question10(String str1, String str2) {
        if (str1 != null && str2 != null && str1.equals(new StringBuilder(str2).reverse().toString())) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    // Question 11: Count occurrences of 'a' in a string
    public static void question11(String text) {
        long count = text.chars().filter(ch -> ch == 'a').count();
        System.out.println(count);
    }

    // Question 12: Reverse a string using loop
    public static void question12(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        System.out.println(reversed.toString());
    }

    // Question 13: Check if string contains a digit
    public static void question13(String text) {
        if (text == null || text.matches(".*\\d.*")) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    // Question 14: Replace specified character in a string
    public static void question14(String text, char oldChar, char newChar) {
        System.out.println(text.replace(oldChar, newChar));
    }

    // Question 15: Reverse words in a string without using libraries
    public static void question15(String text) {
        text = text.trim();
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                result.append(words[i]).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }

    // Question 16: Split string into equal parts of n characters
    public static void question16(String text, int n) {
        if (text.length() % n != 0) {
            System.out.println("KO");
            return;
        }
        for (int i = 0; i < text.length(); i += n) {
            System.out.println(text.substring(i, i + n));
        }
    }
}
