public class Student <T> implements Comparable<Student>{
    private static int countId = 0;
    private final int id;
    private String name;
    private T score;


    public int getId() {
        return id;
    }


    public void setScore(T score){
        this.score = score;
    }
    public T getScore(){
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        countId++;
        this.id = countId;
        this.name = name;
    }
    public Student(String name, T score) {
        countId++;
        this.id = countId;
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
