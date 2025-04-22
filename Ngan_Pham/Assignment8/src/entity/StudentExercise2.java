package entity;

import java.time.LocalDate;

public class StudentExercise2 implements Comparable<StudentExercise2> {
    private int id;
    private String name;
    private LocalDate birthDate;
    private double score;

    private static int counter = 1;

    public StudentExercise2(String name, LocalDate birthDate, double score) {
        this.id = counter++;
        this.name = name;
        this.birthDate = birthDate;
        this.score = score;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public LocalDate getBirthDate() { return birthDate; }
    public double getScore() { return score; }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-15s | DOB: %s | Score: %.2f", id, name, birthDate, score);
    }

    // Question 1: Sort by name
    @Override
    public int compareTo(StudentExercise2 other) {
        return this.name.compareTo(other.name);
    }
}