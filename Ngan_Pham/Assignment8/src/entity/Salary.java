package entity;

public class Salary<N extends Number> {
    private N value;

    public Salary(N value) {
        this.value = value;
    }

    public void printSalary() {
        System.out.println("Current salary: " + value);
    }
}