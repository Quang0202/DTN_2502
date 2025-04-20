package com.company.backend.TestingSystem8;

import com.company.entity.TestingSystem8.Student;

import java.util.*;

public class Exercise1 {
    public void q1(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("John"));
        students.add(new Student("Alice"));
        students.add(new Student("John"));
        students.add(new Student("Bob"));
        students.add(new Student("John"));
        students.add(new Student("Emma"));

        // a.
        System.out.println("Tổng số student: " + students.size());
        System.out.println("--------------------------------------------------");

        // b
        if (students.size() >= 4) {
            System.out.println("Phần tử thứ 4: " + students.get(3));
        } else {
            System.out.println("Không có phần tử thứ 4.");
        }
        System.out.println("--------------------------------------------------");

        //c
        if (!students.isEmpty()) {
            System.out.println("Phần tử đầu: " + students.get(0));
            System.out.println("Phần tử cuối: " + students.get(students.size() - 1));
        }
        System.out.println("--------------------------------------------------");

        // d
        Student newStudent = new Student("NewFirst");
        students.add(0, newStudent);
        System.out.println("Sau khi thêm phần tử đầu: " + students);
        System.out.println("--------------------------------------------------");

        // e
        Student newStudentLast = new Student("NewLast");
        students.add(newStudentLast);
        System.out.println("Sau khi thêm phần tử cuối: " + students);
        System.out.println("--------------------------------------------------");

        // f
        Collections.reverse(students);
        System.out.println("Sau khi đảo ngược: " + students);
        System.out.println("--------------------------------------------------");

        // g
        findStudentById(students, 2);
        System.out.println("--------------------------------------------------");

        //h
        findStudentByName(students, "Alice");
        System.out.println("--------------------------------------------------");

        // i
        printDuplicateNames(students);
        System.out.println("--------------------------------------------------");

        // j) Xóa name của student có id = 2
        for (Student s: students){
            if (s.getId() == 2){
                s.setName("");
            }
        }
        System.out.println(students);
        System.out.println("--------------------------------------------------");

        //k
        boolean removed = students.removeIf(s -> s.getId() == 5);
        System.out.println(students);
        System.out.println("--------------------------------------------------");

        // l
        ArrayList<Student> studentCopies = new ArrayList<>();
        studentCopies.addAll(students);
        System.out.println("studentCopies: " + studentCopies);
    }

    public void findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Tìm student theo id = " + id + ": " + student);
                return;
            }
        }
        System.out.println("Không tìm thấy student có id = " + id);
    }

    public void findStudentByName(List<Student> students, String name) {
        int count = 0;
        System.out.println("Tìm student theo tên " + name);
        for (Student student : students) {
            if (student.getName() == name) {
                System.out.println(student);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Không tìm thấy student có tên " + name);
        }
    }

    public void printDuplicateNames(List<Student> students) {
        // Sử dụng một list để theo dõi tên đã xử lý
        List<String> processedNames = new ArrayList<>();
        for (Student student : students) {
            String name = student.getName();
            if (!processedNames.contains(name)) {
                findStudentByName(students, name);
                processedNames.add(name);
            }
        }
    }

    public void q2(){
        String[] candidates = {
                "Nguyễn Văn Nam",
                "Nguyễn Văn Huyên",
                "Trần Văn Nam",
                "Nguyễn Văn A"
        };

        Stack<String> stack = new Stack<>();
        for (String candidate : candidates) {
            stack.push(candidate);
        }

        System.out.println("Thứ tự tới của học sinh muộn nhất tới sớm nhất:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue<String> queue = new LinkedList<>();
        for (String candidate : candidates) {
            queue.offer(candidate);
        }

        System.out.println("Thứ tự tới của học sinh sớm nhất tới muộn nhất:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
    public void q3(){
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("John"));
        students.add(new Student("Alice"));
        students.add(new Student("John"));
        students.add(new Student("Bob"));
        students.add(new Student("John"));
        students.add(new Student("Emma"));
        // a.
        System.out.println("a. Tổng số student: " + students.size());
        System.out.println("--------------------------------------------------");

        // b
        List<Student> studentList = new ArrayList<>(students);
        if (studentList.size() >= 4) {
            System.out.println("b. 4th student: " + studentList.get(3));
        }
        System.out.println("--------------------------------------------------");

        // c
        if (!studentList.isEmpty()) {
            System.out.println("c. First: " + studentList.get(0));
            System.out.println("   Last: " + studentList.get(studentList.size() - 1));
        }
        System.out.println("--------------------------------------------------");

        //d
        Student newFirst = new Student("FirstGuy");
        studentList.add(0, newFirst);
        students = new LinkedHashSet<>(studentList);
        System.out.println("d. After adding to head: " + students);
        System.out.println("--------------------------------------------------");

        // e
        Student newLast = new Student("LastGuy");
        studentList.add(newLast);
        students = new LinkedHashSet<>(studentList);
        System.out.println("d. After adding to last: " + students);
        System.out.println("--------------------------------------------------");

        // f
        Collections.reverse(studentList);
        students = new LinkedHashSet<>(studentList);
        System.out.println("f. Reversed: " + students);
        System.out.println("--------------------------------------------------");

        // g
        System.out.println("g. Find by id 3: " + findById(students,3));
        System.out.println("--------------------------------------------------");

        // h
        System.out.println("h. Find by name 'Alice': " + findByName(students, "John"));
        System.out.println("--------------------------------------------------");

        // i
        System.out.println("i. Students with duplicate names:");
        printDuplicatesByName(students);
        System.out.println("--------------------------------------------------");

        // j
        for (Student s : students) {
            if (s.getId() == 2) {
                s.setName(null);
                break;
            }
        }
        System.out.println("j. After clearing name for id=2: " + students);
        System.out.println("--------------------------------------------------");

        // k
        students.removeIf(s -> s.getId() == 5);
        System.out.println("k) After deleting student id=5: " + students);
        System.out.println("--------------------------------------------------");

        // l
        List<Student> studentCopies = new ArrayList<>(students);
        System.out.println("l. studentCopies: " + studentCopies);
    }
    public Student findById(Set<Student> students, int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
    public List<Student> findByName(Set<Student> students, String name) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getName() == name) {
                result.add(s);
            };
        }
        return result;
    }
    public void printDuplicatesByName(Set<Student> students) {
        Map<String, Integer> nameCount = new HashMap<>();
        for (Student s : students) {
            if (s.getName() != null) {
                nameCount.put(s.getName(), nameCount.getOrDefault(s.getName(), 0) + 1);
            }
        }
        for (Student s : students) {
            if (s.getName() != null && nameCount.get(s.getName()) > 1) {
                System.out.println(s);
            }
        }
    }
    public void q4(){
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("John"));
        students.add(new Student("Alice"));
        students.add(new Student("John"));
        students.add(new Student("Bob"));
        students.add(new Student("John"));
        students.add(new Student("Emma"));
        Set<String> uniqueNames = new HashSet<>();
        for (Student s : students) {
            if (s.getName() != null) {
                uniqueNames.add(s.getName());
            }
        }

        System.out.println("Unique student names: " + uniqueNames);
    }
    public void q5(){
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("John"));
        students.add(new Student("Alice"));
        students.add(new Student("John"));
        students.add(new Student("Bob"));
        students.add(new Student("John"));
        students.add(new Student("Emma"));
        Set<String> uniqueNames = new HashSet<>();
        for (Student s : students) {
            if (s.getName() != null) {
                uniqueNames.add(s.getName());
            }
        }

        List<String> sortedUniqueNames = new ArrayList<>(uniqueNames);
        Collections.sort(sortedUniqueNames);

        System.out.println("Sorted unique student names: " + sortedUniqueNames);
    }
    public void q6(){
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("John"));
        students.add(new Student("Alice"));
        students.add(new Student("John"));
        students.add(new Student("Bob"));
        students.add(new Student("John"));
        students.add(new Student("Emma"));
        Set<String> uniqueNames = new HashSet<>();
        Map<Integer, String> studentMap = new HashMap<>();

        for (Student s : students) {
            studentMap.put(s.getId(), s.getName());
        }

        // a
        System.out.println("a. Keys (Student IDs): " + studentMap.keySet());

        // b
        System.out.println("b. Values (Student Names): " + studentMap.values());

        // c
        List<Student> studentList = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();
            studentList.add(new Student(id, name));
        }
        Collections.sort(studentList);

        System.out.println("c. Students sorted by name:");
        for (Student s: studentList) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName());
        }

        // d
        Set<Student> studenSet = new HashSet<>();

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();
            studenSet.add(new Student(id, name));
        }

        System.out.println("d. Set of students (Map entries):");
        for (Student s: studenSet) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName());
        }
    }

}
