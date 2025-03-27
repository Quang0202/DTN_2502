import static java.lang.Integer.parseInt;

public class Exercise3 {
    public void ques1() {
        Integer salary = 5000;
        float fsalary = salary;
        System.out.printf("%.2f%n", fsalary);
    }

    public void ques2() {
        String c = "1234567";
        Integer a = Integer.valueOf(c);
        int i = a;
        System.out.println(i);
    }

    public void ques3() {
        String str = "1234567";
        int a = parseInt(str);
        System.out.println(a);
    }
}
