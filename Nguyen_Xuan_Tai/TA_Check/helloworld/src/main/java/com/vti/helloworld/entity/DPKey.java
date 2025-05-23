package com.vti.helloworld.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class DPKey {
    private int departmentId;
    private int positionId;

    public DPKey(){}

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }
}
