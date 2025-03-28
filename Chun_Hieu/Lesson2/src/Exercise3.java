import java.time.format.DateTimeFormatter;

public class Exercise3 {
    public void ques2(Exam exam) {
        System.out.print("Exam đã tạo ngày ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-hh-mm-ss");
        System.out.printf(exam.createDate.format(dateTimeFormatter) +"\n");
    }

    public void ques3(Exam exam) {
        System.out.print("Exam đã tạo năm ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.printf(exam.createDate.format(dateTimeFormatter) +"\n");
    }

    public void ques4(Exam exam) {
        System.out.print("Exam đã tạo vào ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-yyyy");
        System.out.printf(exam.createDate.format(dateTimeFormatter) +"\n");
    }

    public void ques5(Exam exam) {
        System.out.print("Exam đã tạo vào ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-DD");
        System.out.printf(exam.createDate.format(dateTimeFormatter) +"\n");
    }
}
