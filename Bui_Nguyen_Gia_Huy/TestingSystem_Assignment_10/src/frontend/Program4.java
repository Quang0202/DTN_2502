package frontend;

import backend.Exercise4;

public class Program4 {
    public static void main(String[] args) {
        try {
            Exercise4 exercise4 = new Exercise4();

            // Question 1: Delete employees and department using transaction
            System.out.println("---Question 1: Delete employees and department using transaction---");
            exercise4.deleteEmployeesAndDepartment();

        } catch (Exception e) {
            System.out.println("Error in Program4: " + e.getMessage());
        }
    }
}