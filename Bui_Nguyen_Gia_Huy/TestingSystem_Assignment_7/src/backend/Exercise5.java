package backend;

import entity.Exercise5_Student;
import entity.MyException;
import utils.IOManager;
import utils.LogUtils;
import utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    // Question 1
    public void question1() {
        try {
            // a) Create 3 students from console input
            List<Exercise5_Student> students = new ArrayList<>();

            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter student " + i + " information:");
                System.out.println("ID: ");
                int id = ScannerUtils.inputInt("Invalid ID. Please enter an integer.");

                System.out.println("Name: ");
                String name = ScannerUtils.inputString();

                students.add(new Exercise5_Student(id, name));
            }

            // b) Write students to file
            StringBuilder content = new StringBuilder();
            for (Exercise5_Student student : students) {
                content.append(student.toString()).append("\n");
            }

            // Create the file if it doesn't exist
            String filePath = "C:\\TestFile\\StudentInformation.txt";
            if (!utils.FileManager.isFileExists(filePath)) {
                utils.FileManager.createNewFile(filePath);
            }

            // Write to file
            IOManager.writeFile(filePath, content.toString(), false);
            System.out.println("Student information written to file successfully.");

            // c) Read the file and print content
            String fileContent = IOManager.readFile(filePath);
            System.out.println("\nFile content:");
            System.out.println(fileContent);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Question 2
    public void question2() {
        try {
            // Deliberately cause an exception
            int[] array = {1, 2, 3};
            System.out.println(array[10]); // This will cause ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            // Create a custom exception and log it
            MyException myException = new MyException(
                    e.getMessage(),
                    "Attempted to access an index outside the array bounds",
                    e.getStackTrace()
            );

            // Log the exception
            LogUtils.writeLog(myException);

            // Read and print the exception from file
            System.out.println("\nReading exception from file:");
            LogUtils.readExceptionFromFile();
        }
    }
}
