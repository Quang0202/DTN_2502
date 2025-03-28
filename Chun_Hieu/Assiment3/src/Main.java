import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Question 1:
         question1();
//        Question 2:
         question2();
//        Question 3:
        question3();
//        Question 4:
        question4();
    }
    public static void question1(){
        float salary1 = 5240.5f ;
        float salary2 = 10970.055f ;

        Integer salary3 = (int)salary1 ;
        Integer salary4 = (int)salary2 ;
        System.out.println(salary3);
        System.out.println(salary4);
    }
    public static void question2(){
        Random rand = new Random();
        int randomNum = rand.nextInt(10000);
        String randomNumStr = String.format("%05d", randomNum);
        System.out.println(randomNumStr);
    }
    public static void question3() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100000);
        String formattedNumber = String.format("%05d", randomNumber);
        // C1
        String lastTwoDigitsStr = formattedNumber.substring(3);
        // C2
        int lastTwoDigitsInt = randomNumber % 100;

        System.out.println("Số ngẫu nhiên: " + formattedNumber);
        System.out.println("Hai số cuối (Cách 1 - String): " + lastTwoDigitsStr);
        System.out.println("Hai số cuối (Cách 2 - Chia dư): " + lastTwoDigitsInt);
    }
    public static void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = sc.nextInt();
        if (b == 0){
            System.out.println("Không thể chia cho 0");
        } else {
            System.out.println("Thương:" + a/b);
        }
    }

}