import java.time.LocalDateTime;

public class Question {
    int questionId;
    String content;
    CategoryQuestion categoryQuestion;
    TypeQuestion typeQuestion;
    Account creator;
    LocalDateTime createDate;
    Exam[] exams;

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", content='" + content + '\'' +
                ", categoryQuestion=" + categoryQuestion +
                ", typeQuestion=" + typeQuestion +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
