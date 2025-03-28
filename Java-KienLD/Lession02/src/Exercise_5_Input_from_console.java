import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise_5_Input_from_console {
    static Department createDepartment() {
        Department d = new Department();
        Scanner sc = new Scanner(System.in);
        d.department_name = sc.nextLine();
        d.department_id = sc.nextInt();
        return new Department();
    };
    static Account createAccount02() {
        // Deaprtment
        Department department1 = new Department();
        department1.department_id = 1;
        department1.department_name = "PKT";
        //Position
        Position position1 = new Position();
        position1.position_id = 1; position1.position_name = "Dev";
        //Group
        Account account1 = new Account();
        Account account2 = new Account();
        Group group1 = new Group();
        Group group2 = new Group();
        group1.group_id = 1; group1.group_name = "Development";
        group1.creator = "nguyen"; group1.CreateDate = LocalDateTime.now();
        Account[] accounts = { account1 };
        group1.accounts = accounts;

        group2.group_id = 2; group2.group_name = "System";
        group2.creator = "kienld"; group1.CreateDate = LocalDateTime.now();
        Account[] account02 = { account1 };
        group1.accounts = account02;



        // Account

        account1.account_id = 1; account1.Email = "nguyen@gmail.com"; account1.Username = "nguyen"; account1.Full_Name = "Nguyen Tran"; account1.department = department1;
        account1.position  = position1; account1.CreateDate = LocalDateTime.now(); Group[] groups = {group1};account1.groups = groups;
        account2.account_id = 2; account2.Email = "kien@gmail.com"; account2.Username = "kienld"; account2.Full_Name = "Lai Duc Kien"; account2.department = department1;
        account2.position  = position1; account2.CreateDate = LocalDateTime.now(); Group[] group02 = {group2};account2.groups = group02;
        //
        Scanner sc = new Scanner(System.in);
        Account[] countaccounts = { account1, account2 };
        for (int i = 0; i < countaccounts.length; i++) {
            System.out.println("Username" +  (i +1) + " " + countaccounts[i].Username);
        }
        System.out.println("Nhập username account: ");
        String username = sc.nextLine();
        for (int i = 0; i < countaccounts.length; i++) {
            String GroupName = "";
            for (int j = 0; j < countaccounts[i].groups.length; j++) {
                GroupName += countaccounts[i].groups[j].group_name;
            }
            System.out.println("GroupName" +  (i +1) + " " + GroupName);
        }
        String groupname = sc.nextLine();

        // Nhâp vào username và gropname// Sau đó thêm account vào group đó
        // Group 2 đang có account2 hãy thêm account1 vào group2
        //  CHưa làm tiếp được
        Account[] countaccounts2 = { account1, account2 };
        Group[] countgroups = { group1, group2 };


        for ( int i =0; i < countaccounts2.length; i++) {

            if ( username.equals(countaccounts2[i].Username)) {
                if ( groupname == countgroups[i].group_name ) {
                    System.out.println("Group này đã có account này rồi!");
                }
                else {



                }
            }
            else {
                System.out.println("không có tài khoản nào tồn tại với user này!");
            }



        }





        return new Account();

    };
    static Account createaccount() {
        // Group
        Group group1 = new Group();
        group1.group_id = 1; group1.group_name = "Development";
        //Position

        Position position1 = new Position();
        position1.position_id = 1; position1.position_name = "Dev";
        // Department
        Department department1 = new Department();
        department1.department_id = 1;
        department1.department_name = "PKT";

        // Account

        Account account = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập account ID: ");
        account.account_id = sc.nextInt();

        System.out.println("Nhập Email: ");
        account.Email = sc.next();

        System.out.println("Nhập UserName: ");
        account.Username = sc.next();
        sc.nextLine();

        System.out.println("Nhập FullName: ");
        account.Full_Name = sc.nextLine();

        System.out.println("Nhập DepartmentID: ");
        int departmentid = sc.nextInt();
        department1.department_id = departmentid;
        account.department = department1;

        System.out.println("Nhập PositionID: ");
        int positionid = sc.nextInt();
        if (positionid == 1) {
            position1.position_name = "Dev";
            account.position = position1;
        }
        else if (positionid == 2) {
            position1.position_name = "test";
            account.position = position1;
        }
        else if (positionid == 3) {
            position1.position_name = "sc";
            account.position = position1;
        }
        else if (positionid == 4) {
            position1.position_name = "pm";
            account.position = position1;
        }
        sc.nextLine();
        System.out.println("Nhập Group mà Account này thuộc về định dạng ,group2: ");
        System.out.println("CreateDate: ");
        account.CreateDate = LocalDateTime.now();

        return account;

    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // Question01
//        System.out.println("Question01");
//        System.out.println("Haỹ nhập vào 3 số nguyên ");
//        int so1 = sc.nextInt();
//        int so2 = sc.nextInt();
//        int so3 = sc.nextInt();
//
//        System.out.println("Ba số nguyên vừa nhập là: " + so1 + " " + so2+ " " + so3);
//        // Question02
//        System.out.println("Question02");
//        System.out.println("Haỹ nhập vào 2 số thực ");
//        Float f1 = sc.nextFloat();
//        Float f2 = sc.nextFloat();
//        System.out.println("2 số thực vừa nhập là: " + f1 + " " + f2);
//
//        // Question03 Viết lệnh cho phép người dùng nhập họ và tên
//        System.out.println("Question03");
//        System.out.println("Hãy nhập vào họ và tên:  ");
//        sc.nextLine();
//        String hoten = sc.nextLine();
//        System.out.println("họ và tên là: " +hoten);
//
////      //Question5:
//        Account account = createaccount();
//        System.out.println(account);
//
//        // Question 8
//
//        System.out.println("Question08");
//
//        System.out.println("Nhập chức năng cần sử dụng: ");
//        int inputchucnang = sc.nextInt();
//        if (inputchucnang == 1) {
//            Account account08 = createaccount();
//            System.out.println(account08);
//
//        }
//        else if (inputchucnang == 2) {
//            Department department08 = createDepartment();
//            System.out.println(department08);
//        }
//        else {
//            System.out.println("Nhập sai r cưng");
//        }

        // Question09
        System.out.println("Question09");

        Account account = createAccount02();
//        System.out.println(account);






    }
}