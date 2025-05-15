package fontend;
import backend.Exercise2;
import entity.Student;

public class Program2 {
    public static void main(String[] args) {
        Exercise2 ex2 = new Exercise2();
        ex2.question1();

        Student student = new Student("Nguyễn Văn A");
        System.out.println("Name: " + student.getName());
        System.out.println("Old Getter ID: " + student.getId()); // Deprecated
        System.out.println("New Getter ID: " + student.getFormattedId());
    }
}