package com.vti.assignment45.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Position")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer positionID;

    @Enumerated(EnumType.STRING)
    @Column(name = "PositionName", nullable = false, unique = true)
    private PositionName positionName;

    public enum PositionName {
        Dev, Test, Scrum_Master, PM
    }
}
