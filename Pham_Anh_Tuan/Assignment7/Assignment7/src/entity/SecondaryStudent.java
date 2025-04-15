package entity;

public class SecondaryStudent extends Student {
    private static int secondaryCount = 0;

    public SecondaryStudent(int id, String name) {
        super(id, name);
        secondaryCount++;
    }

    public static int getSecondaryCount() {
        return secondaryCount;
    }
}