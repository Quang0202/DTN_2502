package com.testingsystem_assignment_1;

import java.util.Date;

public class Question {
    int questionId;
    String content;
    CategoryQuestion categoryQuestion;
    TypeQuestion typeQuestion;
    Account creator;
    Date createDate;

    public Question(int questionId, String content, CategoryQuestion categoryQuestion, TypeQuestion typeQuestion, Account creator, Date createDate) {
        this.questionId = questionId;
        this.content = content;
        this.categoryQuestion = categoryQuestion;
        this.typeQuestion = typeQuestion;
        this.creator = creator;
        this.createDate = createDate;
    }

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
