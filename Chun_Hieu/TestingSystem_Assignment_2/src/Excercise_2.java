import java.io.Console;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Excercise_2 {
    public static void main(String[] args) {
        // Question 1
        int i = 5;
        System.out.println(i);
        // Question 2
        int j = 100000000;
        System.out.printf("%,d %n", j);
        // Question 3
        float num = 5.567098f;
        System.out.printf("%.4f %n", num);
        //Question 4
        String str = "Nguyen Van A";
        System.out.println("Ten toi la " + str + "va toi dang doc than");
        //Question 5
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.printf(formatter.format(date));
        System.out.println('\n');

        // 6

        Account account1 = new Account();
        account1.email = "nguyen@gmail.com";
        account1.fullName = "Nguyen Van X";
        account1.department = "Dev";
        Account account2 = new Account();
        account2.email = "nguyena@gmail.com";
        account2.fullName = "Nguyen Van A";
        account2.department = "Dev";
        Account account3 = new Account();
        account3.email = "nguyenb@gmail.com";
        account3.fullName = "Nguyen Van B";
        account3.department = "Dev";
        Account[] accounts = {account1, account2, account3};

        System.out.println("+----------------------+----------------+-------------+");
        System.out.println("| Email               | Full Name      | Department  |");
        System.out.println("+----------------------+----------------+-------------+");

        for (Account account : accounts) {
            System.out.printf("| %-20s | %-14s | %-11s |\n", account.email, account.fullName, account.department);
        }
    }

}
