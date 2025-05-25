package com.vti.testingsytem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vti.testingsytem.converter.PositionNameConverter;
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
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "positionId", columnDefinition = "TINYINT UNSIGNED")
    private int positionId;

    @Column(nullable = false, unique = true)
    @Convert(converter = PositionNameConverter.class)
    private EPositionName positionName;

    @OneToMany(mappedBy = "position", fetch = FetchType.LAZY)
    private Set<Account> accounts;
}
