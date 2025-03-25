package com.testingsystem_assignment_1;

import java.util.Date;

public class Exam {
    public int examId;
    public String code;
    public String title;
    public CategoryQuestion categoryQuestion;
    public int duration;
    public Account creator;
    public Date createDate;
    Question[] questions;

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
}
