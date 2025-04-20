package com.company.backend.TestingSystem8;

import com.company.entity.TestingSystem8.Employee;
import com.company.entity.TestingSystem8.MyMap;
import com.company.entity.TestingSystem8.Phone;
import com.company.entity.TestingSystem8.Student2;

import java.util.ArrayList;

public class Exercise3 {
    public void q1(){
        Student2<Integer> studentInt = new Student2<>(1, "Nam");
        Student2<Float> studentFloat = new Student2<>(1.2f, "Nam");
        Student2<Double> studentDouble = new Student2<>(1.3, "Nam");
        System.out.println(studentInt);
        System.out.println(studentFloat);
        System.out.println(studentDouble);
    }
    public <T> void print(T a){
        System.out.println(a);
    }
    public void q2(){
        Student2<Integer> studentInt = new Student2<>(1, "Nam");
        print(studentInt);
    }
    public <T> void printArray(T[] array){
        for (T a : array){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public void q4(){
        Integer[] arrayInt = {1, 2, 3, 4, 5, 6};
        printArray(arrayInt);
        Float[] arrayFloat = {1.1f, 1.2f, 1.3f, 1.4f, 1.5f};
        printArray(arrayFloat);
    }
    public void q5(){
        Integer[] intSalaries = {5000, 5200, 5300};
        Employee<Integer> empInt = new Employee<>(1, "Nam", intSalaries);
        empInt.printInfo();
        empInt.printLastSalary();

        Float[] floatSalaries = {4500.5f, 4600.75f, 4700.0f};
        Employee<Float> empFloat = new Employee<>(2, "Lan", floatSalaries);
        empFloat.printInfo();
        empFloat.printLastSalary();

        Double[] doubleSalaries = {6000.0, 6100.5, 6200.75};
        Employee<Double> empDouble = new Employee<>(3, "Huy", doubleSalaries);
        empDouble.printInfo();
        empDouble.printLastSalary();
    }
    public void q6(){
        MyMap<Integer, String> student = new MyMap<>(1001, "Nguyễn Văn Nam");

        student.printInfo();
    }
    public void q7(){
        Phone<String, String> phone1 = new Phone<>("a@gmail.com", "0987654321");
        System.out.println(phone1);
        Phone<Integer, String> phone2 = new Phone<>(1, "0987654321");
        System.out.println(phone2);
        Phone<String, String> phone3 = new Phone<>("Phong", "0987654321");
        System.out.println(phone3);
    }
    public void q8(){
        ArrayList<Object> listWildcards = new ArrayList<>();

        listWildcards.add("Nguyễn Văn Nam");
        listWildcards.add(30);
        listWildcards.add("Hà Đông, Hà Nội");

        for (Object info : listWildcards) {
            System.out.println(info);
        }
    }
}
