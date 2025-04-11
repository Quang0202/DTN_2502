import model.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

//        question1(exam);
//        question2(exam);
//        question3(exam);
//        question4(exam);
//        question5(exam);
//        exe4Question1();
//        exe4Question2();
//        exe4Question3();
//        exe4Question4();
//        exe4Question5();
//        exe4Question7();
//        exe5Question1();
//        exe5Question2();
//        exe5Question3();
//        exe5Question4();
//        exe5Question5();
//        exe5Question6();
//        exe5Question7();
//        exe5Question8();
        exe5Question9(accounts, groups);
//        exe5Question10(accounts, groups);
//        exe5Question11(accounts, groups);
//        exe6Question1();
//        exe6Question2(accounts);
//        exe6Question3();
    }

    public static void question1(Exam exam) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy", new Locale("vi", "VN"));
        System.out.println(exam.getCreationDate().format(dtf));
    }

    public static void question2(Exam exam) {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(exam.getCreationDate().format(dtf));
    }

    public static void question3(Exam exam) {
        System.out.println(exam.getCreationDate().getYear());
    }

    public static void question4(Exam exam) {
        System.out.println(exam.getCreationDate().getMonth().getValue() + "-" + exam.getCreationDate().getYear());
    }

    public static void question5(Exam exam) {
        System.out.println(exam.getCreationDate().getMonth().getValue() + "-" + exam.getCreationDate().getDayOfMonth());
    }

    public static void exe4Question1() {
        Random rand = new Random();
        System.out.println(rand.nextInt(1000));
    }

    public static void exe4Question2() {
        Random rand = new Random();
        System.out.println(rand.nextDouble());
    }

    public static void exe4Question3() {
        String[] names = {"Kien", "Son", "Bich", "Thuy"};
        Random rand = new Random();
        System.out.println(names[rand.nextInt(names.length)]);
    }

    public static void exe4Question4() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date randomDate = new Date(getRandomTimeBetweenTwoDates("1995-07-24 00:00:00", "1995-12-20 00:00:00"));
        System.out.println(dateFormat.format(randomDate));
    }

    public static void exe4Question5() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String datePrevious = LocalDateTime.now().plusYears(-1).format(formatter);
        String dateNow = LocalDateTime.now().format(formatter);
        Date randomDate = new Date(getRandomTimeBetweenTwoDates(datePrevious, dateNow));
        System.out.println(dateFormat.format(randomDate));
    }

    public static void exe4Question7() {
        Random rand = new Random();
        System.out.println(rand.nextInt(900) + 100);
    }

    public static void exe5Question1() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu 1: ");
        myObj.nextInt();
        System.out.println("Nhap so nguyen thu 2: ");
        myObj.nextInt();
        System.out.println("Nhap so nguyen thu 3: ");
        myObj.nextInt();
    }

    public static void exe5Question2() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap so thuc thu 1: ");
        myObj.nextFloat();
        System.out.println("Nhap so thuc thu 2: ");
        myObj.nextFloat();
    }

    public static void exe5Question3() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        myObj.nextLine();
    }

    public static void exe5Question4() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ngay sinh nhat: dd/MM/yyyy");
        myObj.nextLine();
    }

    public static void exe5Question5() {
        Scanner myObj = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Nhap id account: ");
        account.setAccountId(myObj.nextInt());
        myObj.nextLine();
        System.out.println("Nhap username account: ");
        account.setUserName(myObj.nextLine());
        System.out.println("Nhap full name account: ");
        account.setFullName(myObj.nextLine());
        System.out.println("Nhap email account: ");
        account.setEmail(myObj.nextLine());
        System.out.println("Nhap position account: ");
        Position position = createPosition();
        account.setPosition(position);
        System.out.println("Account vừa tạo là");
        System.out.println(account);
    }

    public static Position createPosition() {
        Scanner scanner = new Scanner(System.in);
        Position position = new Position();
        System.out.println("Nhập vào id của Position ");
        int positionID = scanner.nextInt();
        position.setPositionId(positionID);
        System.out.println("Nhập vào positionName với: 1,Dev 2,Test, 3,Scrum Master 4, PM");
        int temp = scanner.nextInt();
        switch (temp) {
            case 1:
                position.setPositionName("Dev");
                break;
            case 2:
                position.setPositionName("Test");
                break;
            case 3:
                position.setPositionName("Scrum Master");
                break;
            case 4:
                position.setPositionName("PM");
                break;
        }
        return position;
    }

    public static void exe5Question6() {
        Scanner myObj = new Scanner(System.in);
        Department department = new Department();
        System.out.println("Nhap id department: ");
        department.setDepartmentId(myObj.nextInt());
        myObj.nextLine();
        System.out.println("Nhap name department: ");
        department.setDepartmentName(myObj.nextLine());
        System.out.println("Department vừa tạo là");
        System.out.println(department);
    }

    public static void exe5Question7() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap so chan: ");
            if (myObj.hasNextInt()) {
                if(myObj.nextInt()%2 == 0) {
                    break;
                }
            } else {
                System.out.println("Nhập sai vui lòng nhập lại");
                myObj.next();
            }
        }
    }

    public static void exe5Question8() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("mời bạn nhập vào chức năng muốn sử dụng: ");
            int temp = myObj.nextInt();
            if (temp == 1) {
                exe5Question5();
                break;
            } else if (temp == 2) {
                exe5Question6();
                break;
            }
            System.out.println("Mời bạn nhập lại");
        }
    }

    public static void exe5Question9(Account[] accounts, Group[] groups) {
        Scanner myObj = new Scanner(System.in);
        for (Account account : accounts) {
            System.out.println(account.getUserName());
        }
        System.out.println("Nhap username: ");
        Account accountChoose = new Account();
        String username = myObj.nextLine();
        for (Group group : groups) {
            System.out.println(group.getGroupName());
        }
        System.out.println("Nhap ten group: ");
        String nameGroup = myObj.nextLine();
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getUserName().equals(username)) {
                accountChoose = accounts[i];
                break;
            }
        }
        Group groupChoose = new Group();
        for (int i = 0; i < groups.length; i++) {
            if (groups[i].getGroupName().equals(nameGroup)) {
                groupChoose = groups[i];
                break;
            }
        }
        // B1 groupChoose accounts [account1, account2]
        // temp[]= [,,,]
        // temp[] = [account1, account2, ] - > [account1, account2,account3]
        // groupChoose accounts  = temp[]

        if(groupChoose.getAccounts() != null) {
            Account[] accountGroup = groupChoose.getAccounts(); // 2 0,1
            Account[] temp = new Account[accountGroup.length + 1];//3 0,1,2
            for(int i=0;i<accountGroup.length;i++){
                temp[i]= accountGroup[i];
            }
            temp[accountGroup.length]  = accountChoose;
            groupChoose.setAccounts(temp);
        }
        else {
            Account[] temp = new Account[1];
            temp[0]= accountChoose;
            groupChoose.setAccounts(temp);
        }

        System.out.println(groupChoose);
    }

    public static void exe5Question10(Account[] accounts, Group[] groups) {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("mời bạn nhập vào chức năng muốn sử dụng: ");
            int temp = myObj.nextInt();
            if (temp == 1) {
                exe5Question5();
            } else if (temp == 2) {
                exe5Question6();
            } else if (temp == 3) {
                exe5Question9(accounts, groups);
            } else {
                System.out.println("Mời bạn nhập lại");
            }
            myObj.nextLine();
            System.out.println("Bạn có muốn thực hiện chức năng khác không?");
            if (myObj.nextLine().equals("Có")) {
                continue;
            }
            break;
        }
    }

    public static void exe5Question11(Account[] accounts, Group[] groups) {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("mời bạn nhập vào chức năng muốn sử dụng: ");
            int temp = myObj.nextInt();
            if (temp == 1) {
                exe5Question5();
            } else if (temp == 2) {
                exe5Question6();
            } else if (temp == 3) {
                exe5Question9(accounts, groups);
            } else if (temp == 4) {
                addRandomGroup(accounts, groups);
            } else {
                System.out.println("Mời bạn nhập lại");
            }
            myObj.nextLine();
            System.out.println("Bạn có muốn thực hiện chức năng khác không?");
            if (myObj.nextLine().equals("Có")) {
                continue;
            }
            break;
        }
    }

    private static void addRandomGroup(Account[] accounts, Group[] groups) {
        Scanner myObj = new Scanner(System.in);
        for (Account account : accounts) {
            System.out.println(account.getUserName());
        }
        System.out.println("Nhap username: ");
        Account accountChoose = new Account();
        String username = myObj.nextLine();
        for (Group group : groups) {
            System.out.println(group.getGroupName());
        }
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getUserName().equals(username)) {
                accountChoose = accounts[i];
                break;
            }
        }
        Group groupChoose = new Group();
        Random random = new Random();
        int index = random.nextInt(groups.length);
        groupChoose = groups[index];
        // B1 groupChoose accounts [account1, account2]
        // temp[]= [,,,]
        // temp[] = [account1, account2, ] - > [account1, account2,account3]
        // groupChoose accounts  = temp[]

        if(groupChoose.getAccounts() != null) {
            Account[] accountGroup = groupChoose.getAccounts(); // 2 0,1
            Account[] temp = new Account[accountGroup.length + 1];//3 0,1,2
            for(int i=0;i<accountGroup.length;i++){
                temp[i]= accountGroup[i];
            }
            temp[accountGroup.length]  = accountChoose;
            groupChoose.setAccounts(temp);
        }
        else {
            Account[] temp = new Account[1];
            temp[0]= accountChoose;
            groupChoose.setAccounts(temp);
        }

        System.out.println(groupChoose);
    }

    public static void exe6Question1() {
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void exe6Question2(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("id: " + account.getAccountId());
            System.out.println("full name: " + account.getFullName());
            System.out.println("email: " + account.getEmail());
            System.out.println("username: " + account.getUserName());
        }
    }

    public static void exe6Question3() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static long getRandomTimeBetweenTwoDates(String startDate, String endDate) {
        long beginTime = Timestamp.valueOf(startDate).getTime();
        long endTime = Timestamp.valueOf(endDate).getTime();
        long diff = endTime - beginTime + 1;
        return beginTime + (long) (Math.random() * diff);
    }


}