package vti.be.assignmentday09.exercise03;

import java.util.ArrayList;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        q2method(1);
        q2method(1f);

        ArrayList<Integer> listint = new ArrayList<>();
        listint.add(1); listint.add(2);

        ArrayList<Float> listfloat = new ArrayList<>();
        listfloat.add(1f);

        ArrayList<Double> listdouble = new ArrayList<>();
        listdouble.add(1d); listdouble.add(2d); listdouble.add(3d);

        q3method(listint);
        q3method(listfloat);
        q3method(listdouble);




    }

    static <T> void q2method(T parameter) {
        System.out.println(parameter);
    }

    static <T> void q3method(T parameter) {
        System.out.println(parameter);
    }

}
