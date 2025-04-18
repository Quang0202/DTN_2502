package MaiTienThanh.src.com.vti.entity;

public class Answer {
    private int answerId;
    private String content;
    private Question question;
    private boolean isCorrect;

    public Answer(int answerId, String content, Question question, boolean isCorrect) {
        this.answerId = answerId;
        this.content = content;
        this.question = question;
        this.isCorrect = isCorrect;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
