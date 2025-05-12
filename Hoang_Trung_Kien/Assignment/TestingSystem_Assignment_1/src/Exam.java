import java.time.LocalDateTime;

public class Exam {
    int examId;
    String code;
    String title;
    CategoryQuestion categoryQuestion;
    int duration;
    Account creator;
    LocalDateTime createDate;
    Question[] questions;

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", categoryQuestion=" + categoryQuestion +
                ", duration='" + duration + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
