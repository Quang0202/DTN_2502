package org.example.exercise01;

public class Position {
    public Position(String positionname) {
        this.id = id;
        this.positionname = positionname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", positionname='" + positionname + '\'' +
                '}';
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    private int id;
    private String positionname;


}
