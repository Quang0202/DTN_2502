package Assigment4_Q6;

public class Employee extends User {
    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary() * 420;
    }

    @Override
    public String toString() {
        return "Employee{} " + super.toString();
    }
}
