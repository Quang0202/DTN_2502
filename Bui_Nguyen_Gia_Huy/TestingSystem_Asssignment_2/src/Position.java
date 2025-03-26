public class Position {
    public int id;
    public String positionName;

    public Position(int id, String name) {
        this.id = id;
        this.positionName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
