package model;

public class Studen2 extends Student{

    public Studen2(String name, String clazz) {
        super(name, clazz);
    }

    @Override
    public void diemDanh() {
        System.out.println(super.getName() + " điểm danh");
    }

}
