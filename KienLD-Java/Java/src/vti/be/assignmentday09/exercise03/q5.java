package vti.be.assignmentday09.exercise03;

import java.util.ArrayList;

public class q5 {
    public static void main(String[] args) {
        ArrayList<Integer> listint = new ArrayList<>();
        listint.add(1); listint.add(2);
        Employee<ArrayList<Integer>> emp1 = new Employee<ArrayList<Integer>>(1, "nguyenmoi", listint);
        q5method(emp1);
        System.out.println(emp1.salary.get(emp1.salary.size()-1));



        // float

        ArrayList<Float> listfloat = new ArrayList<>();
        listfloat.add(1f); listfloat.add(2f);
        Employee<ArrayList<Float>> emp2 = new Employee<ArrayList<Float>>(1, "nguyenmoi", listfloat);
        q5method(emp2);
        System.out.println(emp2.salary.get(emp2.salary.size()-1));
    }
    static <T> void q5method(T  n) {
        System.out.println(n);

    }



}
