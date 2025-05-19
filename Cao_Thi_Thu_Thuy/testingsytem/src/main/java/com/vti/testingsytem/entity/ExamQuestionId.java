package com.vti.testingsytem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ExamQuestionId implements Serializable {

    @Column(nullable = false)
    private int examId;

    @Column(nullable = false)
    private int questionId;
}
