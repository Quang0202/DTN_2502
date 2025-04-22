package Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {


    public static void inputInt(String erroMessage)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap tuoi");


        while (true) {

            try {
                int age = sc.nextInt();
                System.out.println(age + "    ");
               return ;

                } catch (InputMismatchException e) {
                System.out.println(erroMessage);
                sc.nextLine();
            }
        }
    }


    public static void inputString(String errString)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap tuoi");
        while (true) {
            try {
                double agedb = sc.nextDouble();
                System.out.println(agedb + "    ");

            } catch (InputMismatchException e) {
                System.out.println(errString);
            }
        }
    }
}
