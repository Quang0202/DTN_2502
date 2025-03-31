import model.Person;
import model.Student;
import model.Teacher;

public class Program {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(12,"ngoại ngữ");
        teacher.getMajor();
        teacher.setName("nguyen van a");
        Student student = new Student("nguyen van a", "10A1");
        teacher.gotoSchool();
        System.out.println(teacher);
        Person person  = new Person();
        person = teacher;
    }
}
