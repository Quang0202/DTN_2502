package model;

public class HighSchoolStudent extends Student {
    private String clazz;
    private String desiredUniversity;

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        super(id, name);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    public HighSchoolStudent() {
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDesiredUniversity() {
        return desiredUniversity;
    }

    public void setDesiredUniversity(String desiredUniversity) {
        this.desiredUniversity = desiredUniversity;
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "clazz='" + clazz + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
