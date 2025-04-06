package com.vti.entity;

public class Answer {
    private int AnswerID;
    private String content;
    private Question question;
    private boolean isCorrect;

    public Answer(int answerID, String content, Question question, boolean isCorrect) {
        AnswerID = answerID;
        this.content = content;
        this.question = question;
        this.isCorrect = isCorrect;
    }

    public Answer() {
    }

    public int getAnswerID() {
        return AnswerID;
    }

    public void setAnswerID(int answerID) {
        AnswerID = answerID;
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
