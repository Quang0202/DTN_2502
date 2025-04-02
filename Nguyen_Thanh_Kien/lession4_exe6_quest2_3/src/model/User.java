package model;

public abstract class User {
    private String name;
    private Double salaryRatio;

    public abstract Double calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalaryRatio() {
        return salaryRatio;
    }

    public void setSalaryRatio(Double salaryRatio) {
        this.salaryRatio = salaryRatio;
    }

    public User(String name, Double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public User() {
    }

    public abstract void displayInfo();
}
