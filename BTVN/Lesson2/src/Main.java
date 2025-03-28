import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        System.out.printf("%d%n", a);

        int b =  100000000;
        System.out.printf(Locale.US,"%,d%n",b);

        LocalDateTime now = LocalDateTime.now();
        System.out.printf("%d/%02d/%d",now.getDayOfMonth(),now.getMonthValue(), now.getYear());
        Account account = new Account();
        account.username = "admin";
        account.email = "email1";
        account.fullName = "fullName1";
        Account account1 = new Account();
        account1.username = "admin";
        account1.email = "email1";
        account1.fullName = "fullName1";
        Account account3 = new Account();
        account3.username = "admin";
        account3.email = "email1";
        account3.fullName = "fullName1";
        Account[] accounts = {account,account1,account3};
        System.out.println();
        System.out.printf("%-10s%-10s%-10s%n", "UserName", "email", "fullName");
        for (Account acc : accounts) {
            System.out.printf("%-10s%-10s%-10s%n",acc.username,acc.email,acc.fullName);
        }


        LocalDateTime localDateTime = LocalDateTime.now();
        Locale locale = new Locale("vi","VN");
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Asia/Ho_Chi_Minh"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(locale);
        System.out.println(zonedDateTime.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM");
        String formattedDateTime = localDateTime.format(dateTimeFormatter1);
        System.out.println(formattedDateTime);
        System.out.println(localDateTime.getDayOfYear());
        System.out.printf("%d-%d%n", localDateTime.getMonthValue(),localDateTime.getYear());

        Random random = new Random();

        System.out.println(random.nextInt(111,444));// [10,20)
        System.out.println(random.nextInt(10)+10);// [0,10) +10 -> [10,20) [0,(MAX-MIN)) + MIN
        // 4-07-1995 20-12-1995
        LocalDate startDate = LocalDate.of(1995,7,4);
        long numStartDate = startDate.toEpochDay();//Số ngày cuả dateTime so với ngày 1/1/1970
        System.out.println("start: " + numStartDate);
        LocalDate endDate = LocalDate.of(1995,12,20);
        long numEndDate = endDate.toEpochDay();
        System.out.println("end: " + numEndDate);

        long numResultDate = random.nextLong(numStartDate,numEndDate);
        System.out.println("result: " + numResultDate);

        LocalDate resultDate = LocalDate.ofEpochDay(numResultDate);

        System.out.println(resultDate);

        LocalDate nowDate = LocalDate.now();
        LocalDate date = LocalDate.of(nowDate.getYear()-1, nowDate.getMonthValue(), nowDate.getDayOfMonth());

        System.out.println(random.nextInt(100,1000));

        String[] str = {"nguyen van a", "nguyen van b", "nguyen van c"};
        int index = random.nextInt(0, str.length);
        System.out.println(str[index]);


    }
}