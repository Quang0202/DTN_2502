package com.vti.backend;

import com.vti.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {
    private List<Student> students = new ArrayList<>();
    public Exercise1() {
        students.add(new Student("An"));
        students.add(new Student("Ba"));
        students.add(new Student("An"));
        students.add(new Student("Hieu"));
        students.add(new Student("An"));
    }
    public void questionA(){
        System.out.println("Tổng số phần tử: " + students.size());
    }
    public void questionB(){
        if (students.size() >= 4) {
            System.out.println("Phần tử thứ 4: " + students.get(3));
        } else {
            System.out.println("Không đủ phần tử");
        }
    }
    public void questionC(){
        if(!students.isEmpty()) {
            System.out.println("Phần tử đầu" + students.get(0));
            System.out.println("Phần tử cuối " + students.get(students.size()));
        }
    }
    public void questionD(){
        students.add(0, new Student("Đầu danh sách"));
    }
    public void questionE(){
        students.add(new Student("Cuối danh sách"));
    }
    public void questionF(){
        Collections.reverse(students);
    }
    public Student questionG(int id){
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    public ArrayList<Student> questionH(String name){
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students.add(student);
            }
        }
        return students;
    }
    public void questionI(){
        ArrayList<String> trung = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            String name = students.get(i).getName();
            for(int j = i + 1; j < students.size(); j++){
                if(name.equals(students.get(j).getName()) && !trung.contains(name)){
                    trung.add(name);
                    System.out.println("Tên trùng: " + trung);
                    break;
                }
            }
        }
    }
    public void questionJ(){
        Student s = questionG(2);
        if (s != null) {
            s.setName(null);
        }
    }
    public void questionK(){
        Student s = questionG(5);
        if (s != null) {
            students.remove(s);
        }
    }
    public void questionL(){
        ArrayList<Student> studentCopies = new ArrayList<>(students);
        System.out.println("Bản sao");
        for (Student student : studentCopies) {
            System.out.println(student);
        }
    }
}
