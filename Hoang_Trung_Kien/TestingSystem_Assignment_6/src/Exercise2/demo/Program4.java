package Exercise2.demo;

import Exercise2.entity.Department;
import Exercise2.entity.ScannerUtils;

public class Program4 {
//    static Department[] departments = {new Department(), new Department(), new Department()};

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            getIndex(1);
//        }
//        catch (IndexOutOfBoundsException e) {
//            System.out.println("Cannot find department.");
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        ScannerUtils scannerUtils = new ScannerUtils();
        double num = scannerUtils.inputDouble("error message");
        System.out.println("Số vừa nhập là : "+ num);
    }

    public static void getIndex(int index) {
//        System.out.println(departments[index]);
    }
}
