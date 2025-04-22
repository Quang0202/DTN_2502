package BackEnd;

public class MyMath {
    final static double PI = 3.14159265358979323846;
    public int sum(int a) {
        return (int) (a +PI);
    }

    public static void main(String[] args) {
        MyMath math = new MyMath();
        math.sum(10);
        System.out.println(math.sum(20));
    }
}
