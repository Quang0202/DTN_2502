package backend;

import entity.MyMath;
import entity.MyNumber;
import entity.Salary;

import java.util.ArrayList;

public class Exercise4 {

    public void question1() {
        Salary<Integer> salary = new Salary<>(15000000);
        salary.printSalary();
    }

    public void question2() {
        MyNumber<Float> number = new MyNumber<>(5.5f);
        number.printNumber();
    }

    public void question3() {
        System.out.println("Max of 5 and 10: " + getMax(5, 10));
        System.out.println("Max of 3.2 and 7.9: " + getMax(3.2, 7.9));
    }

    public <T extends Number & Comparable<T>> T getMax(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public void question4() {
        MyMath<Double> myMath = new MyMath<>();
        System.out.println("Sum of 2 numbers: " + myMath.sum(2.5, 3.5));
        System.out.println("Sum of 3 numbers: " + myMath.sum(2.5, 3.5, 4.0));
        System.out.println("Sum of 4 numbers: " + myMath.sum(2.5, 3.5, 4.0, 5.0));
        System.out.println("Subtraction: " + myMath.sub(10.0, 4.0));
        System.out.println("Power: " + myMath.pow(2.0, 3.0));
    }

    public void question5() {
        ArrayList<Object> listWildcards = new ArrayList<>();
        listWildcards.add("Nguyễn Văn A");
        listWildcards.add(30);
        listWildcards.add("Park Jang 98");

        for (Object obj : listWildcards) {
            System.out.println(obj);
        }
    }
}
