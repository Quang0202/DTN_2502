import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class Exercise_3_Date_Format {
    public static void main(String[] args) {


        // Deaprtment
        Department department1 = new Department();
        department1.department_id = 1;
        department1.department_name = "PKT";
        //Position
        Position position1 = new Position();
        position1.position_id = 1; position1.position_name = "Dev";
        //Group
        Group group1 = new Group();
        group1.group_id = 1; group1.group_name = "Development";
        // Account
        Account account1 = new Account();
        account1.account_id = 1; account1.Email = "nguyen@gmail.com"; account1.Username = "kienld"; account1.Full_Name = "Lai Duc Kien"; account1.department = department1;
        account1.position  = position1; account1.CreateDate = LocalDateTime.now(); Group[] groups = {group1};account1.groups = groups;

        // Category
        CategoryQuestion  categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryid = 1; categoryQuestion1.CategoryName = "Java KienLD";
        // Type question
        TypeQuestion  typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeid = 1; typeQuestion1.TypeName = "Essay";
        // Question
        Question question1 = new Question();

        question1.questionid = 1; question1.content = "Java KienLD"; question1.category = categoryQuestion1;  question1.type = typeQuestion1;
        question1.creator = account1; question1.CreateDate = LocalDateTime.now();
        // Exam
        Exam exam1 = new Exam();
        exam1.exam_id = 1; exam1.code = 101; exam1.title = "Exam 1"; exam1.category  = categoryQuestion1; exam1.duration = "60p";
        exam1.creator = account1; exam1.CreateDate = LocalDateTime.now();
        DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("vi", "VN"));
        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter formatter03 = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter formatter04 = DateTimeFormatter.ofPattern("MM/yyyy");
        DateTimeFormatter formatter05 = DateTimeFormatter.ofPattern("MM/DD");




        Question[] questions = {question1}; CategoryQuestion[] categoryQuestions = {categoryQuestion1};
        System.out.printf("%-5s |  %-25s | %-25s | %-25s   | %-25s | %-25s | %-25s | %-350s %n",  "id", "code", "title", "category", "duration", "creator", "CreateDate", "questions");

        Exam[] examcount = {exam1};
        for (Exam exams : examcount) {
            String CategoryQuestionName = "";
            String QuestionName = "";
            String AccountName = "";

            for( CategoryQuestion cq : categoryQuestions){
                CategoryQuestionName += cq.CategoryName + " ";
            }

            for (Question question : questions) {
                QuestionName += question.content + " ";
            }
            // Q1
            System.out.println("Q1");
            System.out.printf("%-5s |  %-25s | %-25s | %-25s   | %-25s | %-25s | %-25s | %-350s %n",  exams.exam_id, exams.code, exams.title, CategoryQuestionName.trim(), exams.duration, exams.creator,
                    exams.CreateDate.format(formatter01), QuestionName.trim());
                    QuestionName.trim();
            System.out.println("Q2");

            // Q2
            System.out.printf("%-5s |  %-25s | %-25s | %-25s   | %-25s | %-25s | %-25s | %-350s %n",  exams.exam_id, exams.code, exams.title, CategoryQuestionName.trim(), exams.duration, exams.creator,
                    exams.CreateDate.format(formatter02), QuestionName.trim());
            QuestionName.trim();
            System.out.println("Q3");
            System.out.printf("%-5s |  %-25s | %-25s | %-25s   | %-25s | %-25s | %-25s | %-350s %n",  exams.exam_id, exams.code, exams.title, CategoryQuestionName.trim(), exams.duration, exams.creator,
                    exams.CreateDate.format(formatter03), QuestionName.trim());
            QuestionName.trim();
            System.out.println("Q4");
            System.out.printf("%-5s |  %-25s | %-25s | %-25s   | %-25s | %-25s | %-25s | %-350s %n",  exams.exam_id, exams.code, exams.title, CategoryQuestionName.trim(), exams.duration, exams.creator,
                    exams.CreateDate.format(formatter04), QuestionName.trim());
            QuestionName.trim();
            System.out.println("Q5");
            System.out.printf("%-5s |  %-25s | %-25s | %-25s   | %-25s | %-25s | %-25s | %-350s %n",  exams.exam_id, exams.code, exams.title, CategoryQuestionName.trim(), exams.duration, exams.creator,
                    exams.CreateDate.format(formatter05), QuestionName.trim());
            QuestionName.trim();

        }










    }


}
