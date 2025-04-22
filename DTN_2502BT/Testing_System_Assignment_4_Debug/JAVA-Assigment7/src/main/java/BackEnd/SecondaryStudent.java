package BackEnd;

public class SecondaryStudent extends Student {

    public SecondaryStudent(int id, String name) {
        super(id,name);
    }

    @Override
    public String toString() {
        return "SecondaryStudent{} " + super.toString();
    }
}
