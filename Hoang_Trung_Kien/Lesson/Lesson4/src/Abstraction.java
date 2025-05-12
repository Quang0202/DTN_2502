import model1.Person;
import model1.Student;
import model1.Student2;
import model1.Teacher;

public class Abstraction {
    public static void main(String[] args) {
        Person person = new Student("Kien hoang", 19, "English Studies");
        // Khong the khoi tao truc tiep class abstraction.
        Person person2 = new Teacher("Khanh Linh", "Japanlish");

        person2.doingHomework();
        person.doingHomework();

        Person p = new Student2("sdf ", 23, "sdf");
    }
}
