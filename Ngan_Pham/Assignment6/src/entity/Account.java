package entity;

import backend.ScannerUtils;

import java.util.Scanner;

public class Account {
    private int id;
    private int age;
    private String userName;
    private String fullName;
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

    public void inputAccountAge() {
        while (true) {
            try {
                System.out.print("Nhập tuổi: ");
                int input = ScannerUtils.inputInt("Tuổi phải là số nguyên.");

                if (input <= 0) {
                    throw new InvalidAgeInputingException("The age must be greater than 0");
                } else if (input < 18) {
                    System.out.println("Your age must be greater than 18");
                } else {
                    this.age = input;
                    break;
                }

            } catch (InvalidAgeInputingException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }

    public Account() {
        System.out.println("=== Nhập thông tin Account ===");
        this.id = ScannerUtils.inputInt("ID phải là số nguyên. Nhập lại:");
        this.userName = ScannerUtils.inputString("Username không được để trống. Nhập lại:");
        this.fullName = ScannerUtils.inputString("Full name không được để trống. Nhập lại:");
    }

    @Override
    public String toString() {
        return "Account { ID=" + id + ", Username='" + userName + "', FullName='" + fullName + "' }";
    }
}
