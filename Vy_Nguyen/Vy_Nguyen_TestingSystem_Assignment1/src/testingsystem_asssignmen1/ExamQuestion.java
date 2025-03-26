package testingsystem_asssignmen1;

public class ExamQuestion {
    public int examId;
    public Question question;
    public ExamQuestion(int examId, Question question){
        this.examId = examId;
        this.question = question;
    }
}
// Chú ý: các foreign key cần chuyển thành các Object