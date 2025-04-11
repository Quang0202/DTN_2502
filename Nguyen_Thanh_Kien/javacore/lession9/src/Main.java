import model.CPU;
import model.Student;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        question2();
        exe3Question1();
    }

    @Deprecated
    private static void question1(){
        Date date = new Date("18/05/2020");
    }

    private static void question2(){
        Student student = new Student("Kien");
        System.out.println(student);
        System.out.println(student.getIdNew());
    }

    private static void exe3Question1(){
        CPU cpu = new CPU();
        CPU.Ram ram = cpu.new Ram();
        System.out.println(ram.getClockSpeed());
        CPU.Processor processor = cpu.new Processor();
        System.out.println(processor.getCache());
    }
}