import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Date date = new Date();
        Locale l = Locale.FRANCE;
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, l);
        String strDte = df.format(date);
        System.out.println(strDte);

        System.out.println(date);
        Locale locale = new Locale("vi", "VN");
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String strDate = df1.format(date);
        System.out.println(strDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        Locale loc = new Locale("vi", "VN");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", loc);
        System.out.println(localDateTime.format(dateTimeFormatter));

        System.out.printf("Hoang %d Trung Kien %s \n", 1, "mmmm");
        System.out.printf("%10s", "hoang\n"); //căn phải;
        System.out.printf("%-10s", "hoang");// căn trái;
        System.out.print("hoang trun kien\n");

        System.out.printf(Locale.US, "%,d\n", 100000000);
        System.out.printf("%05d \n", 157);

        Random random = new Random();
        int randomInt = random.nextInt(10, 100);
        System.out.println(randomInt);

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