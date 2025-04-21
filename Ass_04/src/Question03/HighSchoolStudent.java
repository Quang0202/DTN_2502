package Question03;

public abstract class HighSchoolStudent extends Student{
    int id;
    String name;
    String clazz;
    String desiredUniversity;

    public HighSchoolStudent() {

    }

    public HighSchoolStudent(int id, String name, int age, int id1, String name1, String clazz, String desiredUniversity) {
        super(id, name, age);
        this.id = id1;
        this.name = name1;
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

}
