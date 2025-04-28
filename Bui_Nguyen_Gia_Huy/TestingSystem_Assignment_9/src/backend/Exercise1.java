package backend;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise1 {
    public void question1() {
        Locale locale = new Locale("vi", "VN");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy", locale);
        System.out.println("Formatted date (Vietnamese): " + formatter.format(date));
    }
}
