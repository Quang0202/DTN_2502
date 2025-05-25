package com.vti.testingsytem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private CategoryQuestion categoryQuestion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeId")
    @JsonBackReference
    private TypeQuestion typeQuestion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorId")
    private Account createAccount;

    private LocalDate createDate;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Answer> answers;
}
