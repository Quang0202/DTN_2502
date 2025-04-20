package com.company.entity.TestingSystem8;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private static int idCounter = 1;  // Auto-increment id
    private int id;
    private String name;
    private LocalDate ngaySinh;
    private float diem;

    public Student(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, LocalDate ngaySinh, float diem) {
        this.id = id;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String thongTinStudent() {
        return "Student{id=" + id + ", name='" + name + '\'' +
                ", ngaySinh=" + ngaySinh + ", diem=" + diem + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }
}
