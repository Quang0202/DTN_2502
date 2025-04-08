package com.programming.nhatanh.lesson5;

import com.vti.backend.ITuyenSinh;
import com.vti.backend.ThiSinh;

import java.util.ArrayList;
import java.util.Objects;

public class TuyenSinh implements ITuyenSinh {

    ArrayList<ThiSinh> thiSinhArrayList = new ArrayList<>();

    @Override
    public void addStudent(ThiSinh thiSinh) {
        thiSinhArrayList.add(thiSinh);
    }

    @Override
    public void displayStudentInfo() {
        thiSinhArrayList.forEach(System.out::println);
    }

    @Override
    public void findStudent(String id) {
        var result = thiSinhArrayList.stream().filter(e -> Objects.equals(e.getSobaodanh(), id)).findFirst().orElse(null);
        System.out.println(result);
    }
}
