import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentName("Sale");

        Department department1 = new Department();
        department1.setDepartmentId(2);
        department1.setDepartmentName("Giám đốc");

        Department department2 = new Department();
        department2.setDepartmentId(3);
        department2.setDepartmentName("Marketing");

        Position position = new Position();
        position.setPositionId(1);
        position.setPositionName("Dev");

        Position position1 = new Position();
        position1.setPositionId(2);
        position1.setPositionName("Test");

        Position position2 = new Position();
        position2.setPositionId(3);
        position2.setPositionName("Lead");

        Account account = new Account();
        account.setAccountId(1);
        account.setCreateDate(LocalDate.parse("2022-01-01"));
        account.setDepartment(department);
        account.setUserName("nguyenthanhkien");
        account.setFullName("Nguyễn Thành Kiên");
        account.setPosition(position);
        account.setEmail("nguyenthanhkien@gmail.com");

        Account account1 = new Account();
        account1.setAccountId(2);
        account1.setDepartment(department1);
        account1.setCreateDate(LocalDate.parse("2022-01-01"));
        account1.setUserName("levan");
        account1.setFullName("Lê Vân");
        account1.setEmail("levan@gmail.com");

        Account account2 = new Account();
        account2.setAccountId(3);
        account2.setCreateDate(LocalDate.parse("2024-01-01"));
        account2.setDepartment(department1);
        account2.setUserName("lethichau");
        account2.setFullName("Lê Thị Châu");
        account2.setPosition(position1);
        account2.setEmail("lethichau@gmail.com");

        Group group = new Group();
        group.setGroupId(1);
        group.setGroupName("G2");
        group.setCreateDate(LocalDate.parse("2022-01-12"));

        Group group1 = new Group();
        group1.setGroupId(2);
        group1.setGroupName("E3");
        group1.setCreateDate(LocalDate.parse("2023-01-12"));

        Group group2 = new Group();
        group2.setGroupId(3);
        group2.setGroupName("R3");
        group2.setCreateDate(LocalDate.parse("2024-11-12"));

        Group[] groups = {group, group1};
        account.setGroups(groups);

        Account[] accounts = {account};
        group.setAccounts(accounts);

        GroupAccount groupAccount = new GroupAccount();
        groupAccount.setAccountId(1);
        groupAccount.setAccountId(1);
        groupAccount.setJoinDate(LocalDate.parse("2022-07-08"));

        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.setAccountId(2);
        groupAccount1.setAccountId(2);
        groupAccount1.setJoinDate(LocalDate.parse("2022-07-28"));

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.setAccountId(3);
        groupAccount2.setAccountId(3);
        groupAccount2.setJoinDate(LocalDate.parse("2022-07-18"));

        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.setTypeId(1);
        typeQuestion.setTypeName("Multi-Choice");

        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.setTypeId(2);
        typeQuestion1.setTypeName("Essay");

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.setTypeId(3);
        typeQuestion2.setTypeName("Choice");

        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.setCategoryId(1);
        categoryQuestion.setCategoryName("Java");

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.setCategoryId(2);
        categoryQuestion1.setCategoryName(".Net");

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.setCategoryId(3);
        categoryQuestion2.setCategoryName("Golang");

        Question question = new Question();
        question.setQuestionId(1);
        question.setContent("How to ...?");
//        question.setCategoryId(1);
//        question.setTypeId(1);
//        question.setCategoryId(1);
        question.setCreationDate(LocalDate.parse("2022-01-01"));

        Question question1 = new Question();
        question1.setQuestionId(2);
        question1.setContent("Loop is ...?");
//        question1.setCategoryId(2);
//        question1.setTypeId(2);
//        question1.setCategoryId(2);
        question1.setCreationDate(LocalDate.parse("2023-01-01"));

        Question question2 = new Question();
        question2.setQuestionId(3);
        question2.setContent("Java is ...?");
//        question2.setCategoryId(3);
//        question2.setTypeId(3);
//        question2.setCategoryId(3);
        question2.setCreationDate(LocalDate.parse("2025-01-21"));

        Answer answer = new Answer();
        answer.setAnswerId(1);
        answer.setContent("It is ...");
//        answer.setQuestionId(1);
        answer.setCorrect(true);

        Answer answer1 = new Answer();
        answer1.setAnswerId(2);
        answer1.setContent("Loop is ...");
//        answer1.setQuestionId(2);
        answer1.setCorrect(true);

        Answer answer2 = new Answer();
        answer2.setAnswerId(3);
        answer2.setContent("Java is ...");
//        answer2.setQuestionId(3);
        answer2.setCorrect(false);

        Exam exam = new Exam();
        exam.setExamId(1);
        exam.setCode("H12");
        exam.setTitle("Title is ...");
//        exam.setCategoryId(1);
        exam.setDuration(60);
//        exam.setCreatorId(1);
        exam.setCreationDate(LocalDate.parse("2023-05-02"));

        Exam exam1 = new Exam();
        exam1.setExamId(2);
        exam1.setCode("A2");
        exam1.setTitle("Loop is ...");
//        exam1.setCategoryId(2);
        exam1.setDuration(30);
//        exam1.setCreatorId(2);
        exam1.setCreationDate(LocalDate.parse("2024-05-02"));

        Exam exam3 = new Exam();
        exam3.setExamId(3);
        exam3.setCode("G123");
        exam3.setTitle("What is ...");
//        exam3.setCategoryId(3);
        exam3.setDuration(40);
//        exam3.setCreatorId(3);
        exam3.setCreationDate(LocalDate.parse("2022-08-02"));

        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.setExamId(1);
//        examQuestion.setQuestionId(1);

        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.setExamId(2);
//        examQuestion1.setQuestionId(2);

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.setExamId(3);
////        examQuestion2.setQuestionId(3);
        question1(account1);
        question2(account1);
        question3(account1);
        question4(account1);
        question5(groups);
        question6(account1);
        question7(account1);
        Account[] account8 = {account, account1, account2};
        question8(account8);
        Position[] positions = {position, position1, position2};
        question9(positions);
        question10(account8);
        Department[] departments = {department, department1, department2};
        question11(departments);
        question12(departments);
        question13(account8);
        question14(account8);
        question15();
        question16(account8, departments);
        exeQuestion1();
        exeQuestion2();
        exeQuestion3();
        exeQuestion4();
        exeQuestion5();
        exeQuestion6(account8);
    }

    public static void question1(Account account) {
        System.out.println("Department Id: " + account.getDepartment().getDepartmentId() + "\nDepartment Name:" + account.getDepartment().getDepartmentName());
    }

    public static void question2(Account account) {
        if (account.getGroups() == null || account.getGroups().length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            if (account.getGroups().length < 3) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            } else if (account.getGroups().length == 3) {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            } else {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }
    }

    public static void question3(Account account) {
        String mess = account.getDepartment() == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + account.getDepartment().getDepartmentName();
        System.out.println(mess);
    }

    public static void question4(Account account) {
        if (account.getPosition() != null && account.getPosition().getPositionName().equals("Dev")) {
            System.out.println("Đây là Developer");
        } else {
            System.out.println("Người này không phải là Developer");
        }
    }

    public static void question5(Group[] groups) {
        if (groups != null) {
            switch (groups.length) {
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
        } else {
            System.out.println("Nhóm rỗng");
        }
    }

    public static void question6(Account account) {
        if (account.getGroups() != null) {
            switch (account.getGroups().length) {
                case 0:
                    System.out.println("Nhân viên này chưa có group");
                    break;
                case 1:
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
                default:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        } else {
            System.out.println("Nhân viên này chưa có group");
        }
    }

    public static void question7(Account account) {
        if (account.getPosition() == null) {
            System.out.println("Người này không phải là Developer");
        } else {
            switch (account.getPosition().getPositionName()) {
                case "Dev":
                    System.out.println("Đây là Developer");
                    break;
                default:
                    System.out.println("Người này không phải là Developer");
            }
        }
    }

    public static void question8(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("Email: " + account.getEmail());
            System.out.println("Full Name: " + account.getFullName());
            if (account.getPosition() != null) {
                System.out.println("Position Name: " + account.getPosition().getPositionName());
            }
        }
    }

    public static void question9(Position[] positions) {
        for (Position position : positions) {
            System.out.println("Id: " + position.getPositionId());
            System.out.println("Name: " + position.getPositionName());
        }
    }

    public static void question10(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full name: " + accounts[i].getFullName());
            if (accounts[i].getPosition() != null) {
                System.out.println("Phòng ban: " + accounts[i].getPosition().getPositionName());
            }
        }
    }

    public static void question11(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Id: " + departments[i].getDepartmentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
        }
    }

    public static void question12(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getDepartmentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
        }
    }

    public static void question13(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full Name: " + accounts[i].getFullName());
            if (accounts[i].getPosition() != null) {
                System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
            }
        }
    }

    public static void question14(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountId() < 4) {
                System.out.println("Email: " + accounts[i].getEmail());
                System.out.println("Full Name: " + accounts[i].getFullName());
                if (accounts[i].getPosition() != null) {
                    System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
                }
            }
        }
    }

    public static void question15() {
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void question16(Account[] accounts, Department[] departments) {
        while10(accounts);
        while11(departments);
        while12(departments);
        while13(accounts);
        while14(accounts);
        while15();
    }

    public static void question17(Account[] accounts, Department[] departments) {
        doWhile10(accounts);
        doWhile11(departments);
        doWhile12(departments);
        doWhile13(accounts);
        doWhile14(accounts);
        doWhile15();
    }

    public static void exeQuestion1(){
        System.out.printf("%d\n", 5);
    }

    public static void exeQuestion2(){
        System.out.printf(Locale.US,"%,d\n", 100000000);
    }

    public static void exeQuestion3(){
        System.out.printf("%-15.4f", 5.567098);
    }

    public static void exeQuestion4(){
        System.out.printf("%s", "Tên tôi là " +"Vinh"+ " và tôi đang độc thân\n");
    }

    public static void exeQuestion5(){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.printf("%s\n", LocalDateTime.now().format(myFormatObj));
    }

    public static void exeQuestion6(Account[] accounts) {
        System.out.printf("%-10s %-10s","Id", "Name");
        for (Account account : accounts) {
            System.out.printf("\n%-10s %-10s", account.getAccountId(), account.getFullName());
        }
    }

    private static void while10(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full name: " + accounts[i].getFullName());
            if (accounts[i].getPosition() != null) {
                System.out.println("Phòng ban: " + accounts[i].getPosition().getPositionName());
            }
            i++;
        }
    }

    private static void while11(Department[] departments) {
        int i = 0;
        while (i < departments.length) {
            System.out.println("Id: " + departments[i].getDepartmentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
            i++;
        }
    }

    private static void while12(Department[] departments) {
        int i = 0;
        while (i < departments.length) {
            if (i == 2) {
                i++;
                break;
            }
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getDepartmentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
            i++;
        }
    }

    private static void while13(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full Name: " + accounts[i].getFullName());
            if (accounts[i].getPosition() != null) {
                System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
            }
            i++;
        }
    }

    private static void while14(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if (accounts[i].getAccountId() < 4) {
                System.out.println("Email: " + accounts[i].getEmail());
                System.out.println("Full Name: " + accounts[i].getFullName());
                if (accounts[i].getPosition() != null) {
                    System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
                }
            }
            i++;
        }
    }

    private static void while15() {
        int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i = i + 2;
        }
    }

    private static void doWhile10(Account[] accounts) {
        int i = 0;
        do {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full name: " + accounts[i].getFullName());
            if (accounts[i].getPosition() != null) {
                System.out.println("Phòng ban: " + accounts[i].getPosition().getPositionName());
            }
            i++;
        } while (i < accounts.length);
    }

    private static void doWhile11(Department[] departments) {
        int i = 0;
        do {
            System.out.println("Id: " + departments[i].getDepartmentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
            i++;
        } while (i < departments.length);
    }

    private static void doWhile12(Department[] departments) {
        int i = 0;
        do {
            if (i == 2) {
                i++;
                break;
            }
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getDepartmentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
            i++;
        } while (i < departments.length);
    }

    private static void doWhile13(Account[] accounts) {
        int i = 0;
        do {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full Name: " + accounts[i].getFullName());
            if (accounts[i].getPosition() != null) {
                System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
            }
            i++;
        } while (i < accounts.length);
    }

    private static void doWhile14(Account[] accounts) {
        int i = 0;
        do {
            if (accounts[i].getAccountId() < 4) {
                System.out.println("Email: " + accounts[i].getEmail());
                System.out.println("Full Name: " + accounts[i].getFullName());
                if (accounts[i].getPosition() != null) {
                    System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
                }
            }
            i++;
        }while (i < accounts.length);
    }

    private static void doWhile15() {
        int i = 0;
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 20);
    }
}