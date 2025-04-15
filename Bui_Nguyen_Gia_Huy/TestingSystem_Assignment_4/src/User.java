public abstract class User {
    private String name;
    private double salaryRatio;

    public User(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public String getName() { return name; }
    public double getSalaryRatio() { return salaryRatio; }

    public abstract double calculatePay();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary Ratio: " + salaryRatio);
        System.out.println("Pay: " + calculatePay());
    }
}
