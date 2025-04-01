package model;

import java.time.LocalDate;

public class Question {
    private int questionId;
    private String content;
    private CategoryQuestion categoryQuestion;
    private TypeQuestion typeQuestion;
    private Account createAccount;
    private LocalDate createDate;

    public Question(int questionId, String content, CategoryQuestion categoryQuestion, TypeQuestion typeQuestion, Account createAccount, LocalDate createDate) {
        this.questionId = questionId;
        this.content = content;
        this.categoryQuestion = categoryQuestion;
        this.typeQuestion = typeQuestion;
        this.createAccount = createAccount;
        this.createDate = createDate;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CategoryQuestion getCategoryQuestion() {
        return categoryQuestion;
    }

    public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
        this.categoryQuestion = categoryQuestion;
    }

    public TypeQuestion getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(TypeQuestion typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public Account getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(Account createAccount) {
        this.createAccount = createAccount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
