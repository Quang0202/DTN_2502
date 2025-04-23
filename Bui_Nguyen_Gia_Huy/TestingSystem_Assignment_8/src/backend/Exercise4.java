package backend;

import entity.MyMath;
import entity.MyNumber;
import entity.Salary;

import java.util.ArrayList;

public class Exercise4 {
    // Question 1: Salary with bounded type parameter
    public void question1() {
        Salary<Integer> salary1 = new Salary<>(5000);
        System.out.println("Integer salary:");
        salary1.printSalary();

        Salary<Double> salary2 = new Salary<>(6500.75);
        System.out.println("Double salary:");
        salary2.printSalary();
    }

    // Question 2: MyNumber with bounded type parameter
    public void question2() {
        MyNumber<Integer> number1 = new MyNumber<>(42);
        System.out.println("Integer number: " + number1.getNumber());

        MyNumber<Double> number2 = new MyNumber<>(3.14159);
        System.out.println("Double number: " + number2.getNumber());
    }

    // Question 3: Generic max method
    public void question3() {
        System.out.println("Max of 5 and 10: " + findMax(5, 10));
        System.out.println("Max of 3.5f and 2.7f: " + findMax(3.5f, 2.7f));
        System.out.println("Max of 1000L and 2000L: " + findMax(1000L, 2000L));
        System.out.println("Max of 5.5 and 5.6: " + findMax(5.5, 5.6));
    }

    private <T extends Comparable<T>> T findMax(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    // Question 4: MyMath generic class
    public void question4() {
        MyMath<Integer> intMath = new MyMath<>();
        MyMath<Double> doubleMath = new MyMath<>();

        // Test sum methods
        System.out.println("Sum of 2 integers: " + intMath.sum(10, 20));
        System.out.println("Sum of 3 integers: " + intMath.sum(10, 20, 30));
        System.out.println("Sum of 4 integers: " + intMath.sum(10, 20, 30, 40));

        System.out.println("Sum of 2 doubles: " + doubleMath.sum(10.5, 20.7));

        // Test subtraction
        System.out.println("10 - 5 = " + intMath.subtract(10, 5));
        System.out.println("10.5 - 5.2 = " + doubleMath.subtract(10.5, 5.2));

        // Test power function
        System.out.println("2^3 = " + intMath.power(2, 3));
        System.out.println("2.5^2 = " + doubleMath.power(2.5, 2.0));
    }

    // Question 5: Wildcard ArrayList
    public void question5() {
        ArrayList<Object> listWildcards = new ArrayList<>();

        // Add customer information
        listWildcards.add("Nguyễn Văn Nam");
        listWildcards.add(30);
        listWildcards.add("Hà đông, Hà nội");

        // Print customer information
        System.out.println("Customer Information:");
        System.out.println("Name: " + listWildcards.get(0));
        System.out.println("Age: " + listWildcards.get(1));
        System.out.println("Address: " + listWildcards.get(2));
    }
}
