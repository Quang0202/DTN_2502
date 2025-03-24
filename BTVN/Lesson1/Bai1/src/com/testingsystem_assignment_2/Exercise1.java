package com.testingsystem_assignment_2;

import com.testingsystem_assignment_1.*;

import java.util.Date;

public class Exercise1 {

    public static void main(String[] args) {
        // Tạo Department
        Department department1 = new Department(1, "IT");
        Department department2 = new Department(2, "Finance");
        Department department3 = new Department(3, "HR");

        // Tạo Position
        Position position1 = new Position(1, "Dev");

        // Tạo Account
        Account account1 = new Account(1, "phamanhtuan1", "tuan@gmail.com", "Pham Anh Tuan", Gender.MALE, department1, position1, new Date());
        Account account2 = new Account(2, "nguyenvana", "an@gmail.com", "Nguyen Van A", Gender.MALE, department2, null, new Date());
        Account account3 = new Account(3, "lethivanb", "vanb@gmail.com", "Le Thi Van B", Gender.FEMALE, department3, null, new Date());
        Account account4 = new Account(4, "tranvanc", "tranvc@gmail.com", "Tran Van C", Gender.MALE, null, null, new Date()); // Không có phòng ban
        // Tạo Group
        Group group1 = new Group(1, "Java Fresher", null, new Date());
        Group group2 = new Group(2, "Java Intermediate", null, new Date());
        Group group3 = new Group(3, "Java Advanced", null, new Date());
        Group[] groups = {group1, group2, group3};
        Account[] accounts = {account1, account2, account3, account4};
        Department[] departments = {department1};
        account2.groups = groups;
        question1(account2);
        question2(account2);
        question4(account1);
        question5(accounts);
        question8(accounts);
        question9(departments);
        question10(accounts);
        question11();
        question12(departments);
        question13();
        question14();
        question15();
        question16();
    }

    public static void question1(Account account) {
        // Tạo Department
        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban\n");
        } else {
            System.out.println("Phòng ban của nhân viên: " + account.department.departmentName + "\n");
        }
        System.out.println((account.department == null) ? "Nhân viên này chưa có phòng ban\n" : "Phòng ban của nhân viên: " + account.department.departmentName + "\n");
    }

    public static void question2(Account account) {
        if (account.groups == null || account.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            if (account.groups.length < 3) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            } else if (account.groups.length == 3) {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            } else {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }

//        if(account.groups == null || account.groups.length == 0){
//            System.out.println("Nhân viên này chưa có group");
//        } else {
//            switch (account.groups.length){
//                case 1:
//                case 2:
//                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//                    break;
//                case 3:
//                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//                    break;
//                default:
//                    System.out.println( "Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//
//            }
//        }
    }


    public static void question4(Account account1) {
        System.out.println("question4");
        System.out.println((account1.position.positionName.equals("Dev")) ? "Đây là Developer" : "Người này không phải là Developer");
    }

    // Hàm kiểm tra số lượng thành viên trong nhóm
    public static void question5(Account[] accounts) {
        int numberOfMembers = accounts.length;

        switch (numberOfMembers) {
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

    public static void question8(Account[] accounts) {
        for (Account acc : accounts) {
            String departmentName = (acc.department != null) ? acc.department.departmentName : "Nhân viên này chưa có phòng ban";
            System.out.println("Email: " + acc.email + " | Full Name: " + acc.fullName + " | Phòng Ban: " + departmentName);
        }
    }

    public static void question9(Department[] departments) {
        for (Department dept : departments) {
            System.out.println("ID: " + dept.departmentId + " | Name: " + dept.departmentName);
        }

    }

    public static void question10(Account[] accounts) {
        System.out.println("Question 10:");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + ((accounts[i].department == null) ? "Null" : accounts[i].department.departmentName));
            System.out.println(); // Xuống dòng
        }
    }

    public static void question11() {
        // Tạo danh sách phòng ban
        Department department1 = new Department(1, "Sale");
        Department department2 = new Department(2, "Marketing");

        // Đưa vào mảng
        Department[] departments = {department1, department2};

        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].departmentId);
            System.out.println("Name: " + departments[i].departmentName);
            System.out.println(); // Xuống dòng
        }
    }

    public static void question12(Department[]departments) {
        System.out.println("Question 12:");
        for (int i = 0; i < departments.length && i < 2 ; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].departmentId);
            System.out.println("Name: " + departments[i].departmentName);
            System.out.println(); // Xuống dòng
        }
    }

    public static void question13() {
        // Tạo danh sách account
        Account[] accounts = {
                new Account(1, "nguyenvana", "NguyenVanA@gmail.com", "Nguyễn Văn A", null, null, null, null),
                new Account(2, "tranvanb", "TranVanB@gmail.com", "Trần Văn B", null, null, null, null),
                new Account(3, "lethic", "LeThiC@gmail.com", "Lê Thị C", null, null, null, null),
                new Account(4, "phamvand", "PhamVanD@gmail.com", "Phạm Văn D", null, null, null, null)
        };


        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) continue;

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println();
        }
    }

    public static void question14() {
        Account[] accounts = {
                new Account(1, "nguyenvana", "NguyenVanA@gmail.com", "Nguyễn Văn A", null, null, null, null),
                new Account(2, "tranvanb", "TranVanB@gmail.com", "Trần Văn B", null, null, null, null),
                new Account(3, "lethic", "LeThiC@gmail.com", "Lê Thị C", null, null, null, null),
                new Account(4, "phamvand", "PhamVanD@gmail.com", "Phạm Văn D", null, null, null, null)
        };

        // In ra thông tin các account có id < 4
        for (Account account : accounts) {
            if (account.accountId >= 4) continue; // Bỏ qua account có id >= 4

            System.out.println("Thông tin account có ID " + account.accountId + " là:");
            System.out.println("Email: " + account.email);
            System.out.println("Full name: " + account.fullName);
            System.out.println(); // Xuống dòng
        }
    }

    public static void question15() {
        System.out.println("Các số chẵn nhỏ hơn hoặc bằng 20 là:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void question16() {
        // QUESTION 10
        System.out.println("Question 10:");
        Department sale = new Department(1, "Sale");
        Department marketing = new Department(2, "Marketing");

        Account account1 = new Account(1, "NguyenVanA@gmail.com", "Nguyễn Văn A", sale);
        Account account2 = new Account(2, "NguyenVanB@gmail.com", "Nguyễn Văn B", marketing);

        Account[] accounts = {account1, account2};

        int i = 0;
        while (i < accounts.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.departmentName);
            System.out.println();
            i++;
        }

        // QUESTION 11
        System.out.println("Question 11:");
        Department[] departments = {new Department(1, "Sale"), new Department(2, "Marketing")};

        i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].departmentId);
            System.out.println("Name: " + departments[i].departmentName);
            System.out.println();
            i++;
        }

        // QUESTION 12
        System.out.println("Question 12:");
        Department[] moreDepartments = {
                new Department(1, "Sale"),
                new Department(2, "Marketing"),
                new Department(3, "IT"),
                new Department(4, "Finance")
        };

        i = 0;
        while (i < 2) { // Chỉ lấy 2 phòng ban đầu tiên
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + moreDepartments[i].departmentId);
            System.out.println("Name: " + moreDepartments[i].departmentName);
            System.out.println();
            i++;
        }

        // QUESTION 13
        System.out.println("Question 13:");
        Account[] moreAccounts = {
                new Account(1, "nguyenvana", "NguyenVanA@gmail.com", "Nguyễn Văn A", null, null, null, null),
                new Account(2, "tranvanb", "TranVanB@gmail.com", "Trần Văn B", null, null, null, null),
                new Account(3, "lethic", "LeThiC@gmail.com", "Lê Thị C", null, null, null, null),
                new Account(4, "phamvand", "PhamVanD@gmail.com", "Phạm Văn D", null, null, null, null)
        };

        i = 0;
        while (i < moreAccounts.length) {
            if (i == 1) {
                i++;
                continue;
            }

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + moreAccounts[i].email);
            System.out.println("Full name: " + moreAccounts[i].fullName);
            System.out.println();
            i++;
        }

        // QUESTION 14
        System.out.println("Question 14:");
        i = 0;
        while (i < moreAccounts.length) {
            if (moreAccounts[i].accountId >= 4) {
                i++;
                continue;
            }

            System.out.println("Thông tin account có ID " + moreAccounts[i].accountId + " là:");
            System.out.println("Email: " + moreAccounts[i].email);
            System.out.println("Full name: " + moreAccounts[i].fullName);
            System.out.println();
            i++;
        }

        // QUESTION 15
        System.out.println("Question 15:");
        System.out.println("Các số chẵn nhỏ hơn hoặc bằng 20 là:");
        i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2; // Chỉ lấy số chẵn
        }
        System.out.println();
    }


}
