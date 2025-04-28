package fontend;

import backend.Exercise4;

public class Program4 {
    public static void main(String[] args) {
        Exercise4 exercise4 = new Exercise4();
        try {
            exercise4.deleteDepartmentAndEmployees();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
