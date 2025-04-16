package frontend;

public class Question2 {
    public static void main(String[] args) {
        try {
            float result = divide(7, 0);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide 0");
        }
        finally {
            System.out.println("divide completed!");
        }
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }
}
