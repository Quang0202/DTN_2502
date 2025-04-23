package Exercise2;

public class Position {
    private int id;
    private String name;

    public Position() {
        System.out.println("Please input position ID:");
        this.id = ScannerUtils.inputInt("Please input a valid position ID as an integer!");

        System.out.println("Please input position name:");
        this.name = ScannerUtils.inputString();
    }

    @Override
    public String toString() {
        return "Position{id=" + id + ", name='" + name + "'}";
    }
}
