package backend;

import entity.Exercise2_Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercise2 {
    // Question 1: Comparable
    public void question1() {
        List<StudentComparable> students = createComparableStudents();

        // Sort by name
        Collections.sort(students);

        // Print sorted students
        System.out.println("Students sorted by name:");
        for (StudentComparable student : students) {
            System.out.println("   " + student);
        }
    }

    // Question 2: Comparator
    public void question2() {
        List<Exercise2_Student> students = createStudents();

        // Sort using Comparator
        Collections.sort(students, new StudentComparator());

        // Print sorted students
        System.out.println("Students sorted by name, birthDate, and score:");
        for (Exercise2_Student student : students) {
            System.out.println("   " + student);
        }
    }

    private List<Exercise2_Student> createStudents() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Exercise2_Student> students = new ArrayList<>();

        try {
            students.add(new Exercise2_Student("John", sdf.parse("2000-05-15"), 8.5f));
            students.add(new Exercise2_Student("Alice", sdf.parse("2000-07-10"), 9.0f));
            students.add(new Exercise2_Student("Bob", sdf.parse("1999-12-20"), 7.5f));
            students.add(new Exercise2_Student("John", sdf.parse("2000-05-15"), 9.5f)); // Same name and birthdate, different score
            students.add(new Exercise2_Student("John", sdf.parse("2001-01-01"), 8.0f)); // Same name, different birthdate
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return students;
    }

    private List<StudentComparable> createComparableStudents() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<StudentComparable> students = new ArrayList<>();

        try {
            students.add(new StudentComparable("John", sdf.parse("2000-05-15"), 8.5f));
            students.add(new StudentComparable("Alice", sdf.parse("2000-07-10"), 9.0f));
            students.add(new StudentComparable("Bob", sdf.parse("1999-12-20"), 7.5f));
            students.add(new StudentComparable("Eve", sdf.parse("2001-03-25"), 8.0f));
            students.add(new StudentComparable("Charlie", sdf.parse("2000-10-05"), 7.0f));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return students;
    }

    // Inner class for Comparable implementation
    public class StudentComparable implements Comparable<StudentComparable> {
        private int id;
        private String name;
        private Date birthDate;
        private float score;

        private static int counter = 0;

        public StudentComparable(String name, Date birthDate, float score) {
            this.id = ++counter;
            this.name = name;
            this.birthDate = birthDate;
            this.score = score;
        }

        @Override
        public int compareTo(StudentComparable other) {
            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "', birthDate=" + birthDate + ", score=" + score + "}";
        }
    }

    // Comparator implementation
    public class StudentComparator implements Comparator<Exercise2_Student> {
        @Override
        public int compare(Exercise2_Student s1, Exercise2_Student s2) {
            // Compare by name
            int nameComparison = s1.getName().compareTo(s2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            }

            // If names are equal, compare by birthDate
            int dateComparison = s1.getBirthDate().compareTo(s2.getBirthDate());
            if (dateComparison != 0) {
                return dateComparison;
            }

            // If names and birthdates are equal, compare by score
            return Float.compare(s1.getScore(), s2.getScore());
        }
    }
}
