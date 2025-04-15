package MaiTienThanh.src.com.vti.backend.Lesson4;

public class Student {
    private int studentID;
    private String studentName;
    private String hometown;
    private float grade;

    public Student(String studentName, int studentID, String hometown) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.hometown = hometown;
        grade = 0.0f;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    public void addGrade(float plusgrade) {
        this.grade += plusgrade;
    }

    @Override
    public String toString() {
        return "\n" +
                "Name: " + studentName + "\n" +
                "StudentID: " + studentID + "\n" +
                "Hometown: " + hometown + "\n" +
                "Grade: " + (grade <4 ? "Yếu": ((grade >=4 & grade < 6)? "Trung bình":((grade >=6 & grade <8)? "Khá":"Giỏi")));
    }
}


