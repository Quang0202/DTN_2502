package entity;

public class MyMath<T extends Number> {

    public double sum(T a, T b, T... others) {
        double result = a.doubleValue() + b.doubleValue();

        for (T value : others) {
            result += value.doubleValue();
        }

        return result;
    }

    public double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public double power(T base, T exponent) {
        return Math.pow(base.doubleValue(), exponent.doubleValue());
    }
}
