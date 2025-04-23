package entity;

public class Student {
    private int id;
    private String name;
    public static String college = "Đại học bách khoa";
    public static int moneyGroup = 0;
    private static int count = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String newCollege) {
        college = newCollege;
    }

    public static int getCount() {
        return count;
    }

    public void study() {
        System.out.println("Đang học bài...");
    }
}
