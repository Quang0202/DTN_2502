package Ex2Q2_SYSTEM5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Student sv = new Student();
        System.out.println("--- Nhập thông tin sinh viên ---");
        sv.inputInfo();

        System.out.println("\n--- Thông tin sinh viên ---");
        sv.showInfo();

        System.out.println("---Xet Hoc Bong----");
        sv.XetDiemtrungbinh();


    }

}
