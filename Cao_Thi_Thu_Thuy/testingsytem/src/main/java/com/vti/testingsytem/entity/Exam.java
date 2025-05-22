package com.vti.testingsytem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int examId;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private CategoryQuestion categoryQuestion;

    @Column(nullable = false)
    private int duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorId")
    private Account createAccount;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDate createDate;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "ExamQuestion", joinColumns = { @JoinColumn(name = "examId") }, inverseJoinColumns = {
            @JoinColumn(name = "questionId") })
    private Set<Question> questions;
}
