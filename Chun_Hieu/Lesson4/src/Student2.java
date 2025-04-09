public class Student2  extends Student{

    public Student2(String name, String clazz) {
        super(name, clazz);
    }
    @Override
    public void diemDanh() {
        System.out.println(super.getName() + " Diem danh");
    }
}
