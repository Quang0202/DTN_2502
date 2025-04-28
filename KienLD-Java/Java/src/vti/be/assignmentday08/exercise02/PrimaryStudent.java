package vti.be.assignmentday08.exercise02;

public final class PrimaryStudent extends Question03 {
    public PrimaryStudent(int id, String name) {
        super(id, name);
    }

    public static  void main(String[] args) {
        Question03 q = new Question03(1, "Nguyen Van A");
        q.study();
    }

}
