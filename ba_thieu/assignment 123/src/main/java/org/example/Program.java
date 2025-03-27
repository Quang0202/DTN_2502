package org.example;

import java.time.LocalDate;
import org.example.Question ;
import org.example.Exam ;
import org.example.Group ;
import org.example.Department;
import org.example.Answer;
import org.example.TypeQuestion;
import org.example.Position;
import org.example.Position.PositionName;

public class Program {
    public static void main(String[] args) {
//		Tạo Department
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";

        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";

        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";

//	Tạo Position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.Dev;

        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.PM;

        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.Scrum_Master;

//  Tạo Group

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        group1.createDate = LocalDate.of(2021, 1, 1);

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";
        group2.createDate = LocalDate.of(2020, 2, 1);

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createDate = LocalDate.of(2019, 9, 23);
//  tạo Exam
        Exam exam1 = new Exam ();
        exam1.id = 1;
        exam1.code = "ha";
        exam1.title = "tracnghiem" ;
        exam1.createDate = LocalDate.parse("2014-12-12");
//	Tạo Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "daonq1";
        acc1.userName = "daonq1";
        acc1.fullName = "Dao Nguyen 1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        Group[] groupAcc1 = { group1, group2 };
        acc1.groups = groupAcc1;

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "daonq2";
        acc2.userName = "daonq2";
        acc2.fullName = "Dao Nguyen 2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2021, 03, 17);
        acc2.groups = new Group[] { group3, group2 };

        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "daonq3";
        acc3.userName = "daonq3";
        acc3.fullName = "Dao Nguyen 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();
//		add Group Account
        group1.accounts = new Account[] { acc1 };
        group2.accounts = new Account[] { acc1, acc2 };
        group3.accounts = new Account[] { acc2 };
        System.out.println("Thông tin các Account trên hệ thống:");
        System.out.println("Account 1: ID : " + acc1.id + " Email: " +

                acc1.email + " UserName: " + acc1.userName

                + " FullName: " + acc1.fullName + " Department: " +

                acc1.department.name + " Position: "

                + acc1.position.name + " Group: "+
                acc1.groups[0].name +" "+ acc1.groups[1].name + "CreateDate: " +
                acc1.createDate);

        System.out.println("Account 2: ID : " + acc2.id + " Email: " +

                acc2.email + " UserName: " + acc2.userName

                + " FullName: " + acc2.fullName + " Department: " +

                acc2.department.name + " Position: "

                + acc2.position.name + " Group: "+
                acc2.groups[0].name +" "+ acc2.groups[1].name + "CreateDate: " +
                acc2.createDate);

        System.out.println("Account 3: ID : " + acc3.id + " Email: " +

                acc3.email + " UserName: " + acc3.userName

                + " FullName: " + acc3.fullName + " Department: " +

                acc3.department.name + " Position: "

                + acc3.position.name + " Group: " + "CreateDate: " +

                acc3.createDate);


        // Question 1:
        System.out.println("---------Question 1 Check acc2:---------");
        if (acc2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nv này là: " +

                    acc2.department.name);
        }
        // question 2
        System.out.println("---------Question 2: Làm theo IF ---------");
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int countGroup = acc2.groups.length;
            if (countGroup == 1 || countGroup == 2) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }
            if (countGroup == 3) {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");

            }
            if (countGroup >= 4) {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");

            }
        }
        // question 3
                System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban."

        : "Phòng của nhân viên này là: " + acc2.department.name);
        // question4
        System.out.println(acc1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");
        //question5
        if (group1.accounts == null) {
            System.out.println("Group chưa có thành viên nào tham gia");
        } else {
            int coungAccInGroup = group1.accounts.length;
            switch (coungAccInGroup) {
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
                    break;
            }
        }
        // question 6
        System.out.println(" ---------Question 6: Check số lượng Group nhân viên tham gia: Switch Case ---------");

        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            switch (acc2.groups.length) {
                case 1:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;

                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;

                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
            }
        }
     // question 7
        System.out.println("---------Question 7: Sử dụng switch case để làm lại Question 4---------");
        String positionName = acc1.position.name.toString();
        switch (positionName) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;

            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
    // question 8
        System.out.println("---------FOREACH Question 8:---------");
        Account[] accArray = { acc1, acc2, acc3 };
        for (Account account : accArray) {
            System.out.println("AccountID: " + account.id + " Email: " + account.email + " Name: " + account.fullName);
        }
        // question 9
        System.out.println("---------Question 9: In thông tin phòng ban: ---------");
        Department[] depArray = { dep1, dep2, dep3 };
        for (Department department : depArray) {
            System.out.println("DepID: " + department.id + " Name: " + department.name);
        }
        // question 10
        System.out.println("---------FOR Question 10: In thông tin account:---------");
        Account[] accArray1 = { acc1, acc2 };
        for (int i = 0; i < accArray1.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accArray1[i].email);
            System.out.println("Full name: " + accArray1[i].fullName);
            System.out.println("Phòng ban: " + accArray1[i].department.name);
        }
        // question 11
        System.out.println("---------Question 11: Thông tin phòng ban:---------");
        Department[] depArray1 = { dep1, dep2, dep3 };
        for (int i = 0; i < depArray1.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + depArray1[i].id);
            System.out.println("Name: " + depArray1[i].name);
        }
        // question 12
        System.out.println("---------Question 12: Thông tin phòng ban:---------");
        Department[] depArray2 = { dep1, dep2, dep3 };
        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + depArray2[i].id);
            System.out.println("Name: " + depArray2[i].name);}
        // question 13
        System.out.println(
                "----------Question 13:In ra thông tin tất cả các account ngoại trừ account thứ 2: ------------");
        Account[] accArray2 = { acc1, acc2, acc3 };
        for (int i = 0; i < accArray2.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accArray2[i].email);
                System.out.println("Full name: " + accArray2[i].fullName);
                System.out.println("Phòng ban: " + accArray2[i].department.name);
            }
        }
        // question 14
        System.out.println("---------- Question 14: In ra thông tin tất cả các account có id < 4-----------");
        Account[] accArray3 = { acc1, acc2, acc3 };
        for (int j = 0; j < accArray3.length; j++) {
            if (accArray3[j].id < 4) {
                System.out.println("Thông tin account thứ " + (j + 1) + " là:");
                System.out.println("Email: " + accArray3[j].email);
                System.out.println("Full name: " + accArray3[j].fullName);
                System.out.println("Phòng ban: " + accArray3[j].department.name);
            }
        }
        // question 15
        System.out.println("---------Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20-----------");
        for (int i = 1; i <= 20; i++) {
            if (i%2 ==0 ) {
                System.out.print(i+ "  ");
            }
        }
        // question 16
        //
        System_out_printf systemOutPrintf = new System_out_printf();
        System.out.println("");
        systemOutPrintf.tong(1,2,3);










    }
}
