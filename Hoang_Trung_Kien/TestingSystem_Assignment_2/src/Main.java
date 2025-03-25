import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Question 1:");
        System.out.printf("%d\n", a);

        int b = 100000000;
        System.out.println("Question 2:");
        System.out.printf("%,d\n", b);

        float c = 5.567098f;
        System.out.println("Question 3:");
        System.out.printf("%1.4f%n\n", c);

        String hoten = "Nguyen Van A";
        System.out.println("Question 4:");
        System.out.printf("Tôi tên là %s và tôi có người yêu\n", hoten);

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh'h':mm'p':ss's'");
        System.out.println("Question 5:");
        System.out.printf(date.format(dateTimeFormatter));


    }
}