package com.programming.nhatanh.entity;

public class Answer {
    public int AnswerID;
    public String content;
    public Question question;
    public boolean isCorrect;

    public Answer(int answerID, String content, Question question, boolean isCorrect) {
        AnswerID = answerID;
        this.content = content;
        this.question = question;
        this.isCorrect = isCorrect;
    }

    public Answer() {
    }
}
