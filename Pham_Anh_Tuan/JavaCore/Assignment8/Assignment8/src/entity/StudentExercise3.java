package entity;

public class StudentExercise3<T> {
    private T id;
    private String name;

    public StudentExercise3(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    @Override
    public String toString() {
        return "StudentExercise3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
