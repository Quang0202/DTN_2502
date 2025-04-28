package frontend;

import backend.Exercise3;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        try {
            Exercise3 exercise3 = new Exercise3();
            Scanner scanner = new Scanner(System.in);

            System.out.println("---Question 1: Delete department using stored procedure---");
            System.out.print("Enter department ID to delete: ");
            int departmentId = scanner.nextInt();
            try {
                exercise3.deleteDepartmentUsingProcedure(departmentId);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error in Program3: " + e.getMessage());
        }
    }
}