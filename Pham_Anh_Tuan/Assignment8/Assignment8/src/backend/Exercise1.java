package backend;

import entity.Student;

import java.util.*;

public class Exercise1 {
    private List<Student> listStudents;


    public void question1() {

        listStudents = new ArrayList<>();
        listStudents.add(new Student("Tuan"));
        listStudents.add(new Student("Nai"));
        listStudents.add(new Student("CFM"));
        listStudents.add(new Student("Xu"));
        listStudents.add(new Student("CFM"));
        listStudents.add(new Student("Hold On"));

        System.out.println("Total listStudents: " + listStudents.size());

        System.out.println("4th student: " + listStudents.get(3));

        System.out.println("First student: " + listStudents.get(0));
        System.out.println("Last student: " + listStudents.get(listStudents.size() - 1));

        listStudents.add(0, new Student("NewStart"));

        listStudents.add(new Student("NewEnd"));

        Collections.reverse(listStudents);
        System.out.println("Reversed list:");
        listStudents.forEach(System.out::println);

        searchById(2);

        searchByName("Tuan");

        printDuplicateNames();

        listStudents.stream()
                .filter(s -> s.getId() == 2)
                .findFirst()
                .ifPresent(s -> s.setName(null));

        listStudents.removeIf(s -> s.getId() == 5);

        List<Student> studentCopies = new ArrayList<>(listStudents);
        System.out.println("Copied listStudents:");
        studentCopies.forEach(System.out::println);
    }

    private void searchById(int id) {
        for (Student s : listStudents) {
            if (s.getId() == id) {
                System.out.println("Found by ID: " + s);
                return;
            }
        }
        System.out.println("No student with ID " + id);
    }

    private void searchByName(String name) {
        System.out.println("Students with name \"" + name + "\":");
        for (Student s : listStudents) {
            if (name.equals(s.getName())) {
                System.out.println(s);
            }
        }
    }

    private void printDuplicateNames() {
        System.out.println("Students with duplicate names:");
        List<String> checkedNames = new ArrayList<>();
        for (Student s1 : listStudents) {
            if (s1.getName() == null || checkedNames.contains(s1.getName())) continue;

            int count = 0;
            for (Student s2 : listStudents) {
                if (s1.getName().equals(s2.getName())) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("Name: " + s1.getName() + " appears " + count + " times");
            }

            checkedNames.add(s1.getName());
        }
    }

    public void question2() {
        String[] studentNames = {
                "Nguyễn Văn Nam",
                "Nguyễn Văn Huyên",
                "Trần Văn Nam",
                "Nguyễn Văn A"
        };

        Stack<String> stack = new Stack<>();
        for (String name : studentNames) {
            stack.push(name);
        }
        System.out.println("\na) Sắp xếp từ mới nhất đến sớm nhất (Stack):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue<String> queue = new LinkedList<>();
        for (String name : studentNames) {
            queue.add(name);
        }
        System.out.println("\nb) Sắp xếp từ sớm nhất đến muộn nhất (Queue)");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public void question3() {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Tuan"));
        studentSet.add(new Student("Nai"));
        studentSet.add(new Student("Xu"));
        studentSet.add(new Student("CFM"));
        studentSet.add(new Student("Xu"));

        System.out.println("\nQuestion 3: Set of students (no duplicates):");
        studentSet.forEach(System.out::println);

        System.out.println("Total students in set: " + studentSet.size());

        List<Student> tempList = new ArrayList<>(studentSet);
        if (!tempList.isEmpty()) {
            System.out.println("First student: " + tempList.get(0));
            System.out.println("Last student: " + tempList.get(tempList.size() - 1));
        }

        int targetId = 2;
        for (Student s : studentSet) {
            if (s.getId() == targetId) {
                System.out.println("Found student by ID: " + s);
            }
        }

        // h) Search by name
        String targetName = "CFM";
        for (Student s : studentSet) {
            if (targetName.equals(s.getName())) {
                System.out.println("Found student by name: " + s);
            }
        }

        for (Student s : studentSet) {
            if (s.getId() == 2) {
                s.setName(null);
                break;
            }
        }

        studentSet.removeIf(s -> s.getId() == 3);

        Set<Student> studentCopy = new HashSet<>(studentSet);
        System.out.println("Copied student set:");
        studentCopy.forEach(System.out::println);
    }

    public void question4() {
        Set<String> uniqueNames = new HashSet<>();
        for (Student s : listStudents) {
            if (s.getName() != null) {
                uniqueNames.add(s.getName());
            }
        }

        System.out.println("\nQuestion 4: Unique student names (Set):");
        uniqueNames.forEach(System.out::println);
    }

    public void question5() {
        Set<String> sortedUniqueNames = new TreeSet<>();
        for (Student s : listStudents) {
            if (s.getName() != null) {
                sortedUniqueNames.add(s.getName());
            }
        }

        System.out.println("\nQuestion 5: Sorted unique student names (TreeSet):");
        sortedUniqueNames.forEach(System.out::println);
    }

    public void question6() {
        Map<Integer, String> studentMap = new HashMap<>();
        for (Student s : listStudents) {
            studentMap.put(s.getId(), s.getName());
        }

        System.out.println("\nQuestion 6: Map of students (ID → Name):");
        studentMap.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
    }

    public void question7() {
        Map<Integer, String> studentMap = new HashMap<>();
        for (Student s : listStudents) {
            studentMap.put(s.getId(), s.getName());
        }

        System.out.println("\nQuestion 7a: Keys (student IDs):");
        studentMap.keySet().forEach(System.out::println);

        System.out.println("\nQuestion 7b: Values (student names):");
        studentMap.values().forEach(System.out::println);

        System.out.println("\nQuestion 7c: Students sorted by name:");
        studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.nullsLast(String::compareTo)))
                .forEach(e -> System.out.println("ID: " + e.getKey() + ", Name: " + e.getValue()));

        Set<Map.Entry<Integer, String>> entrySet = studentMap.entrySet();
        System.out.println("\nQuestion 7d: Map converted to Set:");
        entrySet.forEach(entry -> System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue()));
    }

}
