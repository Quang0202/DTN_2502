package com.testingsystem_assignment_1;

public class Position {
    int positionID;
    public String positionName;

    public Position(int positionID, String positionName) {
        this.positionID = positionID;
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionID=" + positionID +
                ", positionName='" + (positionName == "Developer" ? "Đây là Developer" : "Người này không phải là Developer") + '\'' +
                '}';
    }
}
