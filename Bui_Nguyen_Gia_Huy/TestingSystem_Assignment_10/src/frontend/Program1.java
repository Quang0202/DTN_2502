package frontend;

import backend.Exercise1;

public class Program1 {
    public static void main(String[] args) throws Exception {
        Exercise1 exercise1 = new Exercise1();

        try {
            // Question 1: Create connection
            exercise1.connectDatabase();

            // Question 2: Print positions
            System.out.println("\n--- POSITIONS LIST ---");
            exercise1.getAllPositions();

            // Question 3: Create position
            System.out.println("\n--- CREATE POSITION ---");
            exercise1.createPosition();

            // Question 4: Update position
            System.out.println("\n--- UPDATE POSITION ---");
            exercise1.updatePositionName();

            // Question 5: Delete position
            System.out.println("\n--- DELETE POSITION ---");
            exercise1.deletePositionById();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}