import model.Employee;
import model.Student;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        question1();
//        question2();
//        question4();
        question5();
    }

    private static void question1(){
        System.out.println(new Student<Integer>(1,"Kien"));
        System.out.println(new Student<Float>(2.0F,"Kien"));
        System.out.println(new Student<Double>(3.0,"Kien"));
    }

    private static void question2(){
        printValue(new Student<Integer>(1, "Kien"));
        printValue(4);
        printValue(4.0);
    }

    private static void question4(){
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        List<Double> doubles = new ArrayList<>();
        doubles.add(3.5);
        doubles.add(4.0);
        List<Long> longs = new ArrayList<>();
        longs.add(1L);
        longs.add(2L);
        List<Float> floats = new ArrayList<>();
        floats.add(3.5f);
        floats.add(4.0f);
        printArray(ids);
        printArray(doubles);
        printArray(floats);
        printArray(longs);
    }

    private static void question5(){
        List<Integer> salaries = new ArrayList<>();
        salaries.add(1);
        salaries.add(2);
        Employee employee = new Employee<Integer>(1,"Kien", salaries);
        System.out.println(employee.toString());
        System.out.println(employee.getLastSalary());

        List<Float> salariesFloat = new ArrayList<>();
        salariesFloat.add(1.1F);
        salariesFloat.add(2.3F);
        employee = new Employee<Float>(1,"Kien", salariesFloat);
        System.out.println(employee.toString());
        System.out.println(employee.getLastSalary());

        List<Double> salariesDouble = new ArrayList<>();
        salariesDouble.add(1.3);
        salariesDouble.add(2.4);
        employee = new Employee<Double>(1,"Kien", salariesDouble);
        System.out.println(employee.toString());
        System.out.println(employee.getLastSalary());
    }

    private static <T> void printValue(T str){
        System.out.println(str);
    }

    private static <T> void printArray(List<T> list){
        System.out.println(list);
    }
}