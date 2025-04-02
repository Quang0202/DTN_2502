import model.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Department
        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentName("Sale");

        Department department1 = new Department();
        department1.setDepartmentId(2);
        department1.setDepartmentName("Marketing");

        Department department2 = new Department();
        department2.setDepartmentId(3);
        department2.setDepartmentName("IT");


        //Position
        Position position = new Position();
        position.setPositionId(1);
        position.setPositionName("Dev");

        Position position1 = new Position();
        position1.setPositionId(2);
        position1.setPositionName("Test");

        Position position2 = new Position();
        position2.setPositionId(3);
        position2.setPositionName("Scrum Master");

        Position position3 = new Position();
        position3.setPositionId(4);
        position3.setPositionName("PM");


        //Account
        Account account = new Account();
        account.setAccountId(1);
        account.setCreateDate(LocalDate.parse("2023-01-01"));
        account.setUserName("nganpham");
        account.setFullName("phamthikimngan");
        account.setEmail("nganpham@gmail.com");
        account.setDepartment(department);
        account.setPosition(position);

        Account account1 = new Account();
        account1.setAccountId(2);
        account1.setCreateDate(LocalDate.parse("2024-01-01"));
        account1.setUserName("ormkorn");
        account1.setFullName("ormkornaphat");
        account1.setEmail("ormkorn@gmail.com");
        account1.setDepartment(department1);
        account1.setPosition(position1);

        Account account2 = new Account();
        account2.setAccountId(3);
        account2.setCreateDate(LocalDate.parse("2025-01-01"));
        account2.setUserName("jay");
        account2.setFullName("jayaphat");
        account2.setEmail("jay@gmail.com");
        account2.setDepartment(department2);
        account2.setPosition(position2);


        //Group
        Group group = new Group();
        group.setGroupId(1);
        group.setCreateDate(LocalDate.parse("2022-01-01"));
        group.setGroupName("Group1");

        Group group1 = new Group();
        group1.setGroupId(2);
        group1.setCreateDate(LocalDate.parse("2021-01-01"));
        group1.setGroupName("Group2");

        Group group2 = new Group();
        group2.setGroupId(3);
        group2.setCreateDate(LocalDate.parse("2020-01-01"));
        group2.setGroupName("Group3");

        Group[] groups = {group, group1, group2};
        account.setGroups(groups);

        Account[] accounts = {account, account1, account2};
        group.setAccounts(accounts);


        //Group Account
        GroupAccount groupAccount = new GroupAccount();
        groupAccount.setAccountId(1);
        groupAccount.setGroupId(1);
        groupAccount.setJoinDate(LocalDate.parse("2022-03-03"));

        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.setAccountId(2);
        groupAccount1.setGroupId(2);
        groupAccount1.setJoinDate(LocalDate.parse("2022-05-03"));

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.setAccountId(3);
        groupAccount2.setGroupId(3);
        groupAccount2.setJoinDate(LocalDate.parse("2022-07-03"));


        //Type Question
        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.setTypeId(1);
        typeQuestion.setTypeName("Essay");

        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.setTypeId(2);
        typeQuestion1.setTypeName("Multiple-Choice");

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.setTypeId(3);
        typeQuestion2.setTypeName("Yes or No");


        //Category Question
        CategoryQuestion category = new CategoryQuestion();
        category.setCategoryId(1);
        category.setCategoryName("Java");

        CategoryQuestion category1 = new CategoryQuestion();
        category1.setCategoryId(2);
        category1.setCategoryName("Python");

        CategoryQuestion category2 = new CategoryQuestion();
        category2.setCategoryId(3);
        category2.setCategoryName("Postman");


        //Question
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


        //Answer
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


        //Exam
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


        //Exam Question
        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.setExamId(1);
//        examQuestion.setQuestionId(1);

        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.setExamId(2);
//        examQuestion1.setQuestionId(2);

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.setExamId(3);
//        examQuestion2.setQuestionId(3);;


        //Homework
        Account[] account8 = {account, account1, account2};
        Position[] positions = {position, position1, position2};
        Department[] departments = {department, department1, department2};
//        question1(account2);
//        question2(account2);
//        question3(account2);
//        question4(account1);
//        question5(groups);
//        question6(account2);
//        question7(account2);
//        question8(account8);
//        question9(positions);
//        question10(accounts);
//        question11(departments);
//        question12(departments);
//        question13(accounts);
//        question14(accounts);
//        question15();

        //Exercise 2 (Optional): System out printf
//        exe2Question1();
//        exe2Question2();
//        exe2Question3();
//        exe2Question4();
//        exe2Question5();
//        exe2Question6(accounts);

        //Exercise 3 (Optional): Date Format
//        exe3Question1(exam);
//        exe3Question2(exam);
//        exe3Question3(exam);
//        exe3Question4(exam);
//        exe3Question5(exam);

        //Exercise 4 (Optional): Random Number
//        exe4Question1();
//        exe4Question2();
//        exe4Question3();
//        exe4Question4();
//        exe4Question5();
//        exe4Question6();
//        exe4Question7();

        //Exercise 5: Input from console
//        exe5Question1();
//        exe5Question2();
//        exe5Question3();
//        exe5Question4();
//        exe5Question5();
//        exe5Question6();
//        exe5Question7();
//        exe5Question8();
//        exe5Question9(accounts,groups);
//        exe5Question10(accounts,groups);
//        exe5Question11(accounts,groups);

        //Exercise 6 (Optional): Method
//        exe6Question1();
//        exe6Question2(accounts);
        exe6Question3();



    }

    //Question 1: Kiểm tra account thứ 2
    //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
    //"Nhân viên này chưa có phòng ban"
    //Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
    public static void question1(Account account) {
        if (account.getDepartment() == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        }else {
            System.out.println("Phòng ban của nhân viên này là " + account.getDepartment().getDepartmentName());
        }
    }

    //Question 2: Kiểm tra account thứ 2
    //Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
    //Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
    //Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
    //Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
    public static void question2(Account account) {
        if( account.getGroups() == null || account.getGroups().length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            if (account.getGroups().length < 3){
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }else if (account.getGroups().length == 3){
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            } else {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }
    }

    //Question 3: Sử dụng toán tử ternary để làm Question 1
    public static void question3(Account account) {
        System.out.println(account.getDepartment() == null ? "Nhân viên này chưa có phòng ban" :"Phòng ban của nhân viên này là " + account.getDepartment().getDepartmentName());
    }

    //Question 4: Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của account thứ 1
    //Nếu Position = Dev thì in ra text "Đây là Developer"
    //Nếu không phải thì in ra text "Người này không phải là Developer"
    public static void question4(Account account) {
        if (account.getPosition() != null && account.getPosition().getPositionName().equals("Dev")) {
            System.out.println("Đây là Developer");
        } else {
            System.out.println("Người này không phải là Developer");
        }
    }

    //Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
    //Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
    //Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
    //Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
    //Còn lại in ra "Nhóm có nhiều thành viên"
    public static void question5(Group[] groups) {
        if(groups != null ) {
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

    //Question 6: Sử dụng switch case để làm lại Question 2
    public static void question6(Account account) {
        if(account.getGroups() != null) {
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

    //Question 7: Sử dụng switch case để làm lại Question 4
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

    //Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
    public static void question8(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("Email: " + account.getEmail());
            System.out.println("Full Name: " + account.getFullName());
            if (account.getPosition() != null) {
                System.out.println("Position Name: " + account.getPosition().getPositionName());
            }
        }
    }

    //Question 9: In ra thông tin các phòng ban bao gồm: id và name
    public static void question9(Position[] positions) {
        for (Position position : positions) {
            System.out.println("Position ID: " + position.getPositionId());
            System.out.println("Position Name: " + position.getPositionName());
        }
    }

    //Question 10: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng như sau:
    //Thông tin account thứ 1 là: Email: NguyenVanA@gmail.com Full name: Nguyễn Văn A Phòng ban: Sale
    //Thông tin account thứ 2 là: Email: NguyenVanB@gmail.com Full name: Nguyễn Văn B Phòng ban: Marketting
    public static void question10(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full Name: " + accounts[i].getFullName());
            if (accounts[i].getPosition() != null) {
                System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
            }
        }
    }

    //Question 11: In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
    //Thông tin department thứ 1 là: Id: 1 Name: Sale
    //Thông tin department thứ 2 là: Id: 2 Name: Marketing
    public static void question11(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Department ID: " + departments[i].getDepartmentId());
            System.out.println("Department Name: " + departments[i].getDepartmentName());
        }
    }

    //Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    public static void question12(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            if( i == 2){
                break;
            }
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Department ID: " + departments[i].getDepartmentId());
            System.out.println("Department Name: " + departments[i].getDepartmentName());
        }
    }

    //Question 13:In ra thông tin tất cả các account ngoại trừ account thứ 2
    public static void question13(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if( i == 2){
                continue;
            }
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full Name: " + accounts[i].getFullName());
            if (accounts[i].getPosition() != null) {
                System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
            }
        }
    }

    //Question 14:In ra thông tin tất cả các account có id < 4
    public static void question14(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i].getAccountId() < 4 ) {
                System.out.println("Email: " + accounts[i].getEmail());
                System.out.println("Full Name: " + accounts[i].getFullName());
            } if (accounts[i].getPosition() != null) {
                System.out.println("Position Name: " + accounts[i].getPosition().getPositionName());
            }
        }
    }

    //Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
    public static void question15() {
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(i);
        }
    }

    //////////Exercise 2 (Optional): System out printf

    //Question 1:Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó
    public static void exe2Question1() {
        System.out.printf("%d\n",5);
    }

    //Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
    public static void exe2Question2() {
        System.out.printf(Locale.US,"%,d\n",100000000);
    }

    //Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau
    public static void exe2Question3() {
        System.out.printf("%-15.4f",5.567098);
    }

    //Question 4:Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định dạng như sau:
    //Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
    //Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
    public static void exe2Question4() {
        System.out.printf("\n%s","Tên tôi là " + "Ngan" + " và tôi đang độc thân\n" );
    }

    //Question 5: Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s
    public static void exe2Question5() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.printf("%s\n", LocalDateTime.now().format(formatter));
    }

    //Question 6: In ra thông tin account (như Question 8 phần FOREACH) theo định dạng table (giống trong Database)
    public static void exe2Question6(Account[] accounts) {
        System.out.printf("%-10s %-10s","Id", "Name");
        for(Account account : accounts) {
            System.out.printf("\n%-10s %-10s", account.getAccountId(), account.getFullName());
        }
    }


    //////////Exercise 3 (Optional): Date Format

    //Question 1: In ra thông tin Exam thứ 1 và property create date sẽ được format theo định dạng vietnamese
    public static void exe3Question1(Exam exam) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("vi","VN"));
        System.out.println(exam.getCreationDate().format(formatter));

    }

    //Question 2: In ra thông tin: Exam đã tạo ngày nào theo định dạng Năm – tháng – ngày – giờ – phút – giây
    public static void exe3Question2(Exam exam) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(exam.getCreationDate().format(formatter));
    }

    //Question 3: Chỉ in ra năm của create date property trong Question 2
    public static void exe3Question3(Exam exam) {
        System.out.println(exam.getCreationDate().getYear());
    }

    //Question 4: Chỉ in ra tháng và năm của create date property trong Question 2
    public static void exe3Question4(Exam exam) {
        System.out.println(exam.getCreationDate().getMonth().getValue() + " " + exam.getCreationDate().getYear());
    }

    //Question 5: Chỉ in ra "MM-DD" của create date trong Question 2
    public static void exe3Question5(Exam exam) {
        System.out.println(exam.getCreationDate().getMonth().getValue() + " " + exam.getCreationDate().getDayOfMonth());
    }

    //////////Exercise 4 (Optional): Random Number

    //Question 1: In ngẫu nhiên ra 1 số nguyên
    public static void exe4Question1() {
        Random random = new Random();
        System.out.println(random.nextInt(1000));
    }

    //Question 2: In ngẫu nhiên ra 1 số thực
    public static void exe4Question2() {
        Random random = new Random();
        System.out.println(random.nextDouble());
    }

    //Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
    public static void exe4Question3() {
        String[] names = {"Orm","Ling","Korn","Kwong"};
        Random random = new Random();
        System.out.println(names[random.nextInt(names.length)]);
    }

    private static long getRandomTimeBetweenTwoDates(String startDate, String endDate) {
        long beginTime = Timestamp.valueOf(startDate).getTime();
        long endTime = Timestamp.valueOf(endDate).getTime();
        long diff = endTime - beginTime + 1;
        return beginTime + (long) (Math.random() * diff);
    }

    //Question 4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
    public static void exe4Question4() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date randomDate = new Date(getRandomTimeBetweenTwoDates("1995-07-24 00:00:00", "1995-12-20 00:00:00"));
        System.out.println(dateFormat.format(randomDate));
    }

    //Question 5: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
    public static void exe4Question5() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String datePrevious = LocalDateTime.now().plusYears(-1).format(formatter);
        String dateNow = LocalDateTime.now().format(formatter);
        Date randomDate = new Date(getRandomTimeBetweenTwoDates(datePrevious, dateNow));
        System.out.println(dateFormat.format(randomDate));
    }

    //Question 6: Lấy ngẫu nhiên 1 ngày trong quá khứ
    public static void exe4Question6() {}

    //Question 7: Lấy ngẫu nhiên 1 số có 3 chữ số
    public static void exe4Question7() {
        Random random = new Random();
        System.out.println(random.nextInt(900) + 100);
    }

    ////////Exercise 5: Input from console

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

    //Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
    public static void exe5Question1() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu 1: ");
        myObj.nextInt();
        System.out.println("Nhap so nguyen thu 2: ");
        myObj.nextInt();
        System.out.println("Nhap so nguyen thu 3: ");
        myObj.nextInt();
    }

    //Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
    public static void exe5Question2() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap so thuc thu 1: ");
        myObj.nextFloat();
        System.out.println("Nhap so thuc thu 2: ");
        myObj.nextFloat();
    }

    //Question 3: Viết lệnh cho phép người dùng nhập họ và tên
    public static void exe5Question3() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        myObj.nextLine();
    }

    //Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
    public static void exe5Question4() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ngay sinh nhat: dd/MM/yyyy");
        myObj.nextLine();
    }

    //Question 5: Viết lệnh cho phép người dùng tạo account (viết thành method)
    //Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào chương trình sẽ chuyển thành Position.Dev, Position.Test,Position.ScrumMaster, Position.PM
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

    //Question 6:Viết lệnh cho phép người dùng tạo department (viết thành method)
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

    //Question 7: Nhập số chẵn từ console
    public static void exe5Question7() {
        Scanner myObj = new Scanner(System.in);
        while (true){
            System.out.println("Nhap so chan: ");
            if(myObj.hasNextInt()){
                if(myObj.nextInt() %2 == 0){
                    break;
                }
            }else {
                System.out.println("Nhập sai vui lòng nhập lại");
                myObj.nextLine();
            }
        }

    }

    //Question 8:Viết chương trình thực hiện theo flow sau:
    //Bước 1: Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
    //Bước 2: Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạodepartment
    //Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
    //lại" và quay trở lại bước 1
    public static void exe5Question8() {
        Scanner myObj = new Scanner(System.in);
        while (true){
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
            int temp = myObj.nextInt();
            if(temp == 1){
                exe5Question5();
                break;
            }else if(temp == 2){
                exe5Question6();
                break;
            }
            System.out.println("Mời bạn nhập lại");
        }
    }


    //Question 9:Viết method cho phép người dùng thêm group vào account theo flow sau:
    //Bước 1:
    //In ra tên các usernames của user cho người dùng xem
    //Bước 2:
    //Yêu cầu người dùng nhập vào username của account
    //Bước 3:
    //In ra tên các group cho người dùng xem
    //Bước 4:
    //Yêu cầu người dùng nhập vào tên của group
    //Bước 5:
    //Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó .
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

    //Question 10: Tiếp tục Question 8 và Question 9 Bổ sung thêm vào bước 2 của Question 8 như sau:
    //Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào account
    //Bổ sung thêm Bước 3 của Question 8 như sau: Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
    //text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
    //không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
    //dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để kết thúc chương trình)
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


    //Question 11: Tiếp tục Question 10 Bổ sung thêm vào bước 2 của Question 8 như sau: Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
    //Bước 1:
    //In ra tên các usernames của user cho người dùng xem
    //Bước 2:
    //Yêu cầu người dùng nhập vào username của account
    //Bước 3:
    //Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
    //Bước 4:
    //Thêm account vào group chương trình vừa chọn ngẫu nhiên
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

    ////////Exercise 6 (Optional): Method

    //Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
    public static void exe6Question1(){
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
    }

    //Question 2: Tạo method để in thông tin các account
    public static void exe6Question2(Account[] accounts){
        for(Account account:accounts){
            System.out.println("id: " + account.getAccountId());
            System.out.println("full name: " + account.getFullName());
            System.out.println("email: " + account.getEmail());
            System.out.println("username: " + account.getUserName());
        }
    }

    //Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10
    public static void exe6Question3(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}