package vti.be.assignmentday1_2;

import vti.data.Account;
import vti.data.Department;
import vti.data.Group;
import vti.data.Position;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        //Department
        Department department1 = new Department(1, "pkt");
        Department department2 = new Department(2, "gtelpay");
        Department department3 = new Department(3, "vpa");
        // Position
        Position position1 = new Position(1, "dev");
        Position position2 = new Position(2, "sys");
        Position position3 = new Position(3, "net");
        // Group


        Account account1 = null;
        Group group1 = null;
        Account account2 = null;
        Group group2 = null;
        Account account3 = null;
        Group group3 = null;
        Group[] group01 = { group1 };
        Account[] account01 = { account1 };
        Group[] group02 = { group1, group2, group3 };
        Account[] account02 = { account2 };
        Group[] group03 = { group1 ,group2 ,group3};
        Account[] account03 = { account3 };
        group1 = new Group(1, "dev", account1, LocalDateTime.now(), account01);
        group2 = new Group(2, "sys", account2, LocalDateTime.now(), account02);
        group3 = new Group(3, "test", account3, LocalDateTime.now(), account03);
        // Account
        account1 = new Account(1, "laiduckien28@gmail.com", "laikien",
                "laiduckien", department1 , position1, LocalDateTime.now(), group01);
        account2 = new Account(2, "laiduckien28@gmail.com", "laikien",
                "ngoducthien", department2, position2, LocalDateTime.now(), group02);
        account3 = new Account(5, "laiduckien28@gmail.com", "laikien",
                "trandonguyenmoi", department3, position3, LocalDateTime.now(), group03);

        //A2E1Q1
        System.out.println("A2E1Q1");
        if (account2.department == null) { System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + " " + account2.department.department_name);
        }
        //A2E2Q2
        System.out.println("A2E1Q2");
        if ( account2.groups.length == 0 ) {
            System.out.println("Nhân viên này chưa có group");
        }
        else if ( account2.groups.length == 1 || account2.groups.length == 2 ) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        }
        else if ( account2.groups.length == 3 ) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");

        }
        else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }


        //A2E2Q3
        System.out.println("A2E1Q3");
        System.out.println( account1.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là" + " " + account1.department.department_name);
        //A2E2Q4
        System.out.println("A2E1Q4");
        System.out.println( account1.position.position_name.toLowerCase() == "dev" ? "Đây là Developer" : "Người này không phải là Developer");


        //A2W2Q5
        System.out.println("A2E1Q5");
        int accountnumber = account01.length;

        switch(accountnumber) {
            case 0:
                System.out.println("Nhóm không  thành viên");
                break;
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }


        //A2W2Q6
        System.out.println("A2E1Q6");
        int groupnumber = account2.groups.length;
        switch(groupnumber) {
            case 0: System.out.println("Nhân viên này chưa có group"); break;
            case 1: System.out.println("Group của nhân viên này là Java Fresher, C# Fresher"); break;
            case 2: System.out.println("Group của nhân viên này là Java Fresher, C# Fresher"); break;
            case 3: System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group"); break;
            default: System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");

        }
        System.out.println("A2E1Q7");
        String positionaccount1 = account1.position.position_name.toLowerCase();
        switch(positionaccount1) {
            case "dev":
                System.out.println("Đây là Developer"); break;
                default: System.out.println("Người này không phải là Developer");
        }

        System.out.println("A2E1Q8");
        Account[] accounts = { account1, account2, account3 };

        for( Account account : accounts) {
            System.out.println(account);
        }
        System.out.println("A2E1Q9");
        Department[] departments = { department1, department2 };
        for( Department department : departments) {
            System.out.println(department);
        }
        System.out.println("A2E1Q10");
        for ( int i = 0 ; i < accounts.length ; i++ ) {
            int j = i+1;
            System.out.println("Thông tin account thứ: " +  j );
            System.out.println("Email:" + " " + accounts[i].Email);
            System.out.println("FullName:" + " " + accounts[i].Full_name);
            System.out.println("DeapartmentName:" + " " + accounts[i].department.department_name);
        }

        System.out.println("A2E1Q11");
        for ( int i = 0 ; i < departments.length ; i++ ) {
            int j = i+1;
            System.out.println("Thông tin departments thứ: " +  j );
            System.out.println("Id:" + " " + departments[i].department_id);
            System.out.println("Name:" + " " + departments[i].department_name);
        }

        System.out.println("A2E1Q12");
        for ( int i = 0 ; i < 2 ; i++ ) {
            int j = i+1;
            System.out.println("Thông tin departments thứ: " +  j );
            System.out.println("Id:" + " " + departments[i].department_id);
            System.out.println("Name:" + " " + departments[i].department_name);
        }


        System.out.println("A2E1Q13");

        for ( int m = 0 ; m < accounts.length ; m++ ) {
            if ( m == 1) {
                System.out.println(" ");
            }
            else  {
                int k = m+1;
                System.out.println("Thông tin account thứ: " +  k );
                System.out.println("Email:" + " " + accounts[m].Email);
                System.out.println("FullName:" + " " + accounts[m].Full_name);
                System.out.println("DeapartmentName:" + " " + accounts[m].department.department_name);
            }

        }


        System.out.println("A2E1Q14");

        for ( int m = 0 ; m < accounts.length ; m++ ) {
            if ( accounts[m].account_id >=4 ) {
                System.out.println(" ");
            }
            else  {
                int k = m+1;
                System.out.println("Thông tin account thứ: " +  k );
                System.out.println("Email:" + " " + accounts[m].Email);
                System.out.println("FullName:" + " " + accounts[m].Full_name);
                System.out.println("DeapartmentName:" + " " + accounts[m].department.department_name);
            }

        }

        System.out.println("A2E1Q15");
        for ( int m = 0 ; m <= 20 ; m++ ) {
            if ( m %2 == 0) {
                System.out.println(m);
            }
        }

        System.out.println("A2E1Q16");
        int n = 0;
        while (n < accounts.length) {
            int j = n+1;
            System.out.println("Thông tin account thứ: " +  j );
            System.out.println("Email:" + " " + accounts[n].Email);
            System.out.println("FullName:" + " " + accounts[n].Full_name);
            System.out.println("DeapartmentName:" + " " + accounts[n].department.department_name);

            n = n+1;
        }

        System.out.println("A2E1Q17");
        int y =0;
        while (y < accounts.length) {
            int m = y+1;
            if (accounts[y].account_id >=4) {
                break;
            }
            System.out.println("Thông tin account thứ: " +  m );
            System.out.println("Email:" + " " + accounts[y].Email);
            System.out.println("FullName:" + " " + accounts[y].Full_name);
            System.out.println("DeapartmentName:" + " " + accounts[y].department.department_name);
            y = y+1;
        }
        System.out.println("A2E5Q5");
//        createaccount();
        System.out.println("A2E5Q6");
//        createdepartment();
        Question08();

    }
    public static void createaccount() {
        System.out.println("Day la chuong trinh tao account");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Accountid"); int id = input.nextInt(); input.nextLine();
        System.out.println("Nhap Email"); String email = input.nextLine(); input.nextLine();
        System.out.println("Nhap Username"); String username = input.nextLine();
        System.out.println("Nhap Full name"); String full_name = input.nextLine();
        System.out.println("Nhap Department name"); String department_name = input.nextLine();
        System.out.println("Nhap Position 1.Position.Dev, 2.Position.Test, " +
                "3.Position.ScrumMaster, 4.Position.PM"); int positionint = input.nextInt();
                String position_name = null;
        switch(positionint) {
            case 1: position_name = "dev"; break;
            case 2: position_name = "test"; break;
            case 3: position_name = "scrummaster"; break;
            case 4: position_name = "pm"; break;
        }
        Account account1 = null; Account[] account01 = { account1 };
        Group group1 = null; group1 = new Group(1, "dev", account1, LocalDateTime.now(), account01);
        Group[] group01 = { group1 };
        
        
        account1 = new Account(id, email, username, full_name, new Department(id, department_name) , new Position(id, position_name), LocalDateTime.now(), group01  );
        System.out.println(account1);
    }

    public static void createdepartment() {
        System.out.println("Day la chuong trinh tao department");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Departmentid"); int id = input.nextInt(); input.nextLine();
        System.out.println("Nhap DeparrtmentName"); String departmentname = input.nextLine();
        Department department = new Department(id, departmentname);
        System.out.println(department);
    }

    public static void Question08() {
        System.out.println("Nhap Chuc Nang Muon Su Dung: ");
        Scanner input = new Scanner(System.in);

        while (true) {
            int choice = input.nextInt();
            if (choice == 1) {
                createaccount();
                break;
            } else if (choice == 2) {
                createdepartment();
                break;
            } else {
                System.out.println("Nhap Lai: ");
            }

        }
    }







}
