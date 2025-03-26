import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//        Locale l = new Locale("en", "US");
//        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, l);
//        String dateStr = df.format(date);
//        System.out.println(dateStr);

        LocalDateTime localDateTime = LocalDateTime.now();
        Locale l = new Locale("en", "US");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", l);
        System.out.println(localDateTime);

    }
}
