import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

// Question 1 :
        int a = 5;
        System.out.println("số nguyên a = " + a);
//Question 2 :
        int b = 100000000;
        System.out.printf("%,d%n", 100000000);
//Question 3 :

        System.out.printf("̀%.4f%n" , 5.567098);
//Question 4 :
        String name = "Nguyen Xuan Tai" ;
        System.out.println("Ten toi la : " + name + " ? "+"  toi dang doc than");

//Question 5:
    String T2 = "MM-dd-yyyy HH:mm:ss";
    SimpleDateFormat sdf = new SimpleDateFormat(T2);
    String t2 = sdf.format(new Date());
    System.out.printf(t2,"%n");
        System.out.println("");


//Question 6 :

        Department dp1 = new Department(1, "VTI2");
        Department dp2 = new Department(2, "VTI1");

        Position p1 = new Position(1,PositionName.DEV);
        Position p2 = new Position(2,PositionName.PM);

        Group GR1 = new Group();
        GR1.id =1;
        GR1.name ="Nguyen Xuan Tai";
        GR1.creatorID = 1001;


        Group GR2 = new Group();
        GR2.id =2;
        GR2.name ="Nguyen Xuan Minh";
        GR2.creatorID = 2001;


        Account ac1 = new Account();
        ac1.id =1;
        ac1.email = "nguyen@gmail.com";
        ac1.fullName = "Nguyen Xuan Tai";
        ac1.userName = "tai";
        ac1.department = dp1;
        ac1.position = p1;

        Account ac2 = new Account();
        ac2.id =2;
        ac2.email = "SangSoChi@gmail.com";
        ac2.userName ="ssss";
        ac2.fullName = "Pham CU Sang";
        ac2.department = dp2;
        ac2.position = p2;

        Group[] groups1 = {GR1, GR2};
   ac2.groups = groups1;
   Account[] accounts1 = {ac1, ac2};
   GR1.accounts = accounts1;


        System.out.printf("+----+-----------------+-------------+------------+------------+------------+------------+---------------------+------------+%n");
        System.out.printf("| ID | Email           | Username    | Full Name  | Department | Position   | Created    | Groups              | Join Date  |%n");
        System.out.printf("+----+-----------------+-------------+------------+------------+------------+------------+---------------------+------------+%n");


        for (Account acc : accounts1) {
            System.out.printf("| %-2d | %-15s | %-11s | %-10s | %-10s | %-10s | %-10s | %-19s | %-10s |%n",
                    acc.id, acc.email, acc.userName, acc.fullName, acc.department.DepartmentName,
                    acc.position.name, acc.createDate, acc.groups, acc.joinDate);
        }


// Exercise 3 : Date Format

//Question 1:
        TypeQuestion tq1 = new TypeQuestion();
        tq1.id =1;
        tq1.name = TypeName.Essay;

        TypeQuestion tq2 = new TypeQuestion();
        tq2.id =2;
        tq2.name = TypeName.Multiple_choise;


        CategoryQuestion c1 = new CategoryQuestion();
        c1.id= 1;
        c1.name = CategoryName.Java;

        CategoryQuestion c2 = new CategoryQuestion();
        c2.id = 2;
        c2.name =CategoryName.NET;

        Question q1 = new Question();
        q1.id = 1;
        q1.content = "hai huoc";
        q1.CategoryID =c1;
        q1.TypeID = tq1;
        q1.CreatorID = 111;
        q1.createDate= LocalDateTime.now();

        Question q2 = new Question();
        q2.id = 2;
        q2.content = "vui ve";
        q2.CategoryID =c2;
        q2.TypeID = tq2;
        q2.CreatorID = 121212;
        q2.createDate= LocalDateTime.now();

        Question q3 = new Question();
        q3.id = 3;
        q3.content = "kho tinh";
        q3.CategoryID =c1;
        q3.TypeID = tq2;
        q3.CreatorID = 232323;
        q3.createDate= LocalDateTime.now();


        Exam ex1 = new Exam();
        ex1.id = 1;
        ex1.Code =101;
        ex1.title ="hoan thanh thanh";
        ex1.categoryID =c1;
        ex1.duration = LocalDate.now();
    ex1.createDate = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("vi", "VN"));
        String fomartDate = ex1.createDate.format(format);

        System.out.println(ex1.toString());

        Exam ex2 = new Exam();
        ex2.id = 2;
        ex2.Code =1201;
        ex2.title ="hnh thSSanh";
        ex2.categoryID =c2;
        ex2.duration = LocalDate.now();
        ex2.createDate = LocalDate.now();

        Question[] questions1 = {q1,q2,q3};
        Question[] questions2 = {q1,q3};
        ex1.questions = questions1;
        ex2.questions = questions2;

        Exam[] exams1 = {ex1,ex2};
        Exam[] exams2 = {ex1};
        q1.exams = exams2;
        q2.exams = exams1;


//Question 2 :



        LocalDateTime fullDateTime = ex2.createDate.atTime(LocalTime.now());
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyyy HH:mm:ss", new Locale("vi", "VN"));
        String fomartDate1 = fullDateTime.format(format1);

        System.out.println("===== Thông tin Exam2 =====");
        System.out.println("ID: " + ex2.id);
        System.out.println("Mã Code: " + ex2.Code);
        System.out.println("Tiêu đề: " + ex2.title);
        System.out.println("Exam đã tạo ngày: " + fomartDate1);


//Question 3 :Chỉ in ra năm của create date property trong Question 2
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy", new Locale("vi", "VN"));
        String fomartDate3 = ex2.createDate.format(format3);
        System.out.println( "nam " + fomartDate3);

 //Question 4 :Chỉ in ra tháng và năm của create date property trong Question 2
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("MM-yyyy", new Locale("vi", "VN"));
        String fomartDate4 = ex2.createDate.format(format4);
        System.out.println( "thang + nam " + fomartDate4);

 //Question 5 :Chỉ in ra "MM-DD" của create date trong Question 2
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("MM-DD", new Locale("vi", "VN"));
        String fomartDate5 = ex2.createDate.format(format5);
        System.out.println( "ngay + ngay thu bao nhieu cua nam " + fomartDate5);
    }    }