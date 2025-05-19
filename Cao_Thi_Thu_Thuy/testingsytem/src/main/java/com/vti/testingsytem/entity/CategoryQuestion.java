package com.vti.testingsytem.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CategoryQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId", columnDefinition = "TINYINT UNSIGNED")
    private int categoryId;

    @Column(nullable = false, unique = true)
    private String categoryName;

    @OneToMany(mappedBy = "categoryQuestion", fetch = FetchType.LAZY)
    private Set<Question> questions;

    @OneToMany(mappedBy = "categoryQuestion", fetch = FetchType.LAZY)
    private Set<Exam> exams;

    public CategoryQuestion() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
}
