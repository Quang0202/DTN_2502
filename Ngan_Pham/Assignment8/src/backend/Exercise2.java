package backend;

import entity.StudentExercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise2 {
    private List<StudentExercise2> students;

    public Exercise2() {
        students = new ArrayList<>();
        students.add(new StudentExercise2("Nam", LocalDate.of(2001, 5, 10), 8.5));
        students.add(new StudentExercise2("An", LocalDate.of(2000, 3, 25), 7.8));
        students.add(new StudentExercise2("Binh", LocalDate.of(2001, 5, 10), 9.0));
        students.add(new StudentExercise2("Nam", LocalDate.of(2001, 5, 10), 6.5));
        students.add(new StudentExercise2("An", LocalDate.of(2000, 3, 25), 8.2));
    }

    // Question 1: Sort by name (Comparable)
    public void question1() {
        List<StudentExercise2> sortedList = new ArrayList<>(students);
        Collections.sort(sortedList);

        System.out.println("\nQuestion 1: Sort by name:");
        sortedList.forEach(System.out::println);
    }

    public void question2() {
        List<StudentExercise2> sortedList = new ArrayList<>(students);
        sortedList.sort(Comparator
                .comparing(StudentExercise2::getName)
                .thenComparing(StudentExercise2::getBirthDate)
                .thenComparingDouble(StudentExercise2::getScore));

        System.out.println("\nQuestion 2: Sort by name → birthDate → score:");
        sortedList.forEach(System.out::println);
    }
}
