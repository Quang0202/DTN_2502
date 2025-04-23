package Exercise2.Q1;

public class Student implements IStudent {
    private int id;
    private String name;
    private int group;

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getGroup() { return group; }

    public void diemDanh() {
        System.out.println(name + " diem danh");
    }

    public void hocBai() {
        System.out.println(name + " dang hoc bai");
    }

    public void diDonVeSinh() {
        System.out.println(name + " dang di don ve sinh");
    }
}
