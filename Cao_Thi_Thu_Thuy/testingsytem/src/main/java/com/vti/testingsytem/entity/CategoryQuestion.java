package com.vti.testingsytem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
}
