import java.time.LocalDateTime;

public class Exam {
    int examId;
    int code;
    String title;
    CategoryQuestion question;
    int duration;
    Account creator;
    LocalDateTime createDate;
    Question[] questions;

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", code=" + code +
                ", title='" + title + '\'' +
                ", question=" + question +
                ", duration=" + duration +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
