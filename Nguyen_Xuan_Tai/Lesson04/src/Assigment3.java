import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assigment3 {


    public static void main(String[] args) {

//        Question1();

//        Question2();

//        Question3();

//        Question4();

//        Ex2Q1();

//        Ex3Q1();

//        Ex3Q2();

//        Ex3Q3();

//        Ex4Q1();

//        Ex4Q2();

        Ex4Q3();
    }


    public static void Question1() {
        //Question1
        float Account1 = 5240.5f;

        float Account2 = 10970.055f;

        int Account3 =  (int)Account1;
        int Account4 = (int)Account2;
        System.out.printf(String.valueOf(Account3) + "\n");
        System.out.println(String.valueOf(Account4));
    }
    public static void Question2() {
        Random rand = new Random();
        int a = rand.nextInt(100000);
        System.out.printf("%05d\n" ,a);
    }
    public static void Question3() {
        Random rand = new Random();
        int a = rand.nextInt(100000);
        int b = a%100;
        System.out.printf(String.valueOf(b));
    }
    public static void Question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so a: ");
        int a = sc.nextInt();
        System.out.println("nhap vao so b: ");
        int b = sc.nextInt();
        System.out.println("gia tri thuong cua a va b a: " + a/b);
    }
    public static void Ex2Q1() {
        Account[] account = new Account[5];
        for (int i = 0; i < account.length; i++) {

            Account account1 = new Account();
            account1.setEmail("Email" + (i + 1));
            account1.setUsername("Username" + (i + 1));
            account1.setFullName("Full Name" + (i + 1));
            account1.setCreateDate(LocalDate.now());
            account[i] = account1;
            System.out.println(account1.toString());

        }
    }
        public static void Ex3Q1() {
            Integer a = 5000;
            float b =  (a);
            System.out.printf("%.2f" ,b);
        }
        public static void Ex3Q2() {
        String a = "123456";
        int b =Integer.parseInt(a);
            System.out.println(b);
        }
        public static void Ex3Q3() {
        Integer a = 1234567;
        int b = a.intValue();
        System.out.println(b);
        }
        public static void Ex4Q1() {
        String a = "Day la dai tieng     noi viet      nam    ta ";
            StringTokenizer token = new StringTokenizer(a);
            int w = token.countTokens();
            System.out.println("dem "+ w);
        }
        public static void Ex4Q2() {
        Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao so a: ");
        String a = sc.nextLine();
        System.out.println("nhap vao so b: ");
        String b = sc.nextLine();
            System.out.println("a va b  la :");
        String c = a+ " " +b ;
            System.out.println(" " + c);
        }
        public static void Ex4Q3() {
            Scanner scanner = new Scanner(System.in);

            // Nhập tên từ người dùng
            System.out.print("Nhập tên của bạn: ");
            String name = scanner.nextLine();

            // Tách tên thành các từ và viết hoa chữ cái đầu của mỗi từ
            String[] words = name.split("\\s+"); // Tách tên theo khoảng trắng
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                if (word.length() > 0) {
                    result.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ");
                }
            }

            // In ra tên đã được chỉnh sửa
            System.out.println("Tên của bạn là: " + result.toString().trim());

            // Đóng scanner
            scanner.close();
        }
    }

