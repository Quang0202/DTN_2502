public class Program {
     public static void main(String[] args) {
        Teacher t = new Teacher(50, "Y te");
        t.getMajor();
        t.setName("nguyen van a");
        Student student = new Student("Nguyen van a", "lop 12");
        t.gotoSchool();
        System.out.println(t);
    }
}
