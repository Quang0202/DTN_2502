package Exercise1.backend;

import Exercise1.entity.Student;

import java.util.*;

public class Exercise1 {
    public static ArrayList<Student> students = new ArrayList<>();
    public static Set<Student> studentSet = new HashSet<>();
    public static void ques1a() {
        System.out.println(students.size());
    }

    public static void ques1b() {
        System.out.println(students.get(3));
    }

    public static void ques1c() {
        System.out.println(students.getFirst());
        System.out.println(students.getLast());
    }

    public static void ques1d(String name) {
        students.add(0, new Student(name));
    }

    public static void ques1e(String name) {
        students.add(new Student(name));
    }

    public static void ques1f() {
        System.out.println(students.reversed());
    }

    public static Student ques1g(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static ArrayList<Student> ques1h(String name) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public static void ques1i() {
        ArrayList<Student> temp = new ArrayList<>();
        temp = students;
        for (int i = 0; i < students.size(); i++) {
            boolean isChecked = false;
            for (int j = students.size() - 1; j > i; j--) {
                if (students.get(i).getName().equals(students.get(j).getName())) {
                    if (!isChecked) {
                        System.out.println(students.get(i));
                        isChecked = true;
                    }
                    System.out.println(students.get(j));
                    students.remove(students.get(j));
                }
            }
        }
        students = temp;
    }

    public static void ques1k() {
        students.removeIf(student -> student.getId() == 5);
    }

    public void ques2a() {
        Stack<Student> students = new Stack<>();
        students.push(new Student("nvn"));
        students.push(new Student("nvh"));
        students.push(new Student("tvn"));
        students.push(new Student("nva"));

        while (!students.isEmpty()) {
            System.out.println(students.pop());
        }
    }

    public void ques2b() {
        Queue<Student> students = new LinkedList<>();
        students.add(new Student("nvn"));
        students.add(new Student("nvh"));
        students.add(new Student("tvn"));
        students.add(new Student("nva"));

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }

    public void ques5() {
        studentSet.add(new Student("nvn"));
        studentSet.add(new Student("nvh"));
        studentSet.add(new Student("tvn"));
        studentSet.add(new Student("nva"));
        studentSet.add(new Student("nvn"));
        studentSet.add(new Student("nvh"));
        studentSet.add(new Student("tvn"));
        studentSet.add(new Student("nva"));
    }

    public void ques6() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "nvn");
        Student student = new Student(students.get(1));
        for (Student s : studentSet) {
            students.put(s.getId(), s.getName());
        }
    }

    public void ques7() {
        Map<Integer, String> students = new HashMap<>();
        for (Student s : studentSet) {
            students.put(s.getId(), s.getName());
        }
        // in ra key
        students.keySet().forEach(System.out::println);
        // in ra value
        students.values().forEach(System.out::println);

        Set<Map.Entry<Integer, String>> entrySet = students.entrySet();
        Set<Integer> idSet = students.keySet();
        Set<String> nameSet = new HashSet<>();
        nameSet.addAll(students.values());
    }
}
