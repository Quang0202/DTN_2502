package com.vti.QLNV.entity;

import com.vti.QLNV.converter.PositionNameConverter;
import jakarta.persistence.*;

@Entity
@Table(name = "Position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "positionId")
    private Integer positionId;
    @Column(name = "positionName", nullable = false, unique = true)
    @Enumerated(EnumType.ORDINAL)
    @Convert(converter = PositionNameConverter.class)
    private PositionName positionName;

    public Position(Integer positionId, PositionName positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public Position(PositionName positionName) {
        this.positionName = positionName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }
}
