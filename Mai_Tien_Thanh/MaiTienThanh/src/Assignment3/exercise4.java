import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        //question1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");
        int wordCount = input.trim().isEmpty() ? 0 : words.length;
        System.out.println("Số lượng từ trong xâu là: " + wordCount);

        //question2
        System.out.print("Nhập chuỗi kí tự 1: ");
        String chuoi1 = scanner.nextLine();
        System.out.print("Nhập chuỗi kí tự 2: ");
        String chuoi2 = scanner.nextLine();

        String chuoinoi = chuoi1 + " " + chuoi2;
        System.out.println("Chuỗi kí tự đã nối: " + chuoinoi);

        //question3
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        String tenviethoa = viethoachudau(name);
        System.out.println("Tên sau khi viết hoa: " + tenviethoa);

        //question4
        System.out.print("Nhập tên của bạn: ");
        String name2 = scanner.nextLine().trim();
        System.out.println("Các kí tự trong tên: ");
        for(int i = 0; i < name2.length(); i++) {
            System.out.println("Kí tự " + (i + 1) + ": " + name2.charAt(i));
        }
    }

    //question3
    public static String viethoachudau(String name){
        String[] words = name.trim().toLowerCase().split("\\s+");
        StringBuilder capital = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Viết hoa chữ cái đầu và ghép lại thành chuỗi mới
                capital.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return capital.toString().trim();
    }
}
