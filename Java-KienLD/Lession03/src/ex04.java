import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        // Question01
        String str = "abc abc";
        int x = str.length();
        System.out.printf("%d%n", x);

        // Question02

        String str2 = "abc";
        String str3 = "xyz";

        System.out.println(str2 + "" + str3);

        // Question04

        String str4 = "abc";
        for (int i = 0; i < str4.length(); i++) {
            System.out.println("Ký tự thứ" + i + " " + str4.charAt(i));
        }
        // Question05

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao ho: ");
//        String str5 = scanner.nextLine();
//        System.out.println("Nhap vao ten: ");
//        String str6 = scanner.nextLine();
//        System.out.println("Ho va ten: " + str5 + " " + str6);

        // Quesion07

        System.out.println("Nhap vao ho ten: ");
        String hoten = scanner.nextLine();
        String FormantHoten = hoten.trim();
        String[] arrs  = FormantHoten.split("\\s+");
        for ( String arr: arrs) {
            String word = arr.substring(0, 1).toUpperCase() + arr.substring(1);
            System.out.print(word + " ");

        }

        //







    }
}
