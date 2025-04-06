import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Department[] departments = new Department[3];

    public static void main(String[] args) {
        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentName("Sale");

        Department department1 = new Department();
        department1.setDepartmentId(2);
        department1.setDepartmentName("Giám đốc");

        Department department2 = new Department();
        department2.setDepartmentId(3);
        department2.setDepartmentName("Marketing");

        departments = new Department[]{department, department1, department2};

//       question1_2();
//        question3();
        question4();
    }

    public static void question1_2() {
        float result = devide(7, 0);
        System.out.println(result);
    }

    public static float devide(int a, int b) {
        try {
            return a / b;

        } catch (ArithmeticException e) {
            System.out.println("cannot divide 0");
            return 0;
        } finally {
            System.out.println("divide completed");
        }
    }

    public static void question3() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void question4() {
        Department department = getIndex(10);
    }

    private static Department getIndex(int index) {
        try {
            return departments[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
        return null;
    }
}