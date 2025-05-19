package com.vti.testingsytem.entity;

import com.vti.testingsytem.converter.TypeNameConverter;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class TypeQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeId", columnDefinition = "TINYINT UNSIGNED")
    private int typeId;

    @Column(nullable = false, unique = true)
    @Convert(converter = TypeNameConverter.class)
    private ETypeName typeName;

    @OneToMany(mappedBy = "typeQuestion", fetch = FetchType.LAZY)
    private Set<Question> questions;

    public TypeQuestion() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public ETypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(ETypeName typeName) {
        this.typeName = typeName;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
}
