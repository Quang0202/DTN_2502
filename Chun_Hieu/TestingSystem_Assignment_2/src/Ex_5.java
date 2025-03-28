import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_5 {
//    class Group {
//        String groupName;
//        List<Account> members = new ArrayList<>();
//
//        public Group(String groupName) {
//            this.groupName = groupName;
//        }
//
//        public void addMember(Account account) {
//            members.add(account);
//            System.out.println("Đã thêm tài khoản " + account.username + " vào group " + groupName);
//        }
//
//        public void displayMembers() {
//            System.out.println("Thành viên trong nhóm " + groupName + ":");
//            for (Account acc : members) {
//                System.out.println("- " + acc.username);
//            }
//        }
//    }

//    class Account {
//        public String fullName;
//        String username;
//        Position position;
//        List<Group> groups = new ArrayList<>();
//
//        public Account(String username, Position position) {
//            this.username = username;
//            this.position = position;
//        }

//        public void joinGroup(Group group) {
//            groups.add(group);
//            group.addMember(this);
//        }
//  }
    enum Position{
        Dev, Test, ScrumMaster, PM;
    }
    public static Account createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tạo Account");
        Account account = new Account();
        System.out.println("Nhập vào AccountName");
        account.fullName = sc.nextLine();
        System.out.println("Nhập Position (1: Dev, 2: Test, 3: ScrumMaster, 4: PM):");
        int positionInput = sc.nextInt();
        sc.nextLine();

        switch (positionInput) {
            case 1: account.position = String.valueOf(Position.Dev);
                break;
            case 2: account.position = String.valueOf(Position.Test);
            break;
            case 3: account.position = String.valueOf(Position.ScrumMaster);
            break;
            case 4: account.position = String.valueOf(Position.PM);
            break;
            default: System.out.println("Lựa chọn không hợp lệ, mặc định chọn Dev");
        }
        return account;
    }
    public static Department createDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tạo Department");
        Department department = new Department();
        System.out.println("Nhập vào departmentID");
        department.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào departmentName");
        department.name = sc.nextLine();
        return department;
    }
    public static void main(String[] args) {
//        // Question 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.println("Số thứ nhất: " + num1);
        sc.nextLine();
        System.out.println("Nhập số thứ 2:" );
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Số thứ hai: " + num2);
        System.out.println("Nhập số thứ 3:" );
        int num3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Số thứ ba: " + num3);

        // Question 2
        System.out.println("Nhập số thực thứ nhất: ");
        double num4 = sc.nextDouble();
        System.out.println("Số thực thứ nhất: " + num4);
        sc.nextLine();
        System.out.println("Nhập số thực thứ hai: ");
        double num5 = sc.nextDouble();
        System.out.println("Số thực thứ hai: " + num5);
        sc.nextLine();

        //Question3
        System.out.println("Nhập họ và tên: ");
        String line = sc.nextLine();
        System.out.println("Họ và tên là: " + line);
        sc.nextLine();

        //Question 4
        System.out.println("Nhập ngày sinh: ");
        int num6 = sc.nextInt();
        System.out.println("Nhập tháng sinh: ");
        int num7 = sc.nextInt();
        System.out.println("Nhập năm sinh: ");
        int num8 = sc.nextInt();
        System.out.println("Ngày tháng năm sinh: " +num6 +"/" + num7 +"/" + num8);

//         Question 5
//             Question 5
//        Account account = createAccount();
//        System.out.println(account);
//             Question 6
//        Department department = createDepartment();
//        System.out.println(department);
        // Question 7
        while (true) {
            System.out.println("Nhập vào 1 số chẵn:");
            int choice = sc.nextInt();
            if (choice %2 == 0) {
                System.out.println("Số vừa nhập là: " + choice);
                break;
            } else {
                System.out.println("Vui lòng nhập lại");
                sc.next();
            }
        }
        // Question 8
        while (true){
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
            System.out.println("1 - Tạo Account");
            System.out.println("2 - Tạo Department");
            int choice2 = sc.nextInt();
            sc.nextLine();
            if (choice2 == 1){
                Account account = createAccount();
                System.out.println(account);
                break;
            } else if (choice2 == 2){
                Department department = createDepartment();
                System.out.println(department);
                break;
            } else {
                System.out.println("Mời nhập lại");
                sc.next();
            }
        }

        // Question 9


    }
}
