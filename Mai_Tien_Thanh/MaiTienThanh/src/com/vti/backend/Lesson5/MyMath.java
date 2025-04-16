package MaiTienThanh.src.com.vti.backend.Lesson5;

public class MyMath {
    // Tổng 2 số nguyên int
    public int sum(int a, int b) {
        return a + b;
    }

    // Tổng 2 số kiểu byte
    public int sum(byte a, byte b) {
        return a + b; // Trả về int vì byte + byte sẽ được nâng cấp thành int
    }

    // Tổng 2 số kiểu float
    public float sum(float a, float b) {
        return a + b;
    }
}
