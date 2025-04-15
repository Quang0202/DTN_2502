import java.util.Scanner;

public class Exercise1 {

    // Question 1
    public void question1() {
        float salary1 = 5240.5f;
        float salary2 = 10970.055f;

        int roundedSalary1 = (int) salary1;
        int roundedSalary2 = (int) salary2;

        System.out.println("Rounded Salary 1: " + roundedSalary1);
        System.out.println("Rounded Salary 2: " + roundedSalary2);
    }

    // Question 2
    public void question2() {
        int number = (int) (Math.random() * 90000 + 10000);
        System.out.printf("Random 5-digit number: %05d\n", number);
    }

    // Question 3
    public void question3() {
        int number = (int) (Math.random() * 90000 + 10000);
        System.out.printf("Original number: %05d\n", number);

        String strNumber = String.valueOf(number);
        System.out.println("Last 2 digits (String way): " + strNumber.substring(strNumber.length() - 2));

        int lastTwoDigits = number % 100;
        System.out.println("Last 2 digits (Modulo): " + lastTwoDigits);
    }

    // Question 4
    public void question4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = sc.nextInt();

        System.out.print("Enter integer b: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            float result = (float) a / b;
            System.out.printf("Result of %d / %d = %.2f\n", a, b, result);
        }
    }
}
