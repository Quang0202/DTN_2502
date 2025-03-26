import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // Departments
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketing");
        Department d3 = new Department(3, "IT");

        System.out.println("Department: " + d1.getDepartmentName());
        System.out.println("Department: " + d2.getDepartmentName());
        System.out.println("Department: " + d3.getDepartmentName());

        // Positions
        Position p1 = new Position(1, "Dev");
        Position p2 = new Position(2, "Test");
        Position p3 = new Position(3, "PM");

        System.out.println("Position: " + p1.getPositionName());
        System.out.println("Position: " + p2.getPositionName());
        System.out.println("Position: " + p3.getPositionName());

        // Accounts
        Account a1 = new Account(1, "a1@gmail.com", "user1", "User One", d1, p1, LocalDate.now());
        Account a2 = new Account(2, "a2@gmail.com", "user2", "User Two", d2, p2, LocalDate.now());
        Account a3 = new Account(3, "a3@gmail.com", "user3", "User Three", d3, p3, LocalDate.now());

        System.out.println("Account Username: " + a1.getUsername());
        System.out.println("Account Username: " + a2.getUsername());
        System.out.println("Account Username: " + a3.getUsername());

        // Groups
        Group g1 = new Group(1, "Group1", a1, LocalDate.now());
        Group g2 = new Group(2, "Group2", a2, LocalDate.now());
        Group g3 = new Group(3, "Group3", a3, LocalDate.now());

        System.out.println("Group: " + g1.getGroupName());
        System.out.println("Group: " + g2.getGroupName());
        System.out.println("Group: " + g3.getGroupName());

        // GroupAccounts
        GroupAccount ga1 = new GroupAccount(g1, a1, LocalDate.now());
        GroupAccount ga2 = new GroupAccount(g2, a2, LocalDate.now());
        GroupAccount ga3 = new GroupAccount(g3, a3, LocalDate.now());

        System.out.println("GroupAccount User: " + ga1.getAccount().getUsername());
        System.out.println("GroupAccount User: " + ga2.getAccount().getUsername());
        System.out.println("GroupAccount User: " + ga3.getAccount().getUsername());

        // TypeQuestions
        TypeQuestion tq1 = new TypeQuestion(1, "Essay");
        TypeQuestion tq2 = new TypeQuestion(2, "Multiple-Choice");
        TypeQuestion tq3 = new TypeQuestion(3, "True/False");

        System.out.println("TypeQuestion: " + tq1.getTypeName());

        // CategoryQuestions
        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion cq3 = new CategoryQuestion(3, "SQL");

        System.out.println("CategoryQuestion: " + cq1.getCategoryName());

        // Questions
        Question q1 = new Question(1, "What is Java?", cq1, tq1, a1, LocalDate.now());
        Question q2 = new Question(2, "Explain OOP.", cq2, tq2, a2, LocalDate.now());
        Question q3 = new Question(3, "What is SQL?", cq3, tq3, a3, LocalDate.now());

        System.out.println("Question Content: " + q1.getContent());

        // Answers
        Answer ans1 = new Answer(1, "Java is a programming language.", q1, true);
        Answer ans2 = new Answer(2, "OOP is a paradigm.", q2, true);
        Answer ans3 = new Answer(3, "SQL is a query language.", q3, true);

        System.out.println("Answer: " + ans1.getContent());
        System.out.println("Answer: " + ans2.getContent());
        System.out.println("Answer: " + ans3.getContent());

        // Exams
        Exam e1 = new Exam(1, "EX001", "Java Basics", cq1, 60, a1, LocalDate.now());
        Exam e2 = new Exam(2, "EX002", ".NET Basics", cq2, 90, a2, LocalDate.now());
        Exam e3 = new Exam(3, "EX003", "SQL Basics", cq3, 45, a3, LocalDate.now());

        System.out.println("Exam Title: " + e1.getTitle());

        // ExamQuestions
        ExamQuestion eq1 = new ExamQuestion(e1, q1);
        ExamQuestion eq2 = new ExamQuestion(e2, q2);
        ExamQuestion eq3 = new ExamQuestion(e3, q3);

        System.out.println("ExamQuestion - Question: " + eq1.getQuestion().getContent());
        System.out.println("ExamQuestion - Question: " + eq2.getQuestion().getContent());
        System.out.println("ExamQuestion - Question: " + eq3.getQuestion().getContent());
    }
}