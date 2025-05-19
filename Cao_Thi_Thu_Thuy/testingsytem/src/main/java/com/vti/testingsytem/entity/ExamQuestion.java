package com.vti.testingsytem.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ExamQuestion")
public class ExamQuestion {

    @EmbeddedId
    private ExamQuestionId examQuestionId;

    public ExamQuestion() {
    }

    public ExamQuestionId getExamQuestionId() {
        return examQuestionId;
    }

    public void setExamQuestionId(ExamQuestionId examQuestionId) {
        this.examQuestionId = examQuestionId;
    }
}
