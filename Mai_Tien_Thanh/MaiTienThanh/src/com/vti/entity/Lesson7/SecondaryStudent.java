package MaiTienThanh.src.com.vti.entity.Lesson7;

public final class SecondaryStudent extends Student{
    private static int countSecondaryStudent = 0;

    public SecondaryStudent(int id, String name){
        super(id, name);
        countSecondaryStudent++;
    }
    public static int getCountSecondaryStudent(){
        return countSecondaryStudent;
    }
}
