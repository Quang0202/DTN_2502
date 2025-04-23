package MaiTienThanh.src.com.vti.entity.Lesson7;

public final class PrimaryStudent extends Student{
    private static int countPrimaryStudent = 0;
    public PrimaryStudent(int id, String name){
        super(id, name);
        countPrimaryStudent++;
    }
    public static int getCountPrimaryStudent(){
        return countPrimaryStudent;
    }
}
