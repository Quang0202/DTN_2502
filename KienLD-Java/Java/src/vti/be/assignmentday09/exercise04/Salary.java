package vti.be.assignmentday09.exercise04;

public class Salary <N extends Number> {


    public Salary(N salary) {
        this.salary = salary;
    }

    public  N getSalary() {
        return salary;
    }

    N salary;


}
