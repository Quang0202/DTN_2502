package backend;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise1 {
    public void question1() {
        Date currentDate = new Date();

        Locale localeVN = new Locale("vi", "VN");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, localeVN);
        System.out.println("Ngày hiện tại theo chuẩn VN: " + dateFormat.format(currentDate));
    }
}
