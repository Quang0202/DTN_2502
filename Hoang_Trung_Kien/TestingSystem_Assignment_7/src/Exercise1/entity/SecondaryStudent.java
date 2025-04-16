package Exercise1.entity;

public class SecondaryStudent extends Student{
    private static int count;

    public static int getCount() {
        return count;
    }

    public SecondaryStudent(int id, String name) throws Exception {
        super(id, name);
        count ++;
    }

    @Override
    public String toString() {
        return "SecondaryStudent{} " + super.toString();
    }
}
