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

        //question5
        System.out.print("Nhập họ của bạn: ");
        String hocuaten = scanner.nextLine().trim();
        System.out.print("Nhập tên của bạn: ");
        String tencuaten = scanner.nextLine().trim();
        String fullName = hocuaten + " " + tencuaten;
        System.out.println("Họ và tên đầy đủ của bạn là : " + fullName);

        //question6
        System.out.print("Nhập họ và tên của bạn: ");
        String hovaten2 = scanner.nextLine().trim();

        String[] namePart = hovaten2.split("\\s+");
        String lastName = namePart[0];
        String firstName = namePart[namePart.length - 1];
        String middleName = "";

        if(namePart.length > 2) {
            for(int i = 1; i < namePart.length - 1; i++) {
                middleName += namePart[i] + "";
            }
            middleName = middleName.trim();
        }else{
            middleName = "Không có";
        }
        System.out.println("Họ: "+ lastName);
        System.out.println("Tên đệm: " + middleName);
        System.out.println("Tên: " + firstName);

        //question7
        System.out.print("Nhập vào họ và tên đầy đủ của bạn: ");
        String hotenq7 = scanner.nextLine();
        String hotenq7trimmed = hotenq7.trim();
        String hotenq7trimmedviethoa = viethoachudau(hotenq7);

        System.out.println("Câu a: " + hotenq7trimmed);
        System.out.println("Câu b: " + hotenq7trimmedviethoa);

        //question10
        System.out.print("Chuỗi đảo ngược 1: ");
        String chuoidao1 = scanner.nextLine().trim();
        System.out.print("Chuỗi đảo ngược 2: ");
        String chuoidao2 = scanner.nextLine().trim();

        String chuoidao2reverse = new StringBuilder(chuoidao2).reverse().toString();
        if(chuoidao1.equals(chuoidao2reverse)) {
            System.out.println("Đây là 2 chuỗi đảo ngược nhau");
        }
        else{
            System.out.println("Đây không phải 2 chuỗi đảo ngược nhau");
        }

        //question11
        System.out.print("Nhập một chuỗi để tìm ký tự: ");
        String chuoiq11 = scanner.nextLine().trim();
        System.out.print("Nhập kí tự cần tìm: ");
        String kituq11 = scanner.nextLine().trim();

        char target = kituq11.charAt(0);
        int count = 0;
        for(int i = 0; i < chuoiq11.length(); i++){
            if (chuoiq11.charAt(i) == target){
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của '" + target + "': " + count);

        //question12
        System.out.print("Đảo ngược chuỗi sử dụng vòng lặp. Nhập chuỗi: ");
        String chuoiq12 = scanner.nextLine().trim();
        String reverse = "";
        for (int i = chuoiq12.length() -1 ; i>=0; i--){
            reverse += chuoiq12.charAt(i);
        }
        System.out.println("Chuỗi đảo ngược: " + reverse);

        //question13
        System.out.print("Nhập vào chuỗi để kiểm tra có số hay không: ");
        String chuoiq13 = scanner.nextLine().trim();

        boolean hasDigit = false;
        for (int i = 0 ; i<chuoiq13.length(); i++){
            if(Character.isDigit(chuoiq13.charAt(i))){
                hasDigit = true;
                break;
            }
        }
        if(!hasDigit){
            System.out.println("Chuỗi có chứa ký tự số");
        }
        else{
            System.out.println("Chuỗi không có chứa ký tự số");
        }

        //question14
        System.out.print("Nhập vào chuỗi q14: ");
        String chuoiq14 = scanner.nextLine().trim();
        System.out.print("Nhập vào kí tự cần chuyển đổi: ");
        char kitugocq14 = scanner.nextLine().charAt(0);
        System.out.print("Nhập vào kí tự chuyển đổi: ");
        char kituchuyenq14 = scanner.nextLine().charAt(0);

        String chuoimoi = chuoiq14.replace(kitugocq14,kituchuyenq14);
        System.out.println("Chuỗi mới q14: " + chuoimoi);


    }

    //question3
    public static String viethoachudau(String name){
        String[] words = name.trim().toLowerCase().split("\\s+");
        StringBuilder capital = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capital.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return capital.toString().trim();
    }
}
