import model.Person;
import model.Student;
import model.Teacher;
import model.VietnamesePhone;

public class Aptraction {
    public static void main(String[] args) {

        Person person = new Student("nguyen van a","10A1");
        Person person1 = new Teacher("nguyen van b","Toan");

        person.diemDanh();
        person1.diemDanh();

        VietnamesePhone vietnamesePhone = new VietnamesePhone();
        vietnamesePhone.insertContact("nguyen van a","1234456");
        vietnamesePhone.searchContact("nguyen van a");
    }
}
