package model;

import java.util.ArrayList;

public class Student implements IStudent {
    private int id;
    private String name;
    private int group;

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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Student() {
    }

    public Student(int id, int group, String name) {
        this.group = group;
        this.name = name;
        this.id = id;
    }

    @Override
    public void diemDanh(ArrayList<Student> students) {
        students.forEach(student -> {
            System.out.println(student.getName() + " điểm danh");
        });
    }

    @Override
    public void hocBai(ArrayList<Student> students) {
        students.forEach(student -> {
            System.out.println(student.getName() + " đang học bài");
        });
    }

    @Override
    public void donVeSinh(ArrayList<Student> students) {
        students.forEach(student -> {
            System.out.println(student.getName() + " đi dọn vệ sinh");
        });
    }
}
