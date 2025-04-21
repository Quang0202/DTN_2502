package backend;

import java.util.Scanner;

public class Question5 {
//đã gộp chung với Q6
    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập tuổi của bạn: ");
            String input = scanner.nextLine();

            try {
                int age = Integer.parseInt(input);

                if (age <= 0) {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                } else {
                    return age;
                }

            } catch (NumberFormatException e) {
                System.out.println("Wrong inputing! Please input an age as int, input again.");
            }
        }
    }
}
