package Exercise2;

public class Q9_Department {
    private int id;
    private String name;

    public Q9_Department() {
        System.out.println("Please input department ID:");
        this.id = ScannerUtils.inputInt("Please input a valid department ID as an integer!");

        System.out.println("Please input department name:");
        this.name = ScannerUtils.inputString();
    }

    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'}";
    }
}
