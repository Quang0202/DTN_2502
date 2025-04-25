package vti.be.assignmentday07.exercise02;

import java.util.Scanner;

public class Utils {
    public static int  input_departmentid(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }
    public static String input_departmentname(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }

    public static int  input_position_id(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    public static String input_positionname(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
//    // Accounts
    public static int input_account_id(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }
//
    public static String input_account_name(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
    public static String input_department(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
//
    public static String input_position(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }

    public static int input_account_age(String message) throws InvalidAgeInputingException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                int age = Integer.parseInt(sc.nextLine());

                if (age <= 18) {
                    throw new InvalidAgeInputingException("Your age must be greater than 18!");
                }

                return age;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid integer.");
            } catch (InvalidAgeInputingException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    // Group

    public static int input_grid(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }
    public static String input_grname(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }

    public static String input_creator(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
    public static Question09_Accounts input_accounts(String message) throws InvalidAgeInputingException {
        System.out.println("Ban Co Muon Tao Them Accounts Khong? 1. Yes 2.No ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            Question09_Accounts acc1 = new Question09_Accounts();
            return acc1;
        }
        else if (choice == 2) {
            System.out.println("Doing Create Group");
        }
        return null;
    }




}
