package frontend;

import backend.Exercise3;

public class Program3 {
    public static void main(String[] args) {
        Exercise3 exercise = new Exercise3();

        System.out.println("===== Question 1: T generic (class) =====");
        exercise.question1();

        System.out.println("\n===== Question 2: T generic (method) =====");
        exercise.question2();

        System.out.println("\n===== Question 4: E generic =====");
        exercise.question4();

        System.out.println("\n===== Question 5: E generic (Employee) =====");
        exercise.question5();

        System.out.println("\n===== Question 6: K & V generic (MyMap) =====");
        exercise.question6();

        System.out.println("\n===== Question 7: K & V generic (Phone) =====");
        exercise.question7();

        System.out.println("\n===== Question 8: K & V generic (Staff) =====");
        exercise.question8();
    }
}