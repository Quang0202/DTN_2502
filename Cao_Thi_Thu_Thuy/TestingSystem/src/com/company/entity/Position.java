package com.company.entity;

public class Position {
    private int positionId;
    private EPositionName positionName;

    public Position(int positionId, EPositionName positionName) {
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

    public EPositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(EPositionName positionName) {
        this.positionName = positionName;
    }
}
