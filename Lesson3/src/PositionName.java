public enum PositionName {
    DEV(0),
    TEST(1),
    SCRUM_MASTER(2),
    PM(3);

    private  int value;

    PositionName(int value) {
        this.value = value;
    }

    // Phương thức chuyển số thành enum
    public static PositionName fromInt(int value) {
        for (PositionName pos : PositionName.values()) {
            if (pos.value == value) {
                return pos;
            }
        }
        throw new IllegalArgumentException("Số nhập không hợp lệ! Hãy nhập từ 1 đến 4.");
    }
}
