package backend;

import entity.*;

public class Exercise3 {

    public void question1(){
        StudentExercise3<Integer> student1 = new StudentExercise3<>(1, "Ethan");
        StudentExercise3<Float> student2 = new StudentExercise3<>(2.5f, "Labubu");
        StudentExercise3<Double> student3 = new StudentExercise3<>(3.14, "Gigi");

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }


    // Question 2
    public <T> void print(T a) {
        System.out.println(a);
    }

    public void question2() {
        StudentExercise3<Integer> student = new StudentExercise3<>(101, "Stickk");
        print(student);
        print(4);
        print(4.0);
    }

    // Question 4
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void question4() {
        Integer[] ints = {1, 2, 3};
        Float[] floats = {1.1f, 2.2f};
        Long[] longs = {100L, 200L};
        Double[] doubles = {3.14, 4.56};

        printArray(ints);
        printArray(floats);
        printArray(longs);
        printArray(doubles);
    }

    // Question 5
    public void question5() {
        Integer[] intSalaries = {1000, 2000, 3000};
        Float[] floatSalaries = {1500.5f, 2500.5f};
        Double[] doubleSalaries = {2000.75, 3000.80};

        Employee<Integer> e1 = new Employee<>(1, "A", intSalaries);
        Employee<Float> e2 = new Employee<>(2, "B", floatSalaries);
        Employee<Double> e3 = new Employee<>(3, "C", doubleSalaries);

        e1.displayInfo(); e1.displayLastSalary();
        e2.displayInfo(); e2.displayLastSalary();
        e3.displayInfo(); e3.displayLastSalary();
    }

    // Question 6
    public void question6() {
        MyMap<String, String> student = new MyMap<>("SV001", "Nguyen Van A");
        System.out.println("Key: " + student.getKey() + ", Value: " + student.getValue());
    }

    // Question 7
    public void question7() {
        Phone<String> phone1 = new Phone<>("email@gmail.com", "0987654321");
        Phone<Integer> phone2 = new Phone<>(1, "0123456789");
        Phone<String> phone3 = new Phone<>("Nguyen Van B", "0222333444");

        System.out.println("Email Key: " + phone1.getKey() + ", Phone: " + phone1.getPhoneNumber());
        System.out.println("Index Key: " + phone2.getKey() + ", Phone: " + phone2.getPhoneNumber());
        System.out.println("Name Key: " + phone3.getKey() + ", Phone: " + phone3.getPhoneNumber());
    }

    // Question 8
    public void question8() {
        Staff<Integer> staff1 = new Staff<>(101, "Lan");
        Staff<Long> staff2 = new Staff<>(102L, "Mai");

        System.out.println("ID: " + staff1.getId() + ", Name: " + staff1.getName());
        System.out.println("ID: " + staff2.getId() + ", Name: " + staff2.getName());
    }
}
