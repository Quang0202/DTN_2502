package testingsystem_asssignmen1;

import java.time.LocalDateTime;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department department1 = new Department(1,"sale");
        Department department2 = new Department(2,"marketing");
        Department department3 = new Department(1,"IT");
        System.out.println(department3);

        Position position1 = new Position(1,"Dev");
        Position position2 = new Position(2,"Test");
        System.out.println(position1.positionName);

        Account account1 = new Account(1,"vynguyen@gmail.com","vynguyen","Nguyen Tran Khanh Vy", department1,position1, LocalDateTime.now());
        System.out.println(account1.department.departmentName);
        System.out.println(account1.createDate);

        Group group1 = new Group(1, "group1", account1, LocalDateTime.now());
        System.out.println(group1.creator.email);

        GroupAccount groupAccount1 = new GroupAccount(1, account1, new Date());
        System.out.println(groupAccount1.joinDate);

        TypeQuestion typeQuestion1 = new TypeQuestion(1,"Essay");
        System.out.println(typeQuestion1);

        CategoryQuestion categoryQuestion1 = new CategoryQuestion(1,"Java");

    }
}