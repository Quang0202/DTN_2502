package frontend;

import backend.Exercise4;

public class Program4 {
    public static void main(String[] args) {
        Exercise4 exercise = new Exercise4();

        System.out.println("===== Question 1: Salary with bounded type parameter =====");
        exercise.question1();

        System.out.println("\n===== Question 2: MyNumber with bounded type parameter =====");
        exercise.question2();

        System.out.println("\n===== Question 3: Generic max method =====");
        exercise.question3();

        System.out.println("\n===== Question 4: MyMath generic class =====");
        exercise.question4();

        System.out.println("\n===== Question 5: Wildcard ArrayList =====");
        exercise.question5();
    }
}