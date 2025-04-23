package MaiTienThanh.src.com.vti.entity.Lesson7;

public class Student {
    private int id;
    private String name;
    private static String college = "Đại học Bách Khoa";

    public static String getCollege(){
        return college;
    }
    public static void setCollege(String college){
        Student.college = college;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", College: " + college;
    }
}
