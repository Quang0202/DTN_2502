package com.company.entity.TestingSystem8;

public class Employee <T extends Number>{
    private int id;
    private String name;
    private T[] salaries;

    public Employee(int id, String name, T[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }
    public void printInfo(){
        System.out.print("ID: " + id + ", Name: " + name + ", Salaries: ");
        for (T salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }
    public void printLastSalary() {
        if (salaries != null && salaries.length > 0) {
            System.out.println("Last Salary of " + name + ": " + salaries[salaries.length - 1]);
        } else {
            System.out.println(name + " has no salary records.");
        }
    }
}
