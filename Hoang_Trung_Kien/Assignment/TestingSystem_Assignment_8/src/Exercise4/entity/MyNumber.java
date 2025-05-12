package Exercise4.entity;

public class MyNumber <N extends Number> {
    private N number;

    public MyNumber(N number) {
        this.number = number;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "number=" + number +
                '}';
    }
}
