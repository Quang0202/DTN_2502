//import java.time.LocalDate;
//import java.util.Scanner;
//
//public class ManCity {
//    public static void main(String[] args) {
//
////        Question 5:
////        Viết lệnh cho phép người dùng tạo account (viết thành method)
////        Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
////        chương trình sẽ chuyển thành Position.Dev, Position.Test,
////                Position.ScrumMaster, Position.PM
//
//        Scanner scanner = new Scanner(System.in);
//
//        // Nhập thông tin Department
//        System.out.print("Nhập ID phòng ban: ");
//        int deptId = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Nhập tên phòng ban: ");
//        String deptName = scanner.nextLine();
//        Department department = new Department(deptId, deptName);
//
//        // Nhập thông tin Position
//        System.out.print("Nhập ID vị trí: ");
//        int posId = scanner.nextInt();
//        System.out.print("Nhập số vị trí (1-4) [1.Dev, 2.Test, 3.ScrumMaster, 4.PM]: ");
//        int posValue = scanner.nextInt();
//        PositionName positionName = PositionName.fromInt(posValue);
//        Position position = new Position(posId, positionName);
//
//        // Nhập thông tin Account
//        System.out.print("Nhập ID tài khoản: ");
//        int accId = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Nhập email: ");
//        String email = scanner.nextLine();
//        System.out.print("Nhập tên tài khoản: ");
//        String userName = scanner.nextLine();
//        System.out.print("Nhập họ và tên: ");
//        String fullName = scanner.nextLine();
//
//        // Nhập ngày tạo tài khoản
//        LocalDate createDate = LocalDate.now();
//
//        // Nhập thông tin Group
//        System.out.print("Bạn có muốn thêm nhóm? (yes/no): ");
//        String groupChoice = scanner.nextLine();
//        Group[] groups = null;
//        if (groupChoice.equalsIgnoreCase("yes")) {
//            System.out.print("Nhập số lượng nhóm: ");
//            int numGroups = scanner.nextInt();
//            scanner.nextLine();
//            groups = new Group[numGroups];
//            for (int i = 0; i < numGroups; i++) {
//                System.out.print("Nhập ID nhóm " + (i + 1) + ": ");
//                int groupId = scanner.nextInt();
//                scanner.nextLine();
//                System.out.print("Nhập tên nhóm " + (i + 1) + ": ");
//                String groupName = scanner.nextLine();
//
//            }
//        }
//
//        // Nhập ngày tham gia nhóm
//        LocalDate joinDate = LocalDate.now();
//
//        // Khởi tạo Account
//        Account account = new Account(accId, email, userName, fullName, department, position, createDate, groups, joinDate);
//
//        // In thông tin Account
//        System.out.println("\n=== Thông tin tài khoản ===");
//        System.out.println(account);
//
//        scanner.close();
//    }
//
//}