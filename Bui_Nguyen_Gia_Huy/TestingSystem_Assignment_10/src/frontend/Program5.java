// frontend/Program5.java - For Exercise 5
package frontend;

import backend.JdbcUtils;

public class Program5 {
    public static void main(String[] args) {
        try {
            // Get JdbcUtils instance
            JdbcUtils jdbcUtils = JdbcUtils.getInstance();

            // Question 1: Test connection
            System.out.println("---Question 1: Test connection---");
            jdbcUtils.connect();

            // Question 2: Connect to database
            System.out.println("\n---Question 2: Connect to database---");
            jdbcUtils.connect();
            System.out.println("Connected successfully!");

            // Question 3: Disconnect from database
            System.out.println("\n---Question 3: Disconnect from database---");
            jdbcUtils.disconnect();
            System.out.println("Disconnected successfully!");

        } catch (Exception e) {
            System.out.println("Error in Program5: " + e.getMessage());
        }
    }
}