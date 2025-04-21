package Assigment4_Q6;

public class Waiter extends User {

    public Waiter(String name, double Salary) {
        super(name, Salary);
    }
    @Override
    public double calculatePay() {
        return getSalary() *220;
    }
}
