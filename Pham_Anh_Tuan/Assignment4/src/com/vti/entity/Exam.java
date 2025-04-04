package com.vti.entity;

import java.util.Date;

public class Exam {
    private int examId;
    private String code;
    private String title;
    private CategoryQuestion categoryQuestion;
    private int duration;
    private Account creator;
    private Date createDate;

    public Exam(int examId, String code, String title, CategoryQuestion categoryQuestion, int duration, Account creator, Date creatDate) {
        this.examId = examId;
        this.code = code;
        this.title = title;
        this.categoryQuestion = categoryQuestion;
        this.duration = duration;
        this.creator = creator;
        this.createDate = createDate;
    }

    public Exam(int examId, String title, Date createDate) {
        this.examId = examId;
        this.title = title;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", categoryQuestion=" + categoryQuestion +
                ", duration=" + duration +
                ", creator=" + creator +
                ", creatDate=" + createDate +
                '}';
    }

    // Getter để truy xuất dữ liệu
    public int getExamId() {
        return examId;
    }

    public String getTitle() {
        return title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategoryQuestion() {
        return categoryQuestion;
    }

    public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
        this.categoryQuestion = categoryQuestion;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
