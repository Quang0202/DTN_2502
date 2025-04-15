package com.company.backend.TestingSystem6;

import com.company.entity.Account;
import com.company.entity.Department;
import com.company.entity.Group;
import com.company.entity.TestingSystem6.ScannerUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    private Department[] departments = new Department[3];
    public float divide(int a, int b){
        return a / b;
    }
    public void q1(){
        try {
            float res = divide(7, 0);
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println("Cannot divide 0");
        }
        finally {
            System.out.println("divide completed!");
        }
    }
    public void q3(){
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public void q4(){
        departments[0] = new Department(1, "a");
        departments[1] = new Department(2, "b");
        departments[2] = new Department(3, "c");
        try {
            getIndex(1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot find department.");
        }
    }
    private void getIndex(int index){
        System.out.println(departments[index].toString());
    }
    public void q6(){
        System.out.println(inputAge());
    }
    private int inputAge(){
        Scanner scanner = new Scanner(System.in);
        int age = -1;

        while (true) {
            System.out.print("Please enter your age: ");
            try {
                age = scanner.nextInt();

                if (age <= 0) {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                } else {
                    return age;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong inputing! Please input an age as int, input again.");
                scanner.nextLine();
            }
        }
    }
    public void q7(){
        ScannerUtils scannerUtils = new ScannerUtils();
        System.out.println(scannerUtils.inputInt("Please input integer"));
    }
    public void q8(){
        ScannerUtils scannerUtils = new ScannerUtils();
        System.out.println(scannerUtils.inputFloat("Please input a float number"));
    }
    public void q9(){
        Department department = new Department();
        System.out.println(department);
    }
    public void q10(){
        Group group = new Group();
        System.out.println(group);
    }
    public void q11() throws InvalidAgeInputingException {
        Account account = new Account();
        System.out.println("Age set to: " + account.inputAge());
    }
    public void q12(){
        Account account = new Account();
        System.out.println("Age set to: " + account.inputAccountAge());
        int[] ints = new int[0];
        System.out.println(ints.length);
    }
}
