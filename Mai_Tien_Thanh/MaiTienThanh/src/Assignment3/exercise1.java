import java.util.Random;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //question 1
        float luong_acc1 = 5240.5f;
        float luong_acc2 = 10970.055f;

        int luong_acc1_int = Math.round(luong_acc1);
        int luong_acc2_int = Math.round(luong_acc2);
        System.out.println("Lương account 1 (làm tròn): "+ luong_acc1_int);
        System.out.println("Lương account 2 (làm tròn): "+ luong_acc2_int);


        //question 2
        Random rand = new Random();

        int random_a =rand.nextInt(100000);

        String five_digit_a = String.format("%05d", random_a);

        System.out.println("Số ngẫu nhiên 5 chữ số: " + five_digit_a);

        //question 3
        int sodu = random_a % 100;
        System.out.println("2 chữ số cuối của số ngẫu nhiên: " + sodu);

        //question 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhâp số nguyên b: ");
        int b = scanner.nextInt();

        double thuong = thuong(a,b);
        System.out.println("Thương của "+ a +" chia "+ b +" là " + thuong);
    }

    public static double thuong(int a, int b) {
        if (b == 0){
            System.out.println("Không thể chia cho 0!");
            return 0;
        }
        else {
            return (double) a / b;
        }
    }
}
