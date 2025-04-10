import java.util.InputMismatchException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void print() throws Test {
        int[] arr = {1, 2, 3};
        if (arr[0] == 1) {
            throw new Test("this is message");
        }
        System.out.println(arr[3]);
    }
    public static void main(String[] args) {
        try {
            print();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("end exception");
        }
        System.out.println("Hello b");
    }
}