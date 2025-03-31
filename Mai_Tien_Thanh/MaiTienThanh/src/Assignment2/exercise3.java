package Assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class exercise3 {
    public static void main(String[] args) {
        Date createDate = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy - MM - dd - HH - mm -ss");
        System.out.println("Exam thứ 1 - Ngày tạo: " + formatter.format(createDate));

        SimpleDateFormat yearFomatter = new SimpleDateFormat("yyyy");
        System.out.println("Exam thứ 1 - Năm tạo: " + yearFomatter.format(createDate));

        SimpleDateFormat monthyearFommatter = new SimpleDateFormat("MM-yyyy");
        System.out.println("Exam thứ 1 - Tháng năm tạo: " + monthyearFommatter.format(createDate));

        SimpleDateFormat daymonthFommater = new SimpleDateFormat("dd - MM");
        System.out.println("Exam thứ 1 - Ngày tháng tạo: " + daymonthFommater.format(createDate));

        System.out.println("Tôi bị ngu");
        System.out.println("Tôi không ngu");
    }
}
