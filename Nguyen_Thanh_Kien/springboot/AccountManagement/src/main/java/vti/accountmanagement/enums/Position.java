package vti.accountmanagement.enums;

public enum Position {
    Dev(1), Test(2), Scrum_Master(3), PM(4);
    private final int value;

    Position(int value) {
        this.value = value;
    }

    public static Position get(int value) {
        for (Position g : Position.values()) {
            if (g.value == value) {
                return g;
            }
        }
        return null;
    }
}
