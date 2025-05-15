package com.testingsystem_assignment_1;

public class ExamQuestion {
    int examId;
    Question question;

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
}
