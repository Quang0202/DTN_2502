package model;

public class Employee extends User{

    private static final int SALARY_COEFICIENT = 420;

    public Employee(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }

    public Employee() {
    }

    @Override
    public Double calculateSalary() {
        return super.getSalaryRatio() * SALARY_COEFICIENT;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());
    }
}
