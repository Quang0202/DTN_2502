package backend;

import entity.*;

public class Exercise3 {
    // Question 1: T generic (class)
    public void question1() {
        // a) Create student with int id
        GenericStudent<Integer> student1 = new GenericStudent<>(1, "John");
        System.out.println("a) Student with int id: " + student1);

        // b) Create student with float id
        GenericStudent<Float> student2 = new GenericStudent<>(2.5f, "Alice");
        System.out.println("b) Student with float id: " + student2);

        // c) Create student with double id
        GenericStudent<Double> student3 = new GenericStudent<>(3.75, "Bob");
        System.out.println("c) Student with double id: " + student3);
    }

    // Question 2: T generic (method)
    public void question2() {
        // Print different types of data
        print("John Doe"); // String
        print(new Student("Alice")); // Student object
        print(42); // int
        print(3.14); // double
    }

    // Generic print method
    private <T> void print(T data) {
        System.out.println(data);
    }

    // Question 4: E generic
    public void question4() {
        // Create arrays of different numeric types
        Integer[] intArray = {1, 2, 3, 4, 5};
        Float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        Long[] longArray = {100L, 200L, 300L, 400L, 500L};
        Double[] doubleArray = {1.01, 2.02, 3.03, 4.04, 5.05};

        // Print arrays using generic method
        System.out.println("Integer array:");
        printArray(intArray);

        System.out.println("Float array:");
        printArray(floatArray);

        System.out.println("Long array:");
        printArray(longArray);

        System.out.println("Double array:");
        printArray(doubleArray);
    }

    // Generic method to print array elements
    private <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Question 5: E generic (Employee)
    public void question5() {
        // a) Employee with int salaries
        Integer[] intSalaries = {1000, 1200, 1500, 1800, 2000};
        Employee<Integer> employee1 = new Employee<>(1, "John", intSalaries);
        System.out.println("a) Employee with int salaries:");
        employee1.printInfo();
        employee1.printLastSalary();

        // b) Employee with float salaries
        Float[] floatSalaries = {1000.50f, 1200.75f, 1500.25f, 1800.80f, 2000.90f};
        Employee<Float> employee2 = new Employee<>(2, "Alice", floatSalaries);
        System.out.println("\nb) Employee with float salaries:");
        employee2.printInfo();
        employee2.printLastSalary();

        // c) Employee with double salaries
        Double[] doubleSalaries = {1000.55, 1200.78, 1500.29, 1800.88, 2000.99};
        Employee<Double> employee3 = new Employee<>(3, "Bob", doubleSalaries);
        System.out.println("\nc) Employee with double salaries:");
        employee3.printInfo();
        employee3.printLastSalary();
    }

    // Question 6: K & V generic (MyMap)
    public void question6() {
        // Create student with key as ID and value as name
        MyMap<Integer, String> student = new MyMap<>(12345, "John Doe");

        System.out.println("Student ID: " + student.getKey());
        System.out.println("Student Name: " + student.getValue());
    }

    // Question 7: K & V generic (Phone)
    public void question7() {
        // a) Phone with email as key
        Phone<String, String> phone1 = new Phone<>("john.doe@example.com", "123-456-7890");
        System.out.println("a) Phone with email as key:");
        System.out.println("   Email: " + phone1.getKey());
        System.out.println("   Phone Number: " + phone1.getPhoneNumber());

        // b) Phone with sequential number as key
        Phone<Integer, String> phone2 = new Phone<>(1, "987-654-3210");
        System.out.println("\nb) Phone with sequence number as key:");
        System.out.println("   Sequence: " + phone2.getKey());
        System.out.println("   Phone Number: " + phone2.getPhoneNumber());

        // c) Phone with user name as key
        Phone<String, String> phone3 = new Phone<>("Alice Smith", "555-123-4567");
        System.out.println("\nc) Phone with user name as key:");
        System.out.println("   User: " + phone3.getKey());
        System.out.println("   Phone Number: " + phone3.getPhoneNumber());
    }

    // Question 8: K & V generic (Staff)
    public void question8() {
        // Staff with Integer id
        Staff<Integer, String> staff1 = new Staff<>(101, "John Doe");
        System.out.println("Staff with Integer ID:");
        System.out.println("   ID: " + staff1.getId());
        System.out.println("   Name: " + staff1.getName());

        // Staff with Long id
        Staff<Long, String> staff2 = new Staff<>(102L, "Alice Smith");
        System.out.println("\nStaff with Long ID:");
        System.out.println("   ID: " + staff2.getId());
        System.out.println("   Name: " + staff2.getName());
    }
}
