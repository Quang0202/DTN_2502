package model1;

public class Teacher extends Person{
    private String major;

    public Teacher(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void doingHomework() {
        System.out.println(super.getName() + " tao bai kiem tra");
    }
}
