import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {
    static ArrayList<Account> accounts = new ArrayList<>();
    static ArrayList<Department> departments = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        // Vòng lặp cho phép người dùng nhập lại nếu chọn sai
        while (true) {
            System.out.println("\nMời bạn nhập vào chức năng muốn sử dụng:");
            System.out.println("1. Tạo Account");
            System.out.println("2. Tạo Department");
            System.out.print("Lựa chọn của bạn: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Xử lý trôi lệnh

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    createDepartment(scanner);
                    break;
                default:
                    System.out.println("Mời bạn nhập lại!");
                    continue; // Quay lại đầu vòng lặp
            }

            // Hỏi người dùng có muốn tiếp tục không
            System.out.print("Bạn có muốn tiếp tục? (y/n): ");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("y")) {
                System.out.println("Chương trình kết thúc!");
                break;
            }
        }

        scanner.close();
    }

    // Hàm tạo Account
    private static void createAccount(Scanner scanner) {
        Account ac = new Account();
        System.out.print("Nhập ID tài khoản: ");
        ac.id = scanner.nextInt();
        scanner.nextLine(); // Xử lý trôi lệnh
        System.out.print("Nhập email: ");
        ac.email = scanner.nextLine();
        System.out.print("Nhập tên tài khoản: ");
       ac.userName = scanner.nextLine();
        System.out.print("Nhập tên Ful' khoản: ");
        ac.fullName = scanner.nextLine();



        System.out.println("✅ Tài khoản đã được tạo thành công!\n");
        System.out.println( ac.toString());
    }

    // Hàm tạo Department
    private static void createDepartment(Scanner scanner) {
        Department dp1 = new Department();
        System.out.print("Nhập ID phòng ban: ");
        dp1.id = scanner.nextInt();
        scanner.nextLine(); // Xử lý trôi lệnh
        System.out.print("Nhập tên phòng ban: ");
      dp1.DepartmentName = scanner.nextLine();


        System.out.println("✅ Phòng ban đã được tạo thành công!");
        System.out.println(dp1.toString());
    }
}
