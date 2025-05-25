package com.example.TestingSystem.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "`Position`")
public class Position {
    public enum PositionName {
        Dev, Test, Scrum_Master, PM
    }

    public static PositionName fromString(String name) {
        if (name == null) throw new IllegalArgumentException("Position name is null");
        return PositionName.valueOf(name.trim().replace(" ", "_"));
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PositionID")
    private Short positionID;

    @Enumerated(EnumType.STRING)
    @Column(name = "PositionName", nullable = false, unique = true)
    private PositionName positionName;

    @OneToMany(mappedBy = "position")
    private List<Account> accounts;
}
