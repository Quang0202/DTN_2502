package model;

public enum Group {
    A(1), B(2), C(3);
    private final int value;
    Group(int value) {
        this.value = value;
    }

    public static Group get(int value) {
        for (Group g : Group.values()) {
            if (g.value == value) {
                return g;
            }
        }
        return null;
    }
}
