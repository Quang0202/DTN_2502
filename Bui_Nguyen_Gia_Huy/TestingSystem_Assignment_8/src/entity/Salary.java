package entity;

public class Salary<N extends Number> {
    private N amount;

    public Salary(N amount) {
        this.amount = amount;
    }

    public void printSalary() {
        System.out.println("Current salary: " + amount);
    }
}