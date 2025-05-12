package Exercise4.entity;

public class MyMath <T extends Number>{
    public double sum(T... args) {
        double result = 0;
        for (T a : args) {
            result += a.doubleValue();
        }
        return result;
    }

    public double sub(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public double power(T a, T b) {
        return Math.pow(a.doubleValue(), b.doubleValue());
    }
}
