package vti.be.assignmentday09.exercise03;

public class q7 {
    public static void main(String[] args) {
        Phone<String, String> phoneemail = new Phone<String, String>("laiduckien28@gmail.com", "0327753618");
        System.out.println(phoneemail.getKey());
        System.out.println(phoneemail.getValue());


        Phone<Integer, String> phonestt = new Phone<Integer, String>(1, "0327753618");
        System.out.println(phonestt.getKey());
        System.out.println(phonestt.getValue());



    }
}
