package Exercise2.demo;

import Exercise2.entity.Department;

public class Program4 {
    static Department[] departments = {new Department(), new Department(), new Department()};

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        try {
            getIndex(1);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getIndex(int index) {
        System.out.println(departments[index]);
    }
}
