package frontend;

import backend.Exercise1;

public class Program1 {
    public static void main(String[] args) {
        Exercise1 exercise = new Exercise1();

        System.out.println("===== Question 1: ArrayList =====");
        exercise.question1();

        System.out.println("\n===== Question 2: Stack & Queue =====");
        exercise.question2();

        System.out.println("\n===== Question 3: Set operations =====");
        exercise.question3();

        System.out.println("\n===== Question 4: Set with unique names =====");
        exercise.question4();

        System.out.println("\n===== Question 5: Sorted Set =====");
        exercise.question5();

        System.out.println("\n===== Question 6: Map operations =====");
        exercise.question6();

        System.out.println("\n===== Question 7: More Map operations =====");
        exercise.question7();
    }
}