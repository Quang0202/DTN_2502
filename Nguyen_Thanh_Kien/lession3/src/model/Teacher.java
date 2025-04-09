package model;

public class Teacher extends Person {
    private String major;

    public Teacher(String name, String major){
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
    public void gotoSchool() {
        System.out.println("Teacher go to school");
        super.gotoSchool();
    }

    @Override
    public void diemDanh() {
        System.out.println(super.getName()+ " Châm công");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }
}
