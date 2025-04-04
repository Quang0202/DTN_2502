import java.time.LocalDate;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//         question1();
//         question2();
//        question3();
//        question4();
//        ex2_question1();
//        ex3_question1();
//        ex3_question2();
//        ex3_question3();
//        ex4_question1();
//        ex4_question2();
//          ex4_question3();
 //         ex4_question4();
//          ex4_question5();
 //         ex4_question6();
 //         ex4_question7();
 //         ex4_question8_9();
 //         ex4_question10();
 //         ex4_question11();
//          ex4_question12();
//          ex4_question13();
//        ex4_question14();
//        ex4_question15();
 //       ex4_question16();
        Department[] departments = {
                new Department(1, "Marketing"),
                new Department(2, "Accounting"),
                new Department(3, "Sale"),
                new Department(4, "Boss of director"),
                new Department(5, "Waiting room")
        };
        ex5_question1(departments);
        ex5_question2(departments);
        ex5_question3(departments);
        ex5_question4(departments);
        ex5_question5(departments);
        ex5_question6(departments);
        ex5_question7(departments);
    }

    public static void question1(){
        float salary1 = 5240.5f ;
        float salary2 = 10970.055f ;

        Integer salary3 = (int)salary1 ;
        Integer salary4 = (int)salary2 ;
        System.out.println(salary3);
        System.out.println(salary4);
    }
    public static void question2(){
        Random rand = new Random();
        int randomNum = rand.nextInt(10000);
        String randomNumStr = String.format("%05d", randomNum);
        System.out.println(randomNumStr);
    }
    public static void question3() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100000);
        String formattedNumber = String.format("%05d", randomNumber);
        // C1
        String lastTwoDigitsStr = formattedNumber.substring(3);
        // C2
        int lastTwoDigitsInt = randomNumber % 100;

        System.out.println("Số ngẫu nhiên: " + formattedNumber);
        System.out.println("Hai số cuối (Cách 1 - String): " + lastTwoDigitsStr);
        System.out.println("Hai số cuối (Cách 2 - Chia dư): " + lastTwoDigitsInt);
    }
    public static void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = sc.nextInt();
        if (b == 0){
            System.out.println("Không thể chia cho 0");
        } else {
            System.out.println("Thương:" + a/b);
        }
    }

    public static void ex2_question1() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(
                    "Email" + (i+1),
                    "User name" + (i+1),
                    "Full name" + (i+1),
                    LocalDate.now()
            );
        }
        for(Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void ex3_question1() {
        Integer a = 5000;
        Float b = a.floatValue();
        System.out.printf("Luong: %.2f%n",b);
    }

    public static void ex3_question2() {
        String str = "1234567";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }

    public static void ex3_question3() {
        Integer num = Integer.valueOf("1234567");
        int c = num.intValue();
        System.out.println(c);
    }

    public static void ex4_question1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 xâu kí tự: ");
        String chuoi = sc.nextLine();
        chuoi = chuoi.trim();
        String[] chuoiArray = chuoi.split("\\s+");
        System.out.println("Só lượng từ trong chuỗi: " + chuoiArray.length);
    }

    public static void ex4_question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi S1: " );
        String S1 = sc.nextLine();
        System.out.println("Nhập chuỗi S2: ");
        String S2 = sc.nextLine();
        System.out.println("Chuỗi sau khi nối: "+ S1 +S2);
    }

    public static void ex4_question3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập tên: ");
        String ten = sc.nextLine();
//        String chinhsua = ten.substring(0,1).toUpperCase() + ten.substring(1).toLowerCase();
        System.out.println(capFirstLetter(ten));
        System.out.println(ten);

    }

    public static String capFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void ex4_question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        for (int i = 0; i < ten.length(); i++) {
            System.out.println("Kí tự thứ: " + (i + 1)+ " là " + String.valueOf(ten.charAt(i)).toUpperCase()); // có thể cộng thêm chuỗi rỗng để thay thees String.
        }
    }

    public static void ex4_question5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ: ");
        String Ho = sc.nextLine();
        System.out.println("Nhập tên: ");
        String Ten = sc.nextLine();
        System.out.println("Họ và tên: " +Ho+  " " +Ten);
    }

    public static void ex4_question6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine().trim();
        String[] parts = fullName.split("\\s+");

        System.out.println("Họ là: " + parts[0]);
        System.out.println("Tên đệm là: " + String.join(" ", Arrays.copyOfRange(parts, 1, parts.length - 1)));
        System.out.println("Tên là: " + parts[parts.length - 1]);
    }

    public static void ex4_question7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String fullName = sc.nextLine().trim().replaceAll("\\s+"," ");
        String[] parts = fullName.split(" ");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1).toLowerCase();
        }
        System.out.println("Chuỗi: " + String.join(" ", parts));
    }

    public static void ex4_question8_9() {
            String[] groups = {"Java Basic", "Java Advanced", "C++", "Python", "JavaScript"};
            for (String group : groups) {
                if (group.toLowerCase().contains("java")) {
                    System.out.println(group);
            }
        }
    }

    public static void ex4_question10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi s1: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập chuỗi s2: ");
        String s2 = sc.nextLine();

        String daos1 = new StringBuilder(s1).reverse().toString();
        System.out.println(s2.equals(daos1) ? "OK" : "KO");
    }

    public static void ex4_question11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        long count = chuoi.chars().filter(ch -> ch == 'a').count();
        System.out.println("Số lần xuất hiện của 'a': " + count);
    }

    public static void ex4_question12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine();
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }

    public static void ex4_question13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine();
        boolean kiemtra = input.matches(".*\\d.*");
        System.out.println(kiemtra ? "False" : "True");
    }

    public static void ex4_question14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine();
        System.out.println("Nhập kí tự muốn thay thế: ");
        char old = sc.next().charAt(0);
        System.out.println("Nhập kí tự thay thế: ");
        char new1 = sc.next().charAt(0);

        String mew2 = input.replace(old, new1);
        System.out.println(mew2);
    }
    public static void ex4_question15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine().trim().replaceAll("\\s+", " ");
        String[] words = input.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
    }
    }
    public static void ex4_question16() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        if (str.length() % n != 0) {
            System.out.println("KO");
            return;
        }

        for (int i = 0; i < str.length(); i += n) {
            System.out.println(str.substring(i, i + n));
        }
    }

    public static void ex5_question1(Department[] departments) {
        System.out.println(departments[0]);
    }

    public static void ex5_question2(Department[] departments) {
        for (Department dept : departments) {
            System.out.println(dept);
        }
    }

    public static void ex5_question3(Department[] departments) {
        System.out.println("Địa chỉ phòng ban thứ 1: " + departments[0].hashCode());
    }

    public static void ex5_question4(Department[] departments) {
        System.out.println(departments[0].getName().equalsIgnoreCase("Phòng A") ? "Đúng" : "Sai");
    }

    public static void ex5_question5(Department[] departments) {
        System.out.println(departments[0].equals(departments[1]) ? "Bằng nhau" : "Không bằng nhau");
    }

    public static void ex5_question6(Department[] departments) {
        Arrays.sort(departments, Comparator.comparing(Department::getName));
        for (Department dept : departments) {
            System.out.println(dept.getName());
        }
    }

    public static void ex5_question7(Department[] departments) {
        Arrays.sort(departments, Comparator.comparing(Department::getName, String.CASE_INSENSITIVE_ORDER));
        for (Department dept : departments) {
            System.out.println(dept.getName());
        }
    }
}