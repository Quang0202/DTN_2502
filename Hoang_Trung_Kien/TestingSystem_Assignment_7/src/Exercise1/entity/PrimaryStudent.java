package Exercise1.entity;

public class PrimaryStudent extends Student{
    private static int count;

    public static int getCount() {
        return count;
    }

    public PrimaryStudent(int id, String name) throws Exception {
        super(id, name);
        count ++;
    }

    @Override
    public String toString() {
        return "PrimaryStudent{} " + super.toString();
    }
}
