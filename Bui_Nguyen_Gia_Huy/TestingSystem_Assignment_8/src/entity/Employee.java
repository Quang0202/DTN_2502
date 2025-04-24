package entity;

public class Employee<T> {
    private int id;
    private String name;
    private T[] salaries;

    public Employee(int id, String name, T[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public void printInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Salaries: ");

        for (T salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }

    public void printLastSalary() {
        if (salaries.length > 0) {
            System.out.println("Last salary: " + salaries[salaries.length - 1]);
        } else {
            System.out.println("No salary information available");
        }
    }
}
