package Exercise2.entity;

public class Position {
    private ScannerUtils scannerUtils = new ScannerUtils();
    private int id;
    private String name;

    public Position() {
        id = scannerUtils.inputInt("vui long nhap so nguyen");
        name = scannerUtils.inputString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
