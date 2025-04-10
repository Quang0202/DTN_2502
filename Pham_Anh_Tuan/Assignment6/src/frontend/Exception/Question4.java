package frontend.Exception;

public class Question4 {
    private static String[] departments = {"HR", "IT", "Sales"};

    public static void main(String[] args) {
        getIndex(3);
    }

    public static void getIndex(int index) {
        try {
            System.out.println("Department tại vị trí " + index + " là: " + departments[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
    }

}
