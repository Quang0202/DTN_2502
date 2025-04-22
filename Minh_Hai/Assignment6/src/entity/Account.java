package entity;

import backend.ScannerUtils;

import java.util.Scanner;

public class Account {
    private int id;
    private String name;
    private static Scanner scanner = new Scanner(System.in);

    public static int inputAge() throws InvalidAgeInputingException {
        while (true) {
            try {
                System.out.print("Nhập tuổi: ");
                int age = Integer.parseInt(scanner.nextLine());

                if (age <= 0) {
                    throw new InvalidAgeInputingException("The age must be greater than 0");
                }

                return age;
            } catch (NumberFormatException e) {
                System.out.println("Wrong inputing! Please input an age as int, input again.");
            }
        }
    }

    public int inputAccountAge() {
        while (true) {
            try {
                int age = inputAge();
                if (age < 18) {
                    System.out.println("Your age must be greater than 18");
                    continue;
                }
                return age;
            } catch (InvalidAgeInputingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Account() {
        System.out.println("Khởi tạo Account:");
        System.out.println("Nhap id Account: ");
        id = ScannerUtils.inputInt("ID phải là số nguyên. Nhập lại:");
        System.out.println("Nhap name Account: ");
        name = ScannerUtils.inputString("Tên không được để trống. Nhập lại:");
    }

    public String toString() {
        return "Account: ID=" + id + ", Name=" + name;
    }
}
