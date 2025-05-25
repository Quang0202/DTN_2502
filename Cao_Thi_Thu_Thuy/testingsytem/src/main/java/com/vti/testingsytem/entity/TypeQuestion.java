package com.vti.testingsytem.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vti.testingsytem.converter.TypeNameConverter;
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
public class TypeQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeId", columnDefinition = "TINYINT UNSIGNED")
    private int typeId;

    @Column(nullable = false, unique = true)
    @Convert(converter = TypeNameConverter.class)
    private ETypeName typeName;

    @OneToMany(mappedBy = "typeQuestion", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Question> questions;
}
