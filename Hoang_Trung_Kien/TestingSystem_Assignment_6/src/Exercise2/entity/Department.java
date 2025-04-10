package Exercise2.entity;

public class Department {
    ScannerUtils scannerUtils = new ScannerUtils();
    private int id;
    private String name;

    public Department() {
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
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
