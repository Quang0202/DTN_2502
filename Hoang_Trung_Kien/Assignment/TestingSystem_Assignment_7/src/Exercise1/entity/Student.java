package Exercise1.entity;

public class Student {
    private int id;
    private String name;
    private static String college;
    private static int moneyGroup;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Student(int id, String name) throws Exception {
        if (count <= 6) {
            this.id = id;
            this.name = name;
            count++;
        } else {
            throw new Exception("Khong duoc tao qua 7 hoc sinh");
        }
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static int getMoneyGroup() {
        return moneyGroup;
    }

    public void chargeMoney(int money) {
        Student.moneyGroup += money;
    }

    public void useMoney(int money) {
        Student.moneyGroup -= money;
    }
}
