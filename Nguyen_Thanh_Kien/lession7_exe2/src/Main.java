import model.PrimaryStudent;
import model.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.printf("%.2f\n", MyClass.sum(3));

//        Student student = new Student(1, "test");

        Student primary = new PrimaryStudent(2,"Kien");
        primary.study();
    }
}