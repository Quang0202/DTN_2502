package Exercise2;

public class Q4 {
    public static void main(String[] args) {
        Q4_Department[] departments = new Q4_Department[3];
        departments[0] = new Q4_Department(1, "HR");
        departments[1] = new Q4_Department(2, "Marketing");
        departments[2] = new Q4_Department(3, "Finance");

        // Test valid index
        getIndex(departments, 1);

        // Test invalid index
        getIndex(departments, 5);
    }

    public static void getIndex(Q4_Department[] departments, int index) {
        try {
            System.out.println(departments[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
    }
}

