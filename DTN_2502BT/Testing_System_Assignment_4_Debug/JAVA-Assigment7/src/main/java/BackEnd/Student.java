package BackEnd;

public class Student {
    protected int id;
    protected String name;
    static String college = "BKT University";
protected int moneyGroup;


    public Student(int id, String name, int moneyGroupq) {
        this.id = id;
        this.name = name;
        this.moneyGroup = moneyGroupq;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public int getMoneyGroup() {
        return moneyGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", moneyGroup=" + moneyGroup +
                '}';
    }

    public void setMoneyGroup(int moneyGroup) {
        this.moneyGroup = moneyGroup;
    }


    void display() {
        System.out.println(id + " " + name +" " + college);
    }
}
