package Question03;

public class RealHighSchoolStudent extends HighSchoolStudent {
    public RealHighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        super(id, name, clazz, desiredUniversity);
    }


    public void study() {
        System.out.println("📚 Học sinh cấp 3 đang học!");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Lớp: " + clazz + ", ĐH mong muốn: " + desiredUniversity;
    }
}

