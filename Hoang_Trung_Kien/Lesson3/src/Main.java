import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
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

        System.out.println(str1.length());
        System.out.println(str1.toLowerCase()); //toUpperCase();
        System.out.println(str1.charAt(2));
        System.out.println(str1.concat(" xinh dep")); //Cong chuoi
        System.out.println(str1.substring(5)); //From 5 to end.
        System.out.println(str1.substring(4, 8)); // from 4 to 8.
//        Kiem tra chuoi co ton tai khong :
        System.out.println(str1.contains("Kh")); // tra ve boolean
        System.out.println(str1.indexOf("Kh")); // tra ve index dau tien (-1 neu khong ton tai)
//        thay the chuoi con thanh chuoi moi
        System.out.println(str1.replace("Khanh Linh", "Trung Kien"));
//        thay the su dung regex (bieu thuc chinh quy)
        System.out.println(str1.replaceAll("\\s+", " "));
//        \\s : dấu cách
//        \\s+: 1 hoặc nhiều dấu cách
//        \\d: số
//        \\w: số hoặc kí tự (không dấu)

//        Kiểm tra xem chuỗi có tồn tại chữ số không.
        System.out.println(str1.matches(".*[0-9].*"));
        System.out.println(str1.matches(".*[a-z].*"));
        // . means any char, * means 0 or many, + means 1 or many
        // .* means 0 or many char
        System.out.println(str1.matches(".*@.*"));
        System.out.println(str1.matches(".*[abc].*"));
        // a hoac b hoac c

        String[] strs = str1.split("\\s+");
        for (String s : strs) {
            System.out.println(s);
        }

        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "nguyen van a";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "nguyen van b";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "nguyen van c";
        Department department4 = new Department();
        department4.departmentId = 2;
        department4.departmentName = "nguyen van d";
        Department[] departments = {department1, department2, department3, department4};
        System.out.println(department1.equals(department2));


        Integer[] array = {1, 4, 6, 2, 5, 3};
        Arrays.sort(array);
        Arrays.sort(array, Comparator.reverseOrder()); // comparator chỉ sử dụng cho wrapper class.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                if (o1.departmentId == o2.departmentId) {
                    return o1.departmentName.compareTo(o2.departmentName);
                }
                return o1.departmentId - o2.departmentId;
            }
        });
        for (Department department : departments)
            System.out.println(department);
    }

}