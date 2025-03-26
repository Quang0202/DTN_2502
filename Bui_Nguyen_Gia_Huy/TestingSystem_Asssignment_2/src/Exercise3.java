import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise3 {
    public void question1(Exam exam) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new Locale("vi", "VN"));
        String formattedDate = exam.getCreateDate().format(formatter);
        System.out.println("Exam created on: " + formattedDate);
    }

    public void question2(Exam[] exams) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (Exam ex : exams) {
            String formattedDate = ex.getCreateDate().format(formatter);
            System.out.println("Exam ID: " + ex.getExamID() + ", Title: " + ex.getTitle() + ", Created on: " + formattedDate);
        }
    }

    public void question3(Exam[] exams) {
        for (Exam ex : exams) {
            System.out.println("Year of creation: " + ex.getCreateDate().getYear());
        }
    }

    public void question4(Exam[] exams) {
        for (Exam ex : exams) {
            System.out.println("Month and Year of creation: " + ex.getCreateDate() + "-" + ex.getCreateDate().getYear());
        }
    }

    public void question5(Exam[] exams) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-DD");
        for (Exam ex : exams) {
            System.out.println("MM-DD of creation: " + ex.getCreateDate().format(formatter));
        }
    }
}
