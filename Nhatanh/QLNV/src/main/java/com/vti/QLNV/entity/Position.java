package com.vti.QLNV.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Position {
    @Id
    private Integer positionId;
    private PositionName positionName;
}
