package com.vti.demo.entity;


import com.vti.demo.converter.PositionNameConverter;
import jakarta.persistence.*;

@Entity
@Table(name = "Position")
public class Position {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "positionId")
    private int positionId;
@Column(name = "positionName",nullable = false,unique = true)
//@Enumerated(EnumType.STRING)

@Convert(converter = PositionNameConverter.class)
    private PositionName positionName ;

    public Position(int positionId, PositionName positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }
    public Position() {

    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }
}
