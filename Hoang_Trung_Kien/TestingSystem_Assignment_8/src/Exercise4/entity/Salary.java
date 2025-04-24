package Exercise4.entity;

public class Salary <N extends Number> {
    private N salaries;

    public Salary(N salaries) {
        this.salaries = salaries;
    }

    public N getSalaries() {
        return salaries;
    }

    public void setSalaries(N salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salaries=" + salaries +
                '}';
    }


}
