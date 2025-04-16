import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Department dep1 = new Department(1, "Phòng A");
        Department dep2 = new Department(2, "Phòng B");
        Department dep3 = new Department(3, "Phòng C");
        Department[] departments = {dep1, dep2, dep3};


        String[] groupNames = {"Java", "C#", "JavaScript", "Python", "Java Advanced"};

        Exercise1 ex1 = new Exercise1();
        Exercise2 ex2 = new Exercise2();
        Exercise3 ex3 = new Exercise3();
        Exercise4 ex4 = new Exercise4();
        Exercise5 ex5 = new Exercise5();


         ex1.question1();
         ex1.question2();
         ex1.question3();
         ex1.question4();

         ex2.question1();

         ex3.question1();
         ex3.question2();
         ex3.question3();

         ex4.question1();
         ex4.question2();
         ex4.question3();
         ex4.question4();
         ex4.question5();
         ex4.question6();
         ex4.question7();
         ex4.question8(groupNames);
         ex4.question9(groupNames);
         ex4.question10();
         ex4.question11();
         ex4.question12();
         ex4.question13();
         ex4.question14();
         ex4.question15();
         ex4.question16();

         ex5.question1(dep1);
         ex5.question2(departments);
         ex5.question3(dep1);
         ex5.question4(dep1);
         ex5.question5(dep1, dep2);
         ex5.question6();
         ex5.question7();
    }
}
