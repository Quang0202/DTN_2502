package vti.be.assignmentday09.exercise02;

public class Student implements Comparable<Student>{
    int id;
    public Student(int id, String name, String dateofbirth, float score) {
        this.id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", score=" + score +
                '}';
    }

    String name;
    String dateofbirth;
    float score;
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
