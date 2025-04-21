package Question03;

public abstract class Student extends Person {
    int id;
    String name;
    public Student() {

    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
    }

    public Student(String name, int id, String name1) {
        super(name);
        this.id = id;
        this.name = name1;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
