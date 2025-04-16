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
}
