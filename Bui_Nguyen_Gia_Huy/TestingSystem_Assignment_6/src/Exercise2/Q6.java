package Exercise2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int age = inputAge();
        System.out.println("Your age is: " + age);
    }

    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input an age:");
            String input = scanner.nextLine();

            try {
                int age = Integer.parseInt(input);
                if (age <= 0) {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                    continue;
                }
                return age;
            } catch (NumberFormatException e) {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            }
        }
    }
}
