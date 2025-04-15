import model.HighSchoolStudent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        highSchoolStudent.setId(1);
        highSchoolStudent.setName("Nam");
        highSchoolStudent.setClazz("Chuyen Van");
        highSchoolStudent.setDesiredUniversity("Dai hoc cong nghe");
        System.out.println(highSchoolStudent.toString());
    }
}