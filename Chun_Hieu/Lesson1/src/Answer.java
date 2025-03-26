public class Answer {
    int answerId;
    String content;
    Question question;
    boolean correct;

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", content='" + content + '\'' +
                ", question=" + question +
                ", correct=" + correct +
                '}';
    }
}
