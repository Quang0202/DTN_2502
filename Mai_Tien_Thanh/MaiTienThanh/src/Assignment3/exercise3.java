package Assignment3;

public class exercise3 {
    public static void main(String[] args) {
        //question 1
        int luong = 5000;
        float floatluong = (float)luong;

        System.out.printf("Lương : %.2f\n", floatluong);

        //question 2
        String a = "1234567";
        int sodoi = Integer.parseInt(a);
        System.out.println(sodoi);

        String b = "1234567";
        Integer soInteger = Integer.valueOf(b);
        int soInt = soInteger.intValue();

        System.out.println(soInt);
    }
}
