package Exercise2;

public class Q1_and_Q2 {
    public static void main(String[] args) {
        try {
            divide(5, 0);
        } catch (Exception e) {
            System.out.println("cannot divide 0");
        } finally {
            System.out.println("divide completed!");
        }
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
