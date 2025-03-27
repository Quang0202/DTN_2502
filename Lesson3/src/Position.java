public class Position {
     int id;
    PositionName name;

//    public Position(int id, PositionName name) {
//        this.id = id;
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
