package Assignment2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exercise2 {
    public static void main(String[] args) {
        //question1
        int a = 5;
        System.out.printf("Số nguyên a là: %d%n", a);

        //question2
        int b = 100000000;
        System.out.printf("Số nguyên b là: %,d%n", b);

        //question3
        double c = 5.567098;
        System.out.printf("Số thực c là: %.4f%n", c);

        //question4;
        String hovaten = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân\n", hovaten);

        //question5;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        System.out.println(now.format(formatter));
    }
}
