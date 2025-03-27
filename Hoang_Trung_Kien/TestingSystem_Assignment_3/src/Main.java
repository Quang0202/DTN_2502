//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        int ran = exercise1.ques2();
        System.out.printf("%05d%n", ran);

        System.out.printf("%02d%n", ran % 100);

        int a = 10;
        int b = 3;
        System.out.println((float) a/b);

        Exercise2 exercise2 = new Exercise2();
        exercise2.createAccount();

        Exercise3 exercise3 = new Exercise3();
        exercise3.ques1();
        exercise3.ques2();
        exercise3.ques3();
    }
}