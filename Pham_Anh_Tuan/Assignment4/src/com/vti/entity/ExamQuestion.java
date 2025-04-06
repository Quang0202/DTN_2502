package com.vti.entity;

public class ExamQuestion {
    private int examId;
    private Question question;

    public ExamQuestion(int examId, Question question) {
        this.examId = examId;
        this.question = question;
    }

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "examId=" + examId +
                ", question=" + question +
                '}';
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
