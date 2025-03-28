package com.testingsystem_assignment_2;

import com.testingsystem_assignment_1.*;

import java.util.Date;
import java.util.Scanner;

public class Exercise5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Department department = new Department();

//        question5();
//        question6(department);
//        question7();
        question8();
    }

    //Question 5:
    //Viết lệnh cho phép người dùng tạo account (viết thành method)
    //Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
    //chương trình sẽ chuyển thành Position.Dev, Position.Test,
    //Position.ScrumMaster, Position.PM
    public static void question5() {
        System.out.println("Question 5");
        Account account = new Account();

        System.out.print("Enter Account ID: ");
        account.accountId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Username: ");
        account.username = sc.nextLine();

        System.out.print("Enter email: ");
        account.email = sc.nextLine();

        System.out.print("Enter full name: ");
        account.fullName = sc.nextLine();

        System.out.print("Enter Gender (Male/Female/Unknown): ");
        account.gender = Gender.valueOf(sc.nextLine());

        System.out.print("Enter Department Name: ");
        String departmentName = sc.nextLine();
        account.department = new Department(1, departmentName);

        // Choose position
        System.out.println("Select Position (Enter a number):");
        System.out.println("1. Dev");
        System.out.println("2. Test");
        System.out.println("3. ScrumMaster");
        System.out.println("4. PM");

        int positionChoice;
        while (true) {
            System.out.print("Your choice: ");
            positionChoice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (positionChoice == 1) {
                account.position = new Position(1, "Developer");
            } else if (positionChoice == 2) {
                account.position = new Position(2, "Tester");
            } else if (positionChoice == 3) {
                account.position = new Position(3, "Scrum Master");
            } else if (positionChoice == 4) {
                account.position = new Position(4, "Project Manager");
            } else {
                System.out.println("Invalid choice! Please enter a number from 1 to 4.");
                continue;
            }
            break;
        }

        account.createDate = new Date();

        System.out.println("\nAccount Created Successfully:");
        System.out.println(account);

    }

    //Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)
    public static void question6(Department department) {
        System.out.println("Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)");
        System.out.println("Enter DepartmentId: ");
        department.departmentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter DepartmentName: ");
        department.departmentName = sc.nextLine();

        System.out.println(department);
    }

    //Question 7: Nhập số chẵn từ console
    public static void question7() {
        System.out.println("Question 7: Nhập số chẵn từ console");
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter an even number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                break;
            } else {
                System.out.println("Invalid input! Please enter an even number.");
            }
        }

        System.out.println("You entered a valid even number: " + number);
    }

    //Question 8:
    //Viết chương trình thực hiện theo flow sau:
    //Bước 1:
    //Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
    //Bước 2: Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
    //Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo ndepartment
    //Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại" và quay trở lại bước 1
    public static void question8() {
        System.out.println("Question8");
        while (true){
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
            System.out.println("1. Create Account");
            System.out.println("2. Create Department");
            int number = sc.nextInt();
            sc.nextLine();


            switch (number){
                case 1:
                    question5();
                    break;
                case 2:
                    Department department = new Department();
                    question6(department);
                    break;
                default:
                    System.out.println("Mời bạn nhập lại và quay trở lại ");
                    continue;
            }
                break;
        }
    }
    //Question 9:
    //Viết method cho phép người dùng thêm group vào account theo flow sau:
    //Bước 1: In ra tên các usernames của user cho người dùng xem
    //Bước 2: Yêu cầu người dùng nhập vào username của account
    //Bước 3: In ra tên các group cho người dùng xem
    //Bước 4: Yêu cầu người dùng nhập vào tên của group
    //Bước 5: Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó .

    public static void question9(){

    }
}
