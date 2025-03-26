import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println("So vua nhap la " + num);
        }

        System.out.println("Nhap vao 1 so nguyen: ");
        while(true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.println("So vua nhap la " + num);
                break;
            } else {
                System.out.println("Nhap lai: ");
                scanner.next();
            }
        }

//        long numl = scanner.nextLong();
//        float numf = scanner.nextFloat();
//        String str = scanner.next();
//        scanner.nextLine();
//        String str2 = scanner.nextLine(); //Lay string co ca space.
//
//
//        System.out.println(str);
//        System.out.println(str2);
        scanner.close();
    }
}