package frontend;

public class Question4 {
    static String[] departments = {"HR", "IT", "Sales"};

    public static void main(String[] args) {
        try {
            getIndex(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
    }

    public static void getIndex(int index) {
        System.out.println(departments[index]);
    }

}
