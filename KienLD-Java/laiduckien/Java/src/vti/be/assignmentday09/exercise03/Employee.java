package vti.be.assignmentday09.exercise03;

public class Employee <E> {
    int id;



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, E salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    String name;
    E salary;




}
