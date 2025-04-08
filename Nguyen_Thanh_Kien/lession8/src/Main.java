import model.Student;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        question1();
 
    }

    private static void question1() {
        List<Student> students = new ArrayList<Student>();
//        students.add(new Student("James"));
//        students.add(new Student("Peter"));
//        students.add(new Student("Messi"));
//        students.add(new Student("James"));
//        students.add(new Student("Neymar"));
//        students.add(new Student("James"));
//        System.out.println("Size: " + students.size());
//        System.out.println("Number 4: " + students.get(3));
//        System.out.println("First: " + students.get(0) + "\nLast: " + students.get(students.size() - 1));
//        students.add(0, new Student("Neymar"));
//        students.add(students.size(), new Student("Terry"));
//        System.out.println("Size after add 2 student: " + students.size());
//        Collections.reverse(students);
//        System.out.println("List after reverse: " + students);
//        System.out.println("Find Student id = 2 : " + findStudentById(2, students).toString());
//        System.out.println("Find Student name = james : " + findStudentByName("james", students).toString());
//        showStudentDuplicateName(students);
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getId() == 2) {
//                students.get(i).setName("");
//            }
//        }
//        System.out.println("List After Change Name Id = 2 " + students);
//        students.removeIf(student -> student.getId() == 5);
//        System.out.println("List After remove student id = 5" + students);
//        ArrayList<Student> copy = new ArrayList<>(students);
//        System.out.println("List copy: " + copy);

    }

    private static Student findStudentById(int id, List<Student> students) {
        return students.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    private static List<Student> findStudentByName(String name, List<Student> students) {
        return students.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    private static void showStudentDuplicateName(List<Student> students) {
        Set<String> results = new HashSet<>();
        Set<String> temp = new HashSet<>();

        for (Student std : students) {
            if (!temp.add(std.getName())) {
                results.add(std.getName());
            }
        }
        if (!results.isEmpty()) {
            System.out.println("Name duplicated: " + results);
        } else {
            System.out.println("Not have name duplicated.");
        }
    }


}