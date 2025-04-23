package frontend;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Exercise 1: Collection");
            System.out.println("2. Exercise 2: Comparing");
            System.out.println("3. Exercise 3: Generic");
            System.out.println("4. Exercise 4: Wildcard Generic");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Program1.main(args);
                    break;
                case 2:
                    Program2.main(args);
                    break;
                case 3:
                    Program3.main(args);
                    break;
                case 4:
                    Program4.main(args);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
