import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise2 {
    // Question 1
    public void question1() {
        int number = 5;
        System.out.printf("The number is: %d%n", number);
    }

    // Question 2
    public void question2() {
        int largeNumber = 100_000_000;
        System.out.printf("Formatted number: %,d%n", largeNumber);
    }

    // Question 3
    public void question3() {
        double decimalNumber = 5.567098;
        System.out.printf("Formatted number: %.4f%n", decimalNumber);
    }

    // Question 4
    public void question4() {
        String fullName = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", fullName);
    }

    // Question 5
    public void question5() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'm':ss's'");
        System.out.println(now.format(formatter));
    }

    // Question 6
    public void question6(Account[] accounts) {
        System.out.printf("%-5s %-25s %-20s %-15s%n", "ID", "Email", "Full Name", "Department");
        System.out.println("---------------------------------------------------------------");
        for (Account acc : accounts) {
            System.out.printf("%-5d %-25s %-20s %-15s%n",
                    acc.getId(), acc.getEmail(), acc.getFullName(), acc.getDepartment().getDepartmentName());
        }
    }
}
