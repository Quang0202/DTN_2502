package vti.be.assignmentday07.exercise02;

public class Question09_Position {
    public Question09_Position() {
        this.position_id = Utils.input_position_id("Enter position ID");
        this.position_name = Utils.input_positionname("Enter position name");
    }

    String position_name;

    @Override
    public String toString() {
        return "Question09_Position{" +
                "position_name='" + position_name + '\'' +
                ", position_id=" + position_id +
                '}';
    }

    int position_id;


}
