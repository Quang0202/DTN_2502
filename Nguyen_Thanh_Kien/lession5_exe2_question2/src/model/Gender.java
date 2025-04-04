package model;

public enum Gender {
    Nam(1), Nữ(2), Khác(3);
    private final int value;
    Gender(int value) {
        this.value = value;
    }

    public static Gender get(int value) {
        for (Gender g : Gender.values()) {
            if (g.value == value) {
                return g;
            }
        }
        return null;
    }
}