import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.setDepartmentId(10);
        department.setDepartmentName("Sale");

        Department department1 = new Department();
        department1.setDepartmentId(20);
        department1.setDepartmentName("Giám đốc");

        Department department2 = new Department();
        department2.setDepartmentId(30);
        department2.setDepartmentName("Marketing");

        Position position = new Position();
        position.setPositionId(10);
        position.setPositionName("Dev");

        Position position1 = new Position();
        position1.setPositionId(20);
        position1.setPositionName("Test");

        Account account1 = new Account();
        account1.setAccountId(20);
        account1.setDepartment(department1);
        account1.setCreateDate(LocalDate.parse("2022-01-01"));
        account1.setUserName("levan");
        account1.setFullName("Lê Vân");
        account1.setEmail("levan@gmail.com");

        Account account2 = new Account();
        account2.setAccountId(30);
        account2.setCreateDate(LocalDate.parse("2024-01-01"));
        account2.setDepartment(department1);
        account2.setUserName("lethichau");
        account2.setFullName("Lê Thị Châu");
        account2.setPosition(position1);
        account2.setEmail("lethichau@gmail.com");

        Account[] accounts = {account1, account2};
//        question1();
//        question2();
        question3(accounts);
    }

    public static void question1(){
        Department department = new Department("Department 1");
        Department department2 = new Department();
        department2.setDepartmentId(1);
        department2.setDepartmentName("Department 2");
        department2.setAddress("HN");
        System.out.println("Department 1: " + department.toString());
        System.out.println("Department 2: " + department2.toString());
    }

    public static void question2(){
        Position position = new Position();
        position.setPositionId(1);
        position.setPositionName("Dev");

        Account account = new Account();
        account.setAccountId(1);
        account.setCreateDate(LocalDate.parse("2022-01-01"));
        account.setUserName("nguyenthanhkien");
        account.setFirstName("Kiên");
        account.setLastName("Nguyễn Thành");
        account.setPosition(position);
        account.setEmail("nguyenthanhkien@gmail.com");

        Account account2 = new Account(2, "abc", "abc@gmail.com","Le","Van");
        Account account3 = new Account(2, "hoang", position,"hoang@gmail.com","Le","Hoang");
        Account account4 = new Account(2, "hoang", "Tran","Trung", position, LocalDate.now(),"hoang@gmail.com");
        System.out.println("Account 1: " + account.toString());
        System.out.println("Account 2: " + account2.toString());
        System.out.println("Account 3: " + account3.toString());
        System.out.println("Account 4: " + account4.toString());
    }

    public static void question3(Account[] accounts){
        Account account2 = new Account(2, "abc", "abc@gmail.com","Le","Van");

        Group group = new Group();
        group.setGroupId(1);
        group.setGroupName("G2");
        group.setCreateDate(LocalDate.parse("2022-01-12"));

        Group group1 = new Group("G4", account2, accounts, LocalDate.now());

        String[] usernames = {"trung", "van", "bich"};
        Group group2 = new Group("G5", account2,LocalDate.now(), usernames);

        System.out.println("Group 1: " + group.toString());
        System.out.println("Group 2: " + group1.toString());
        System.out.println("Group 3: " + group2.toString());
    }
}