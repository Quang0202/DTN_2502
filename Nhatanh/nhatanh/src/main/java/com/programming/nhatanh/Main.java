package com.programming.nhatanh;

import com.programming.nhatanh.entity.Department;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Department createDepartment(){
        // Nhập department
        Scanner scanner = new Scanner(System.in);

        System.out.println("tạo department");
        Department newDepartment = new Department();
        System.out.println("DepartmentId: ");
        newDepartment.departmentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Department name: ");
        newDepartment.departmentName = scanner.nextLine();
        scanner.close();
        return newDepartment;
    }

    public static void main(String[] args) {
        LocalDate resultz = LocalDate.ofEpochDay(0);
        System.out.println(resultz);

        Random random = new Random();
        int randomInt = random.nextInt(10, 100);
        float randomFloat = random.nextFloat(10, 100);
        double randomDouble = random.nextDouble(10, 100);
        System.out.println(random.nextInt(10));

        LocalDate dateTime = LocalDate.of(1992,5,13);
        var numdate = dateTime.toEpochDay();
        System.out.println(numdate);
        LocalDate endDate = LocalDate.of(1995,8,20);
        var numEndDate = endDate.toEpochDay();
        var resultDate = random.nextLong(numdate, numEndDate);
        LocalDate result = LocalDate.ofEpochDay(resultDate);
        System.out.println(result);


        // Q
        LocalDate current = LocalDate.now();
        LocalDate past = LocalDate.of(current.getYear() - 1, current.getMonthValue(), current.getDayOfMonth());
        var answerDate = random.nextLong(current.toEpochDay(), past.toEpochDay());
        System.out.println(LocalDate.ofEpochDay(answerDate));


        Scanner scanner = new Scanner(System.in);

        var intNumber = scanner.nextInt();
        var longNumber = scanner.nextLong();

        String line = scanner.nextLine();


        while(true){
            System.out.println("Nhập vào 1 số:");
            if(scanner.hasNextInt()){
                int num = scanner.nextInt();
                System.out.println("Số vừa nhập: " + num);
                break;
            } else {
                System.out.println("Nhập sai vui lòng nhập lại");
            }

        }


        String a = "1234567";
        int b = Integer.parseInt(a);
        System.out.println(b);

        String str = 100 + "";


    }
}