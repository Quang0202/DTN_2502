package entity;

public class MyNumber<N extends Number> {
    private N value;

    public MyNumber(N value) {
        this.value = value;
    }

    public void printNumber() {
        System.out.println("Number: " + value);
    }
}