import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Departments
        Department dep1 = new Department(1, "Sales");
        Department dep2 = new Department(2, "Marketing");
        Department dep3 = new Department(3, "IT");

        List<Department> departments = new ArrayList<>();
        departments.add(dep1);
        departments.add(dep2);
        departments.add(dep3);

        // Positions
        Position pos1 = new Position(1, "Dev");
        Position pos2 = new Position(2, "Test");
        Position pos3 = new Position(3, "Scrum Master");
        Position pos4 = new Position(3, "PM");

        Position[] positions = { pos1, pos2, pos3, pos4 };

        // Groups
        Group group1 = new Group(1, "Testing System", LocalDate.of(2021, 1, 1));
        Group group2 = new Group(2, "Development", LocalDate.of(2020, 2, 1));
        Group group3 = new Group(3, "Sale", LocalDate.of(2019, 9, 23));

        Group[] groups = {group1, group2, group3};

        // Accounts
        Account acc1 = new Account(1, "nguyenvana@gmail.com", "nguyenvana", "Nguyễn Văn A", dep1, pos1, LocalDate.now());
        Account acc2 = new Account(2, "nguyenvanb@gmail.com", "nguyenvanb", "Nguyễn Văn B", dep2, pos2, LocalDate.of(2021, 3, 17));
        Account acc3 = new Account(3, "nguyenvanc@gmail.com", "nguyenvanc", "Nguyễn Văn C", dep3, pos3, LocalDate.now());

        Account[] accounts = {acc1, acc2, acc3};

        // Setting Groups for Accounts
        acc1.setGroups(new Group[]{group1, group2});
        acc2.setGroups(new Group[]{group2, group3});
        acc3.setGroups(new Group[]{group1, group3});

        // Setting Accounts for Groups
        group1.setAccounts(new Account[]{acc1, acc3});
        group2.setAccounts(new Account[]{acc1, acc2});
        group3.setAccounts(new Account[]{acc2, acc3});

        Exercise1 exercise1 = new Exercise1();
        exercise1.question1(acc2);
        exercise1.question2(acc2);
        exercise1.question3(acc2);
        exercise1.question4(acc1);
        Exercise1.question5(group1);
        Exercise1.question6(acc2);
        Exercise1.question7(acc1);
        Exercise1.question8(new Account[]{acc1, acc2, acc3});
        Exercise1.question9(new Department[]{dep1, dep2, dep3});
        Exercise1.question10(new Account[]{acc1, acc2, acc3});
        Exercise1.question11(new Department[]{dep1, dep2, dep3});
        Exercise1.question12(new Department[]{dep1, dep2, dep3});
        Exercise1.question13(new Account[]{acc1, acc2, acc3});
        Exercise1.question14(new Account[]{acc1, acc2, acc3});
        Exercise1.question15();
        Exercise1.question16(new Account[]{acc1, acc2, acc3}, new Department[]{dep1, dep2, dep3});
        Exercise1.question17(new Account[]{acc1, acc2, acc3}, new Department[]{dep1, dep2, dep3});

        Exercise2 exercise2 = new Exercise2();
        exercise2.question1();
        exercise2.question2();
        exercise2.question3();
        exercise2.question4();
        exercise2.question5();
        exercise2.question6(new Account[]{acc1, acc2, acc3});

        Exercise3 exercise3 = new Exercise3();

        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion cq3 = new CategoryQuestion(3, "SQL");

        Exam e1 = new Exam(1, "EX001", "Java Basics", cq1, 60, acc1, LocalDate.now());
        Exam e2 = new Exam(2, "EX002", ".NET Basics", cq2, 90, acc2, LocalDate.now());
        Exam e3 = new Exam(3, "EX003", "SQL Basics", cq3, 45, acc3, LocalDate.now());


        exercise3.question1(e1);
        exercise3.question2(new Exam[]{e1, e2, e3});
        exercise3.question3(new Exam[]{e1, e2, e3});
        exercise3.question4(new Exam[]{e1, e2, e3});
        exercise3.question5(new Exam[]{e1, e2, e3});

        Exercise4 exercise4 = new Exercise4();

        exercise4.question1();
        exercise4.question2();

        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        exercise4.question3(names);

        exercise4.question4();
        exercise4.question5();
        exercise4.question6();
        exercise4.question7();

        Exercise5 exercise5 = new Exercise5();
        exercise5.question1();
        exercise5.question2();
        exercise5.question3();
        exercise5.question4();
        exercise5.question5(positions);
        exercise5.question6(departments);
        exercise5.question7();
        exercise5.question8(positions, departments);
        exercise5.question9(accounts, groups);
        exercise5.question10(accounts, departments, positions, groups);
        exercise5.question11(accounts, groups);

        Exercise6 exercise6 = new Exercise6();

        exercise6.question1();
        exercise6.question2(accounts);
        exercise6.question3();
    }
}
