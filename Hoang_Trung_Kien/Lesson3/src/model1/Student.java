package model1;

public class Student extends Person {
    private String clazz;
    private String group;

    public Student(String name, int age, String clazz) {
        super(name, age);
        this.clazz = clazz;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "clazz='" + clazz + '\'' +
                ", group='" + group + '\'' +
                "} " + super.toString();
    }

    @Override
    public void goToSchool() {
        System.out.println("Student go to school");
        super.goToSchool();
    }
}
