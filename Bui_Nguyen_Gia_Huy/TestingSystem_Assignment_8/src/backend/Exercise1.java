package backend;

import entity.Student;

import java.util.*;

public class Exercise1 {
    // Question 1: ArrayList operations
    public void question1() {
        List<Student> students = new ArrayList<>();

        // Create students with some duplicate names
        students.add(new Student("John"));
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("John"));
        students.add(new Student("John"));

        // a) Print total elements
        System.out.println("a) Total elements: " + students.size());

        // b) Get 4th element
        System.out.println("b) 4th element: " + students.get(3));

        // c) Print first and last elements
        System.out.println("c) First element: " + students.get(0));
        System.out.println("   Last element: " + students.get(students.size() - 1));

        // d) Add element to the beginning
        students.add(0, new Student("FirstStudent"));
        System.out.println("d) Added to beginning: " + students.get(0));

        // e) Add element to the end
        students.add(new Student("LastStudent"));
        System.out.println("e) Added to end: " + students.get(students.size() - 1));

        // f) Reverse the list
        Collections.reverse(students);
        System.out.println("f) Reversed list: ");
        for (Student student : students) {
            System.out.println("   " + student);
        }

        // Reverse back for the next operations
        Collections.reverse(students);

        // g) Find student by id
        int searchId = 3;
        Student foundById = findStudentById(students, searchId);
        System.out.println("g) Student with id " + searchId + ": " +
                (foundById != null ? foundById : "Not found"));

        // h) Find students by name
        String searchName = "John";
        List<Student> foundByName = findStudentsByName(students, searchName);
        System.out.println("h) Students with name '" + searchName + "':");
        for (Student student : foundByName) {
            System.out.println("   " + student);
        }

        // i) Print students with duplicate names
        System.out.println("i) Students with duplicate names:");
        findDuplicateNames(students);

        // j) Remove name of student with id = 2
        for (Student student : students) {
            if (student.getId() == 2) {
                student.setName(null);
                System.out.println("j) Removed name of student with id=2: " + student);
                break;
            }
        }

        // k) Delete student with id = 5
        students.removeIf(student -> student.getId() == 5);
        System.out.println("k) Removed student with id=5");

        // l) Create a copy of students
        List<Student> studentCopies = new ArrayList<>(students);
        System.out.println("l) Created studentCopies with " + studentCopies.size() + " elements");
    }

    private Student findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private List<Student> findStudentsByName(List<Student> students, String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName() != null && student.getName().equals(name)) {
                result.add(student);
            }
        }
        return result;
    }

    private void findDuplicateNames(List<Student> students) {
        Map<String, List<Student>> nameMap = new HashMap<>();

        for (Student student : students) {
            if (student.getName() == null) continue;

            nameMap.putIfAbsent(student.getName(), new ArrayList<>());
            nameMap.get(student.getName()).add(student);
        }

        for (Map.Entry<String, List<Student>> entry : nameMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("   Name: " + entry.getKey());
                for (Student student : entry.getValue()) {
                    System.out.println("      " + student);
                }
            }
        }
    }

    // Question 2: Stack & Queue
    public void question2() {
        String[] names = {"Nguyễn Văn Nam", "Nguyễn Văn Huyên",
                "Trần Văn Nam", "Nguyễn Văn A"};

        // a) Print students in reverse order (last to first) using Stack
        System.out.println("a) Students in reverse order (Stack):");
        printStudentsUsingStack(names);

        // b) Print students in original order (first to last) using Queue
        System.out.println("b) Students in original order (Queue):");
        printStudentsUsingQueue(names);
    }

    private void printStudentsUsingStack(String[] names) {
        Stack<String> stack = new Stack<>();

        // Push all names onto the stack
        for (String name : names) {
            stack.push(name);
        }

        // Pop and print names (LIFO order)
        int count = 1;
        while (!stack.isEmpty()) {
            System.out.println("   " + count++ + ". " + stack.pop());
        }
    }

    private void printStudentsUsingQueue(String[] names) {
        Queue<String> queue = new LinkedList<>();

        // Add all names to the queue
        for (String name : names) {
            queue.add(name);
        }

        // Remove and print names (FIFO order)
        int count = 1;
        while (!queue.isEmpty()) {
            System.out.println("   " + count++ + ". " + queue.poll());
        }
    }

    // Question 3: Set operations
    public void question3() {
        Set<Student> studentSet = new HashSet<>();

        // Add students to the set
        studentSet.add(new Student("John"));
        studentSet.add(new Student("Alice"));
        studentSet.add(new Student("Bob"));
        studentSet.add(new Student("John")); // Will still be added as a separate object

        // Print all students
        System.out.println("Students in set:");
        for (Student student : studentSet) {
            System.out.println("   " + student);
        }
    }

    // Question 4: Set with unique names
    public void question4() {
        // Create a set of unique student names
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("John");
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("John"); // Duplicate, will be ignored

        // Print unique names
        System.out.println("Unique student names:");
        for (String name : uniqueNames) {
            System.out.println("   " + name);
        }
    }

    // Question 5: Sorted Set
    public void question5() {
        // Create a sorted set of unique student names
        Set<String> sortedNames = new TreeSet<>();
        sortedNames.add("John");
        sortedNames.add("Alice");
        sortedNames.add("Bob");
        sortedNames.add("Zack");
        sortedNames.add("Eve");

        // Print sorted names
        System.out.println("Sorted unique student names:");
        for (String name : sortedNames) {
            System.out.println("   " + name);
        }
    }

    // Question 6: Map operations
    public void question6() {
        // Create a map with student id as key and name as value
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Alice");
        students.put(3, "Bob");
        students.put(4, "Eve");

        // Print all students
        System.out.println("Students in map:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("   ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    // Question 7: More Map operations
    public void question7() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Alice");
        students.put(3, "Bob");
        students.put(4, "Eve");

        // a) Print keys
        System.out.println("a) Student IDs (keys):");
        for (Integer id : students.keySet()) {
            System.out.println("   " + id);
        }

        // b) Print values
        System.out.println("b) Student names (values):");
        for (String name : students.values()) {
            System.out.println("   " + name);
        }

        // c) Sort by student name
        System.out.println("c) Students sorted by name:");
        students.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println("   ID: " + entry.getKey() + ", Name: " + entry.getValue()));

        // d) Convert map to set
        Set<Map.Entry<Integer, String>> studentEntrySet = students.entrySet();
        System.out.println("d) Map converted to set:");
        for (Map.Entry<Integer, String> entry : studentEntrySet) {
            System.out.println("   " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
