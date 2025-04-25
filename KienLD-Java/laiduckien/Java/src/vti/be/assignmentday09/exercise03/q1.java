package vti.be.assignmentday09.exercise03;

public class q1 {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<Integer>(1, "nguyenmoi");
        Student<Float> s2 = new Student<Float>(1.3f, "nguyenmoi");
        Student<Double> s3 = new Student<Double>(1.0000000000006, "nguyenmoi");
        System.out.println(s1 + " " + s2 + " " + s3);
    }

}
