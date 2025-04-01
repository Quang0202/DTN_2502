package model;

public class Waiter extends User {
    private static final int SALARY_COEFICIENT = 220;

    @Override
    public Double calculateSalary() {
        return this.salaryRatio * SALARY_COEFICIENT;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());
    }

    public Waiter(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }

    public Waiter() {
    }
}
