package Exercise2.entity;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int a = inputAge();
        System.out.println("Tuoi cua ban la: " + a);
    }

    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban:");
        while (true) {
            if (scanner.hasNextLine()) {
                try {
                    int a = Integer.parseInt(scanner.nextLine());
                    if (a < 0) {
                        System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                    } else
                        return a;
                }
                catch (NumberFormatException e) {
                    System.out.println("wrong inputing! Please input an age as int, input again.");
                }
            }
        }
    }
}
