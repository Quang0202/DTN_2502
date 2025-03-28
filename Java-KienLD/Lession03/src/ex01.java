import java.util.Random;

public class ex01 {
    public  static  int question04(int a, int b) {
        int c = a/b;
        return c;

    }
    public static void main(String[] args) {
        // Question01
        float Accoun01 = 5240.5f;
        float Account02 = 5467.4244f;
        int acc1 = (int) Accoun01;
        int acc2 = (int) Account02;

        System.out.println(acc1);
        System.out.println(acc2);

        // Question02
        Random rand  = new Random();
        int number = rand.nextInt(1500);
        String formattedNumber = String.format("%05d", number);
        System.out.println(formattedNumber);

        // Question03

        int number2 = Integer.parseInt(formattedNumber);
        int number3 = number2%100;
        System.out.println(number3);

        // Q4
        System.out.println(question04(6,6));











    }
}
