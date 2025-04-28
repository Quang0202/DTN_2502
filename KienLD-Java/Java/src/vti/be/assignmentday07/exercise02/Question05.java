package vti.be.assignmentday07.exercise02;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter input: ");
                String input = sc.nextLine();
                try {
                    int number = Integer.parseInt(input); System.out.print(inputAge(number));
                } catch (NumberFormatException e) {
                    throw  new Exception("wrong inputing! Please input an age as int, input again.");
                }
    }
    public static int inputAge(int number) throws Exception {
        while (true) {
            try {
                if (number <= 0) {
                    throw new Exception("Age must be greater than 0, please input again.");
                }
                return number;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
