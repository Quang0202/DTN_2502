package model;

public class Position {
    private int positionId;
    private String positionName;

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Position() {
        System.out.println("Enter Id Position: ");
        this.positionId = ScannerUtils.inputInt("Please input a number as int");
        System.out.println("Enter Name Position: ");
        this.positionName = ScannerUtils.inputString();
    }
}
