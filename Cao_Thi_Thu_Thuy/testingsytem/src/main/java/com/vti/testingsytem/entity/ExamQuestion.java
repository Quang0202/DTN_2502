package com.vti.testingsytem.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ExamQuestion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExamQuestion {

    @EmbeddedId
    private ExamQuestionId examQuestionId;
}
