import javax.xml.transform.stream.StreamSource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void goToSchool(int a, int b) {
//        System.out.println(a + " " + b);
//    }
    public static void main(String[] args) {
//        byte a =12;
//        float b = 12.3f;
//        double c = 6.4333;
//        System.out.println(a);
//        System.out.println(b);
//        char ch = 97;
//        String str = "Hello World";
//        System.out.println(ch);
//        System.out.println(str);
//        boolean flag = true;
//        System.out.println(flag);
//        Date date = new Date();
//        System.out.println(date);
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        Gender gender = Gender.MALE;
//        System.out.println(gender);
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(arr[1]);
//        System.out.println(arr.length);
//
//        arr[1]=10;
//        String[] strArr = {"a","b"};
//        LocalDate[] lodArr = {};
//
//        Cat cat1 = new Cat();
//        cat1.mauLong = "Brown";
//        cat1.gender = Gender.MALE;
//        cat1.loai = "Belgan";
//        cat1.soTai = 1;
//        cat1.soTuoi = 1;
//        cat1.keu();
//        System.out.println(cat1.mauLong);
//        Cat cat2 = new Cat();
//        cat2.mauLong = "Black";
//        cat2.loai = "Meo cỏ";
//        System.out.println(cat2.mauLong);
//        cat2.keu();
//
//        goToSchool(1, 2);
//
//        int x;
//        x = a;
//        System.out.println(x);
//
//        Department department1 = new Department();
//        department1.departmentId =1;
//        department1.departmentName = "sale";
//
//        Department department2 = new Department();
//        department1.departmentId =2;
//        department1.departmentName = "marketing";
//
//        System.out.println(department1.departmentId + " " + department1.departmentName);
//        System.out.println(department2.departmentId + " " + department2.departmentName);
//
//        Position position1 = new Position();
//        Account account1 = new Account();
//        account1.accountId =1;
//        account1.department = department1;
//        account1.position = position1;
//
//        Account account2 = new Account();
//        account2.accountId =2;
//        account2.department = department2;
//        account2.position = position1;
//
//        System.out.println(account1.department.departmentId + " " + account1.department.departmentName);
//
//        Group group1 = new Group();
//        group1.groupId =1;
//        group1.groupName = "group1";
//        Group group2 = new Group();
//        group2.groupId =2;
//        group2.groupName = "group2";
//
//        Group[] groups1 = {group1, group2};
//        account1.groups = groups1;
//
//        Account[] accounts1 = {account1};
//        group1.accounts = accounts1;
//
//        System.out.println(account1.groups[0].groupName);
//
//        System.out.println(account1);
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        department1.departmentId =1;
        department2.departmentId =2;
        department3.departmentId =3;
        department1.departmentName = "Sale";
        department2.departmentName = "Marketing";
        department3.departmentName = "Ban hang";

        Position position1 = new Position();
        Position position2 = new Position();
        Position position3 = new Position();
        position1.positionId =1;
        position2.positionId =2;
        position3.positionId =3;
        position1.positionName ="Dev";
        position2.positionName ="Test";
        position3.positionName ="PM";

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        account1.accountId =1;
        account2.accountId =2;
        account3.accountId =3;
        account1.email ="test@gmail.com";
        account2.email ="test2@gmail.com";
        account3.email ="test3@gmail.com";
        account1.userName ="test";
        account2.userName ="test2";
        account3.userName ="test3";
        account1.fullName ="test";
        account2.fullName ="test2";
        account3.fullName ="test3";
        account1.department =department1;
        account2.department =department2;
        account3.department =department3;
        account1.position =position1;
        account2.position =position2;
        account3.position =position3;
        account1.createdate = LocalDateTime.now();
        account2.createdate = LocalDateTime.now();
        account3.createdate = LocalDateTime.now();

        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        group1.groupId = 1;
        group2.groupId = 2;
        group3.groupId = 3;
        group1.groupName = "Cao";
        group2.groupName = "Duc";
        group3.groupName = "Hieu";
        Account[] accounts = {account1, account2, account3};
        group1.createDate = LocalDateTime.now();
        group2.createDate = LocalDateTime.now();
        group3.createDate = LocalDateTime.now();
        Group[] groups = {group1, group2, group3};

        TypeQuestion typeQuestion1 = new TypeQuestion();
        TypeQuestion typeQuestion2 = new TypeQuestion();
        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion1.typeId =1;
        typeQuestion2.typeId =2;
        typeQuestion3.typeId =3;
        typeQuestion1.typeName = "Essay";
        typeQuestion2.typeName = "Essay";
        typeQuestion3.typeName = "Multiple_Choices";

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion1.categoryId =1;
        categoryQuestion2.categoryId =2;
        categoryQuestion3.categoryId =3;
        categoryQuestion1.categoryName = "Java";
        categoryQuestion2.categoryName = ".Net";
        categoryQuestion3.categoryName = "Sql";

        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();
        question1.questionId =1;
        question2.questionId =2;
        question3.questionId =3;
        question1.content = "This is a question";
        question2.content = "This is a question";
        question3.content = "This is a question";
        question1.categoryQuestion =categoryQuestion1;
        question2.categoryQuestion =categoryQuestion2;
        question3.categoryQuestion =categoryQuestion3;
        question1.typeQuestion =typeQuestion1;
        question2.typeQuestion =typeQuestion2;
        question3.typeQuestion =typeQuestion3;
        question1.createDate =LocalDateTime.now();
        question2.createDate =LocalDateTime.now();
        question3.createDate =LocalDateTime.now();
        Account[] accounts1 = {account1, account2, account3};
        Question[] questions = {question1, question2,question3};

        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();
        answer1.answerId =1;
        answer2.answerId =2;
        answer3.answerId =3;
        answer1.content = "This is a answer";
        answer2.content = "This is a answer";
        answer3.content = "This is a answer";
        answer1.question =question1;
        answer2.question =question2;
        answer3.question =question3;
        boolean answer1Correct = true;
        boolean answer2Correct = true;
        boolean answer3Correct = false;

        Exam exam1 = new Exam();
        Exam exam2 = new Exam();
        Exam exam3 = new Exam();
        exam1.examId = 1;
        exam2.examId = 2;
        exam3.examId = 3;
        exam1.code = 123;
        exam2.code = 124;
        exam3.code = 125;
        exam1.title = "This is a exam";
        exam2.title = "This is a exam";
        exam3.title = "This is a exam";
        exam1.questions = questions;
        exam2.questions = questions;
        exam3.questions = questions;
        exam1.duration = 60;
        exam2.duration = 90;
        exam3.duration = 120;
        exam1.creator = account1;
        exam2.creator = account2;
        exam3.creator = account3;
        exam1.createDate = LocalDateTime.now();
        exam2.createDate = LocalDateTime.now();
        exam3.createDate = LocalDateTime.now();

//        System.out.println(account1.department.departmentId + " " + account1.department.departmentName);
//        System.out.println(account1.position.positionId + " " + account1.position.positionName);
//        System.out.println(account1.accountId + " " + account1.email + "" + account1.userName + account1.fullName + " " + account1.department.departmentId + " " + account1.position.positionName + " " + account1.createdate);
//       // System.out.println(group1.groupId + " " + group1.groupName + " "+ group1.creator.accountId + " " + group1.createDate);
//        System.out.println(typeQuestion1.typeId + " " + typeQuestion1.typeName);
//        System.out.println(categoryQuestion1.categoryId + " " + categoryQuestion1.categoryName);
//        System.out.println(question1.content + " " + question1.createDate + " " + question1.createDate);
//        System.out.println(answer1Correct + " " + answer1Correct);
//        System.out.println(answer2Correct + " " + answer2Correct);
//        System.out.println(answer3Correct + " " + answer3Correct);
//        System.out.println(answer1Correct + " " + answer2Correct + " " + answer3Correct);
//        System.out.println(exam1.examId + " " + exam1.code + " " + exam1.title);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(exam1.createDate.format(formatter));
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy");
        System.out.println(question2.createDate.format(formatter1));


    }
}