package MaiTienThanh.src.com.vti.backend.Lesson4;

public class HighSchoolStudent extends Studentq3 {
    private String clazz;
    private String desiredUniversity;

    public HighSchoolStudent(int studentID, String name, String clazz, String desiredUniversity) {
        super(studentID, name);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    public void hienThi(){
        System.out.println("Student's ID: " + studentID);
        System.out.println("Student's Name: " + name);
        System.out.println("Class: " + clazz);
        System.out.println("Desired University: " + desiredUniversity);
    }
}
