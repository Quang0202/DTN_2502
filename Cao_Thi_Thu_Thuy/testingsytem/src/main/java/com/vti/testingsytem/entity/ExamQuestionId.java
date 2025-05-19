package com.vti.testingsytem.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ExamQuestionId implements Serializable {
    private int examId;
    private int questionId;
}
