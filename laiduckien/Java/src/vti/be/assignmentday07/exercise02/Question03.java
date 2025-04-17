package vti.be.assignmentday07.exercise02;


public class Question03 {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };

            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
