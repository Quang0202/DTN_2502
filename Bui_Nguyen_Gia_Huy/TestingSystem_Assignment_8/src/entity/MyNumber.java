package entity;

public class MyNumber<N extends Number> {
    private N number;

    public MyNumber(N number) {
        this.number = number;
    }

    public N getNumber() {
        return number;
    }
}
