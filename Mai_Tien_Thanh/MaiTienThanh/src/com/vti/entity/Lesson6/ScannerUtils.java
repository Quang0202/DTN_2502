package MaiTienThanh.src.com.vti.entity.Lesson6;


import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Scanner scanner = new Scanner(System.in);
    public int inputInt(String errorMessage){
        int integer;

        while (true) {
            try {
                integer = scanner.nextInt();
                scanner.nextLine();
                return integer;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }
    }
    public float inputFloat(String errorMessage) {
        while (true) {
            try {
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }
    }

    public double inputDouble(String errorMessage) {
        while (true) {
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }
    }

    public String inputString() {
        return scanner.nextLine();
    }
}

