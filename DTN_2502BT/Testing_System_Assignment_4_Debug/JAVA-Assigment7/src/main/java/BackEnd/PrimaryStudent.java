package BackEnd;

public class PrimaryStudent extends Student{
    public PrimaryStudent(int id, String name) {
        super(id, name);
    }



    @Override
    public String toString() {
        return "PrimaryStudent{} " + super.toString();
    }

}
