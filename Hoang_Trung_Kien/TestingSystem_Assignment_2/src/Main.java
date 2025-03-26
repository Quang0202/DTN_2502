import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";
        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Bán hàng";

        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = "Dev";
        Position position2 = new Position();
        position2.positionId = 1;
        position2.positionName = "Test";
        Position position3 = new Position();
        position3.positionId = 1;
        position3.positionName = "Scrum Master";

        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "Testing System";
        Group group2 = new Group();
        group2.groupId = 1;
        group2.groupName = "Development";
        Group group3 = new Group();
        group3.groupId = 1;
        group3.groupName = "Management";

        Account account1 = new Account();
        account1.accountId = 1;
        account1.department = department2;
        account1.position = position2;
        account1.userName = "dimsum";
        account1.email = "elegantmagic2003@gmail.com";
        account1.createDate = LocalDateTime.now();
        account1.fullName = "Quang Hiền";
        account1.gender = Gender.MALE;
        Group[] groups1 = {group1, group2};
        account1.groups = groups1;
        Account account2 = new Account();
        account2.accountId = 2;
        account2.department = department3;
        account2.position = position3;
        account2.userName = "elegantmagic";
        account2.email = "elegantmagic2112@gmail.com";
        account2.createDate = LocalDateTime.now();
        account2.fullName = "Trương Đình Hoàng";
        account2.gender = Gender.MALE;
        Group[] groups2 = {group1, group3};
        account2.groups = groups2;
        Account account3 = new Account();
        account3.accountId = 3;
        account3.department = department2;
        account3.position = position3;
        account3.userName = "ryu";
        account3.email = "hoangtusunkim@gmail.com";
        account3.createDate = LocalDateTime.now();
        account3.fullName = "Đặng Tiến Hoàng";
        account3.gender = Gender.MALE;
        Group[] groups3 = {group3, group2};
        account3.groups = groups3;
        Account account4 = new Account();
        account4.accountId = 4;
        account4.department = department1;
        account4.position = position2;
        account4.userName = "felix";
        account4.email = "felixryu@gmail.com";
        account4.createDate = LocalDateTime.now();
        account4.fullName = "Kiên Hoàng";
        account4.gender = Gender.MALE;
        Group[] groups4 = {group1};
        account4.groups = groups4;
        Account account5 = new Account();
        account5.accountId = 5;
        account5.department = department3;
        account5.position = position1;
        account5.userName = "dimsum";
        account5.email = "shiawase@gmail.com";
        account5.createDate = LocalDateTime.now();
        account5.fullName = "Lạc Long Quân";
        account5.gender = Gender.MALE;
        Group[] groups5 = {group1, group2, group3};
        account5.groups = groups5;

        Account[] accounts1 = {account1, account2, account4, account5};
        group1.accounts = accounts1;
        Account[] accounts2 = {account1, account3, account5};
        group2.accounts = accounts2;
        Account[] accounts3 = {account2, account3, account5};
        group3.accounts = accounts3;

        TypeQuestion type1 = new TypeQuestion();
        type1.typeID = 1;
        type1.typeName = QType.ESSAY;
        TypeQuestion type2 = new TypeQuestion();
        type2.typeID = 2;
        type2.typeName = QType.MULTIPLE_CHOICE;

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryId = 1;
        categoryQuestion1.categoryName = "C++";
        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.categoryId = 2;
        categoryQuestion2.categoryName = "Java";
        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.categoryId = 3;
        categoryQuestion3.categoryName = "PHP";

        Question question1 = new Question();
        question1.questionId = 1;
        question1.content = "Câu Hỏi về PHP";
        question1.categoryQuestion = categoryQuestion1;
        question1.typeQuestion = type1;
        question1.creator = account2;
        Question question2 = new Question();
        question2.questionId = 2;
        question2.content = "Câu Hỏi về Java";
        question2.categoryQuestion = categoryQuestion2;
        question2.typeQuestion = type2;
        question2.creator = account3;
        Question question3 = new Question();
        question3.questionId = 3;
        question3.content = "Câu Hỏi về C++";
        question3.categoryQuestion = categoryQuestion3;
        question3.typeQuestion = type1;
        question3.creator = account4;
        Question question4 = new Question();
        question4.questionId = 4;
        question4.content = "Câu Hỏi về Ruby";
        question4.categoryQuestion = categoryQuestion1;
        question4.typeQuestion = type2;
        question4.creator = account1;

        Answer answer1 = new Answer();
        answer1.answerId = 1;
        answer1.content = "Trả lời 01";
        answer1.question = question1;
        answer1.isCorrect = true;
        Answer answer2 = new Answer();
        answer2.answerId = 2;
        answer2.content = "Trả lời 02";
        answer2.question = question1;
        answer2.isCorrect = false;
        Answer answer3 = new Answer();
        answer3.answerId = 3;
        answer3.content = "Trả lời 03";
        answer3.question = question2;
        answer3.isCorrect = true;
        Answer answer4 = new Answer();
        answer4.answerId = 4;
        answer4.content = "Trả lời 04";
        answer4.question = question4;
        answer4.isCorrect = false;

        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = "VTIQ001";
        exam1.title = "Đề thi C#";
        exam1.categoryQuestion = categoryQuestion1;
        exam1.duration = 60;
        exam1.creator = account5;
        exam1.createDate = LocalDateTime.now();
        Question[] questions1 = {question1, question4};
        exam1.questions = questions1;
        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = "VTIQ002";
        exam2.title = "Đề thi PHP";
        exam2.categoryQuestion = categoryQuestion1;
        exam2.duration = 90;
        exam2.creator = account2;
        Question[] questions2 = {question2};
        exam2.questions = questions2;
        Exam exam3 = new Exam();
        exam3.examId = 3;
        exam3.code = "VTIQ003";
        exam3.title = "Đề thi Java";
        exam3.categoryQuestion = categoryQuestion1;
        exam3.duration = 120;
        exam3.creator = account1;
        Question[] questions3 = {question3};
        exam3.questions = questions3;

        Exam[] exams1 = {exam1};
        question1.exams = exams1;
        Exam[] exams2 = {exam2};
        question2.exams = exams1;
        Exam[] exams3 = {exam3};
        question3.exams = exams1;
        Exam[] exams4 = {exam1};
        question4.exams = exams1;

        int a = 5;
        System.out.println("Question 1:");
        System.out.printf("%d\n", a);

        int b = 100000000;
        System.out.println("Question 2:");
        System.out.printf("%,d\n", b);

        float c = 5.567098f;
        System.out.println("Question 3:");
        System.out.printf("%.4f%n\n", c);

        String hoten = "Nguyen Van A";
        System.out.println("Question 4:");
        System.out.printf("Tôi tên là %s và tôi có người yêu\n", hoten);

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh'h':mm'p':ss's'");
        System.out.println("Question 5:");
        System.out.printf(date.format(dateTimeFormatter)+"\n");

        System.out.println("Question 6:");
        Excercise2 q = new Excercise2();
        q.ques6(accounts1);

        System.out.println("Question 1:");
        System.out.print(exam1.examId +" "+ exam1.code +" "+ exam1.title +" "+ exam1.categoryQuestion.categoryName +" "+ exam1.duration +" "+ exam1.creator.fullName+" ");
        Locale vnLoc = new Locale("vi", "VN");
        ZonedDateTime zonedDateTime = exam1.createDate.atZone(ZoneId.of("Asia/Ho_Chi_Minh"));
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(vnLoc);
        System.out.printf(zonedDateTime.format(dateTimeFormatter1)+"\n");

        System.out.println("Question 2:");
        Exercise3 q1 = new Exercise3();
        q1.ques2(exam1);

        System.out.println("Question 3:");
        q1.ques3(exam1);

        System.out.println("Question 4:");
        q1.ques4(exam1);

        System.out.println("Question 5:");
        q1.ques5(exam1);

        System.out.println("Question 1:");
        Random random = new Random();
        int intRandom = random.nextInt();
        System.out.println(intRandom);

        System.out.println("Question 2:");
        Float floatRandom = random.nextFloat();
        System.out.println(floatRandom);

        System.out.println("Question 3:");
        int index = random.nextInt(0, accounts1.length);
        System.out.println(accounts1[index].fullName);

        System.out.println("Question 4:");
        LocalDate dateTime = LocalDate.of(2024, 07, 24);
        long startDate = dateTime.toEpochDay();
        dateTime = LocalDate.of(2024, 12, 20);
        long endDate = dateTime.toEpochDay();
        long ranDay = random.nextLong(startDate, endDate);
        System.out.println(LocalDate.ofEpochDay(ranDay));

        System.out.println("Question 5:");
        LocalDate date1 = LocalDate.now();
        LocalDate lastYear = LocalDate.of(date1.getYear()-1, date1.getMonth(), date1.getDayOfMonth());

        System.out.println("Question 7:");
        int randomHundreds = random.nextInt(100, 1000);
        System.out.println(randomHundreds);


    }
}