package model;

public class Student extends Person {
    private String clazz;
    private String group;

    public Student(String name, String clazz){
        super(name);
        this.clazz = clazz;
    }

    public String getGroup() {
        return group;
    }

    protected void setGroup(String group) {
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
}
