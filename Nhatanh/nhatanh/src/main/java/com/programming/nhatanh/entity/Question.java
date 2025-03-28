package com.programming.nhatanh.entity;

import java.time.LocalDateTime;

public class Question {
    public int questionId;
    public String content;
    public int categoryId;
    public int typeId;
    public Account creator;
    LocalDateTime createDate;
    public Exam[] exams;
}
