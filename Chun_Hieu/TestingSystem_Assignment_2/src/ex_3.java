import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class ex_3 {
    public static void main(String[] args) {
        // Question 1
        Exam exam = new Exam("Java Exam", new Date());

        Locale locale = new Locale("vi", "VN");
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        String date = df.format(exam.createDate);
        System.out.println(date);

        System.out.println("Thông tin Exam:");
        System.out.println("Title: " + exam.title);
        System.out.println("Create Date: " + date);

        // Question 2
        SimpleDateFormat fullFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Exam đã tạo ngày: " + fullFormat.format(exam.createDate));

        // Question 3
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        System.out.println("Năm của Exam: " + yearFormat.format(exam.createDate));

        //Question 4
        SimpleDateFormat monthYearFormat = new SimpleDateFormat("MM-yyyy");
        System.out.println("Tháng và năm của Exam: " + monthYearFormat.format(exam.createDate));

        //Exam 5
        SimpleDateFormat monthDayFormat = new SimpleDateFormat("MM-dd");
        System.out.println("MM-DD của Exam: " + monthDayFormat.format(exam.createDate));
    }


}
