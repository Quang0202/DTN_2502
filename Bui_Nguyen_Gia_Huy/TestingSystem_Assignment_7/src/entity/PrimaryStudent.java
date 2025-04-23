package entity;

public final class PrimaryStudent extends Student {
    private static int primaryCount = 0;

    public PrimaryStudent(int id, String name) {
        super(id, name);
        primaryCount++;
    }

    public static int getPrimaryCount() {
        return primaryCount;
    }
}
