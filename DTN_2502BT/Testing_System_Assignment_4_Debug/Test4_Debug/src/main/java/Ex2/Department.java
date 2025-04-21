package Ex2;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.E;

public class Department {
   static  String[] departments = new String[] {"IT","ITA","ITA","ITA"};

    public static String[] getDepartments() {
        return departments;
    }

    public static void getIndex(int index) {

        try {
            System.out.println("Phòng ban tại vị trí " + index + ": " + departments[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
    }
    public static void inputAge() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("vui long nhap do tuoi");

            try{
                int age = input.nextInt();
                if(age>=0) {
                    System.out.println("you age is " + age);
                    break;
                } else {
                    System.out.println("Wrong input! Age must be greater than or equal to 0.");
                }
            } catch (Exception e) {
                System.out.println("Wrong input! Please enter a number.");
                input.nextLine();
            }
        }
        input.close();

    }
}

