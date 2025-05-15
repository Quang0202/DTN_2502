package entity;

public class Student {
    private int id;
    private String name;
    public static String college;
    private static int moneyGroup;
    private static int countStudent = 0;
    private static final int MAX_STUDENT = 7;

    public Student(int id, String name) {
        if (countStudent >= MAX_STUDENT) {
            throw new RuntimeException("Chỉ được phép tạo tối đa " + MAX_STUDENT + " học sinh.");
        }
        this.id = id;
        this.name = name;
        countStudent++;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
    }

    public void contributeMoney(int amount) {
        moneyGroup += amount;
        System.out.println(name + " đã đóng quỹ " + amount + "k. Quỹ lớp còn: " + moneyGroup + "k");
    }

    public void spendMoney(int amount, String purpose) {
        if (moneyGroup >= amount) {
            moneyGroup -= amount;
            System.out.println(name + " đã tiêu " + amount + "k để " + purpose + ". Quỹ lớp còn: " + moneyGroup + "k");
        } else {
            System.out.println(name + " không thể tiêu " + amount + "k vì quỹ không đủ!");
        }
    }

    public static void setCollege(String newCollege) {
        college = newCollege;
    }

    public static String getCollege() {
        return college;
    }

    public static int getCountStudent() {
        return countStudent;
    }

    public final void study() {
        System.out.println("Đang học bài...");
    }
}
