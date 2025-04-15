package Exercise2.entity;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Account {
    ScannerUtils scannerUtils = new ScannerUtils();
    private int id;
    private int age;
    private String username;
    private String email;
    private String fullname;
    private Department department;
    private Position position;
    private ArrayList<Group> groups;

    public Account() {
        id = scannerUtils.inputInt("Vui long nhap lai");
        age = inputAccountAge();
        username = scannerUtils.inputString();
    }

    @Override
    public String toString() {
        return "Account{" +
                "position=" + position +
                ", department=" + department +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public int inputAge() throws InvalidAgeInputingException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                try {
                    int x = Integer.parseInt(scanner.nextLine());
                    if (x <= 0)
                        throw new InvalidAgeInputingException("The age must be greater than 0");
                    else if (x <18){
                        System.out.println("Your age must be greater than 18");
                    } else {
                        return x;
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Vui long nhap 1 so nguyen.");
                }
            }
        }
    }

    public int inputAccountAge() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            if (scanner.hasNextLine()) {
//                try {
//                    int x = Integer.parseInt(scanner.nextLine());
//                    if (x <= 0)
//                        throw new InvalidAgeInputingException("The age must be greater than 0");
//                    else if (x < 18) {
//                        System.out.println("Your age must be greater than 18");
//                    }
//                    return x;
//                }
//                catch (NumberFormatException e) {
//                    System.out.println("Vui long nhap 1 so nguyen.");
//                }
//                catch (InvalidAgeInputingException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
        int age = 0;
        try {
           age = inputAge();
        } catch (InvalidAgeInputingException e) {
            System.out.println(e.getMessage());
        }
        return age;
    }
}
