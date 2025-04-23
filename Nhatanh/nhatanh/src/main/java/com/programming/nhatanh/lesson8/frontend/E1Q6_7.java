package com.programming.nhatanh.lesson8.frontend;

import com.programming.nhatanh.lesson8.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class E1Q6_7 {
    public static void main(String[] args)  {
        HashMap<Integer, Student> studentMap = new HashMap<Integer,Student>();
        Student newStudent1 = new Student(1, "Nguyễn T");
        Student newStudent2 = new Student(2, "Nguyễn W");
        Student newStudent3 = new Student(3, "Nguyễn A");
        studentMap.put(newStudent1.getId(), newStudent1);
        studentMap.put(newStudent2.getId(), newStudent2);
        studentMap.put(newStudent3.getId(), newStudent3);
        System.out.println(studentMap);

        Set<Integer> keys = studentMap.keySet();
        for(Integer s:keys){
            System.out.println(s);
        }
        System.out.println(studentMap.values());

        Comparator<Student> byName = (Student obj1, Student obj2) -> obj1.getName().compareToIgnoreCase(obj2.getName());

        LinkedHashMap<Integer, Student> sortedMap = studentMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Student>comparingByValue(byName))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);
        Set<Map.Entry<Integer, Student>> entrySet = studentMap.entrySet();
        entrySet.forEach(System.out::println);
    }
}
