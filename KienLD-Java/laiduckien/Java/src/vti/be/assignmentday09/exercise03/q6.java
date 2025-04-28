package vti.be.assignmentday09.exercise03;

public class q6<K, V> {
    public static void main(String[] args) {
        Mymap<Integer, String> Student = new Mymap<Integer, String>(1, "dev");

        System.out.println(Student.getKey());
        System.out.println(Student.getValue());
    }
}
