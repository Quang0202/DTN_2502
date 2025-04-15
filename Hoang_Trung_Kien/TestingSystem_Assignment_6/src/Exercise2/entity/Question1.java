package Exercise2.entity;

public class Question1 {
    public static void main(String[] args) {
        try {
            float result = divide(7, 1);
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("cannot divide by 0");
        }
        finally {
            System.out.println("divide complete");
        }
//        float result = divide(7, 0);
//        if(result ==-1) {
//            System.out.println(result);
//        }
    }

    public static float divide(int a, int b) {
        return a / b;
//        try {
//            return a / b;
//        }
//        catch (ArithmeticException e) {
//            System.out.println("cannot divide by 0");
//        }
//        finally {
//            System.out.println("divide complete");
//        }
//        return -1;
    }
}
