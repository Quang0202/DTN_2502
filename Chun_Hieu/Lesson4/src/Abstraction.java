public class Abstraction {
    public static void main(String[] args) {
        Person person = new Student("Nguyen van a", "10A1");
        Person person2 = new Teacher("Nguyen van b", "Toan");

        person.diemDanh();
        person2.diemDanh();
    }
}
