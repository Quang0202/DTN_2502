import model.*;

import java.time.LocalDate;

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

    public static void question5(Group[] groups){
        if(groups != null){
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
        }else{
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
}