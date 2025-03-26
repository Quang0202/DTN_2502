package testingsystem_asssignmen1;

public class Answer {
    public int answerId;
    public String content;
    public Question question;
    public boolean isCorrect;

    public Answer(int answerId, String content, Question question, boolean isCorrect){
        this.answerId = answerId;
        this.content = content;
        this.question = question;
        this.isCorrect = isCorrect;
    }
}
