package vti.data;

public class Position {
    public Position(int position_id, String position_name) {
        this.position_id = position_id;
        this.position_name = position_name;
    }

    public int position_id;

    @Override
    public String toString() {
        return "Position{" +
                "position_id=" + position_id +
                ", position_name='" + position_name + '\'' +
                '}';
    }

    public String position_name;
}
