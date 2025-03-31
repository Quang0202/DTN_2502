package model;

public class Manager extends User {
    private static final int SALARY_COEFICIENT = 520;

    public Manager(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }

    public Manager() {
    }

    @Override
    public Double calculateSalary() {
        return this.salaryRatio * SALARY_COEFICIENT;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());
    }
}
