import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        float c = (float)a / b;
        System.out.println(c);

        int[] ar = {1, 2, 3, 4, 5};
        char[] arr = new char[5];
        String[] str = new String[5];
        for (char i : arr) {
            System.out.println(i);
        }

        for (String i : str) {
            System.out.println(i);
        }

        Integer num = 10;
        int d = num;
        int e = num.intValue();
        double numd = num.doubleValue();
        double numd2 = num;
        Integer num2 = Integer.valueOf(d);
        Integer num3 = d;

        String test = num2.toString(); //chi convert tu wrapper class Integer, khong the convert tu int.
        String str1 = "Hoang Khanh Linh";
        String str2 = new String("Hoang Khanh Linh");

        if (str1.equals(str2)) {
            System.out.println("bang nhau");
        } else System.out.println("Khong bang nhau");
        //Nen dung .equals
        if (str1 == str2) {
            System.out.println("bang nhau");
        } else System.out.println("Khong bang nhau");
    }
}