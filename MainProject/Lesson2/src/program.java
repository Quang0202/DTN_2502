import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        int a = 1;
//        a++;// a+=1
        int b = 1;
//        ++b;
//        System.out.println(a +" "+ b);
//        int c = a++;// c= a, a= a+1;
//        System.out.println(c + " "+ a);
//        int d = ++b;// b= b+1, d = b
//        System.out.println(d+ " "+ b);
//        int g = 10;
//        g+= 10; //g=g+10;
//        if(a==1 ^ b !=1){
//            System.out.println( "a or b is 1");
//        }
//        else {
//            System.out.println("neither a nor b is 1");
//        }
       /* boolean x = false;
        if(!x){
            System.out.println("dung");
        } else {
            System.out.println("sai");
        }*/
//        Date date = new Date();
//        System.out.println(date);
//        Locale locale = new Locale("vi","VN");
//        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
//        String strDate = df.format(date);
//        System.out.println(strDate);

        Date date = new Date();
        String pattern = "EEEEE DDD-MMMM-yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String strDate = simpleDateFormat.format(date);
        System.out.println(strDate);

        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);
//        Locale locale = new Locale("vi","VN");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEEE DDD-MMMM-yyyy HH:mm:ss");
        System.out.println(localDate.format(dateTimeFormatter));

        System.out.print("nguyen van a ");
        System.out.println("nguyen van b");

        System.out.printf("nguye%dn van a%s%n", 1,"nguyen van");
        System.out.printf("%-10s", "nguyen");
        System.out.printf("%-10s","van");
        System.out.printf("%-10s%n","a");

        System.out.printf(new Locale("vi","VN"), "%,d%n", 123456789);
        System.out.printf("%05d%n", 4435353);
        System.out.printf("%.2f%n", 123456789.129456789);

        Random random = new Random();
        int randomInt = random.nextInt(10,20);// 10-19
        long randomLong = random.nextLong(10,20);
        float randomFloat = random.nextFloat(10,20);
        double randomDouble = random.nextDouble(10,20);
        System.out.println(randomInt);



    }
}
