
import java.util.Scanner;

public class Program {
    public static void test(){
        System.out.println(1/0);
    }
    public static void print() throws Test {
        int[] arr = {1, 2, 3};
        System.out.println(arr[1]);
        if(arr[0]==1) {
            throw new Test("this is message");
        }

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        System.out.println("next line");
    }
    public static void main(String[] args) {
        try {
            print();
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }

        try {
            print();
        } catch (Test e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello");
    }
}
