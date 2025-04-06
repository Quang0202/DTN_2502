import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(inputAge());
    }

    private static int inputAge(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Nhap vao 1 so nguyen duong: ");
            String age = sc.nextLine();
            try {
                int ageInt = Integer.parseInt(age);
                if (ageInt < 0) {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                } else {
                    return ageInt;
                }
            } catch (NumberFormatException e) {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            }
        }
    }
}