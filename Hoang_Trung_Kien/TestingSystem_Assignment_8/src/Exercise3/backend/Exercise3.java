package Exercise3.backend;

import Exercise3.entity.*;

public class Exercise3 {
    public void ques1() {
        Student<Integer> student1 = new Student<>(1, "nguyen van a");
        Student<Float> student2 = new Student<>(1.5f, "nguyen van b");
        Student<Double> student3 = new Student<>(3.6, "nguyen van c");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        print(student1);
        print(4);
        print(4.0);

        Integer[] integers = {1, 2, 3, 4};
        Float[] floats = {1.0f, 2.0f, 3.0f, 4.0f};
        Long[] longs = {1L, 2L, 3L, 5L};
        Double[] doubles = {1.0, 2.0, 6.0, 7.0};
        printArray(integers);
        printArray(floats);
        printArray(longs);
        printArray(doubles);
    }

    public static <T> void print(T a) {
        System.out.println(a);
    }

    public static <E> void printArray(E[] array) {
        for (E a : array) {
            System.out.println(a);
        }
    }

    public void ques5() {
        Employee<Integer> employee1 = new Employee<>(1, "kien", new Integer[]{1, 2, 3});
        Employee<Float> employee2 = new Employee<>(2, "linh", new Float[]{1.0f, 2.0f, 3.0f});
        Employee<Double> employee3 = new Employee<>(3, "hoang", new Double[]{1.0, 2.0, 3.0});

        System.out.println(employee1);
        employee1.printLastMonthSalary();
        System.out.println(employee2);
        employee2.printLastMonthSalary();
        System.out.println(employee3);
        employee3.printLastMonthSalary();
    }

    public void ques6() {
        MyMap<Integer, String> student1 = new MyMap<>(1, "khanh linh");
        Student<Integer> student = new Student<>(student1.getKey(), student1.getValue());
        System.out.println(student);
    }

    public void ques7() {
        Phone<String, String> phone1 = new Phone<>("a@gmail.com", "0942999333");
        Phone<Integer, String> phone2 = new Phone<>(1, "0942999666");
        Phone<String, String> phone3 = new Phone<>("Nguyen van a", "0942888444");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }

    public void ques8() {
        Staff<Integer, String> newStaff = new Staff<>(123, "nguyen van c");
        System.out.println(newStaff);
    }
}
