package vti.be.assignmentday09.exercise01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static javax.swing.UIManager.get;

public class Question03 {
    static Set<Student> students = new HashSet<>();

    public static void main(String[] args) {

        students.add(new Student("a"));
        students.add(new Student("b"));
        students.add(new Student("c"));
        students.add(new Student("d"));
        students.add(new Student("d"));
        students.add(new Student("d"));

//        // a
//        System.out.println("tổng số phần tử của students: " + students.size());
//        // b
//        System.out.println("Lấy phần tử thứ 4 của students:" + students.get(3));
//        // c
//        System.out.println("In ra phần tử đầu và phần tử cuối của students: " + students.get(0) + students.get(students.size() - 1));
//
//        // d/e
//        students.add(0, new Student("Dau"));
//        students.add((students.size() -1), new Student("Cuoi"));
//        System.out.println(students);
//
//        // f
//        Collections.reverse(students);
//        System.out.println(students);

//        timkientheoid(1);
//        timkientheoname("c");
//        System.out.println(students);
//        timkiemtentrungnhau();
//        deleteNameID(1);
        System.out.println(students);

        Set<Student> studentCopies  = new HashSet<>();
        for (Student student : students) {
            studentCopies.add(student);
        }

        System.out.println(studentCopies);






    }

    public static void timkientheoid(int id) {
        for (Student student : students) {
            if( student.getId() == id ) {
                System.out.println(student.getId() + " " + student.getName());
            }

        }

    }
    public static void timkientheoname(String name) {
        for (Student student : students) {
            if( student.getName().equals(name) ) {
                System.out.println(student.getId() + " " + student.getName());
            }
        }
    }
    static ArrayList<Student> tentrungnhau = new ArrayList<>();
    public static void timkiemtentrungnhau() {
        for (Student student : students) {
            String name = student.getName();
            int id = student.getId();
            for (Student student1 : students) {
                if( student1.getName().equals(name)  && student1.getId() != id && !tentrungnhau.contains(student) ) {
                    tentrungnhau.add(student);
                }
            }
        }
        for( Student student : tentrungnhau ) {
            System.out.println("DS ten trung nhau:" + student.getId() + " " + student.getName());
        }
    }

    public static void deleteNameID(int id) {
        for (Student student : students) {
            if( student.getId() == id ) {
                student.setName("");
            }
        }
    }
    public static void deleteStudentID(int id) {
        for (Student student : students) {
            if( student.getId() == id ) {
                students.remove(student);
            }
        }
    }






}
