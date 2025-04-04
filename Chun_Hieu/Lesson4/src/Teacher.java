public class Teacher extends Person {
    private String major;


    public Teacher(int age, String major) {
        super(age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }

    public void gotoSchool() {
        System.out.println("Teacher gotoSchool");
        super.gotoSchool();
    }
}
