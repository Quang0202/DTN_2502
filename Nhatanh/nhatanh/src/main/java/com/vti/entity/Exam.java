package com.vti.entity;

import java.time.LocalDateTime;

public class Exam {
    private int examId;
    private String code;
    private String title;
    private CategoryQuestion category;
    private int duration;
    private Account CreatorID;
    private LocalDateTime CreateDate;

    public int getExamId() {
        return examId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Account getCreatorID() {
        return CreatorID;
    }

    public void setCreatorID(Account creatorID) {
        CreatorID = creatorID;
    }

    public LocalDateTime getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        CreateDate = createDate;
    }
}
