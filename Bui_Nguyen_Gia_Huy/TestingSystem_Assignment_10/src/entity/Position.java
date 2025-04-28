package entity;

public class Position {
    private int positionID;
    private String positionName; // Enum: Dev, Test, Scrum Master, PM

    public Position() {}

    public Position(int positionID, String positionName) {
        this.positionID = positionID;
        this.positionName = positionName;
    }

    // Getters and Setters
    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "Position [ID=" + positionID + ", Name=" + positionName + "]";
    }
}
