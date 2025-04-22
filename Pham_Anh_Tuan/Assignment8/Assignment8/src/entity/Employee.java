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

    public void displayInfo() {
        System.out.print("ID: " + id + ", Name: " + name + ", Salaries: ");
        for (T salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }

    public void displayLastSalary() {
        if (salaries.length > 0) {
            System.out.println("Last salary: " + salaries[salaries.length - 1]);
        } else {
            System.out.println("No salary data.");
        }
    }
}