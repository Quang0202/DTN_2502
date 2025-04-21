package Assigment4_Q6;

public abstract class User {
    private String name;
    private double salary;

    public User(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }
    public User() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  abstract double calculatePay() ;

    public void displayInfor() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Icon " + calculatePay());
    }
}
