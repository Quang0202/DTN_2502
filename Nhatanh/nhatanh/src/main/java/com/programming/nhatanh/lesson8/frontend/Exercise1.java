package com.programming.nhatanh.lesson8.frontend;

import com.programming.nhatanh.lesson8.entity.Student;

import java.util.*;

public class Exercise1 {
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Student> studentCopies = new ArrayList<>();
    public static Student findById(int id){
        return students.stream().filter(e -> e.getId() == id).toList().getFirst();
    }


    public static Student findByName(String name){
        return students.stream().filter(e -> Objects.equals(e.getName(), name)).toList().getFirst();
    }

    public static void printDuplicate(){
        Set<Student> duplicates = new HashSet<>();
        Set<Student> seen = new HashSet<>();
        for (Student val : students) {
            if (!seen.add(val)) {
                duplicates.add(val);
            }
        }

        duplicates.forEach(System.out::println);
    }

    public static void main(String[] args)  {

        for (int i = 0; i <= 2; i++){
            Student newStudent = new Student(i, "Nguyễn X");
            students.add(newStudent);
        }

//        a) In ra tổng số phần tử của students
        System.out.println(students.size());
//        b) Lấy phần tử thứ 4 của students
        System.out.println(students.get(4));
//        c) In ra phần tử đầu và phần tử cuối của students
        System.out.println(students.getFirst());
        System.out.println(students.getLast());
//        d) Thêm 1 phần tử vào vị trí đầu của students
        Student newStudent1 = new Student(students.size(), "Nguyễn Y");
        students.addFirst(newStudent1);
//        e) Thêm 1 phần tử vào vị trí cuối của students
        Student newStudent2 = new Student(students.size(), "Nguyễn Y");
        students.addLast(newStudent2);
//        f) Đảo ngược vị trí của students
        Collections.reverse(students);
//        g) Tạo 1 method tìm kiếm student theo id
        System.out.println(findById(1));
//        h) Tạo 1 method tìm kiếm student theo name
        System.out.println(findByName("Nguyễn Y"));
//        i) Tạo 1 method để in ra các student có trùng tên
        printDuplicate();

//        j) Xóa name của student có id = 2;
//        k) Delete student có id = 5;
//        l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies
        for(int i = 0; i < students.size(); i++){
            var current = students.get(i);
            studentCopies.add(current);
            if(current.getId() == 2){
                current.setName("");
            } else if ( current.getId() == 5 ){
                students.remove(i);
            }
        }


    }
}
